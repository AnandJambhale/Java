package com.codewithdurgesh.blog.services.impl;

import com.codewithdurgesh.blog.entities.Categeory;
import com.codewithdurgesh.blog.exceptions.ResourceNotFoundException;
import com.codewithdurgesh.blog.payloads.CategeoryDto;
import com.codewithdurgesh.blog.repositories.CategeoryRepo;
import com.codewithdurgesh.blog.services.CategeoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategeoryServiceImpl implements CategeoryService {

    @Autowired
    private CategeoryRepo categeoryRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategeoryDto createCategeory(CategeoryDto categeoryDto) {
        Categeory categeory=this.modelMapper.map(categeoryDto, Categeory.class);
        Categeory addedCategeory=this.categeoryRepo.save(categeory);

        return this.modelMapper.map(addedCategeory,CategeoryDto.class);
    }

    @Override
    public CategeoryDto updateCategeory(CategeoryDto categeoryDto, Integer categeoryId) {
        Categeory categeory=this.categeoryRepo.findById(categeoryId).orElseThrow(()->new ResourceNotFoundException("Categeory","Categeory Id",categeoryId));
        categeory.setCategeoryTitle(categeoryDto.getCategeoryTitle());
        categeory.setCategeoryDescription(categeoryDto.getCategeoryDescription());

        Categeory updatedCategeory=this.categeoryRepo.save(categeory);
        return modelMapper.map(updatedCategeory,CategeoryDto.class);
    }

    @Override
    public void deleteCategeory(Integer categeoryId) {
        Categeory categeory=this.categeoryRepo.findById(categeoryId).orElseThrow(()->new ResourceNotFoundException("Categeory","Categeory Id",categeoryId));
        this.categeoryRepo.delete(categeory);
    }

    @Override
    public CategeoryDto getCategeory(Integer categeoryId) {
        Categeory categeory=this.categeoryRepo.findById(categeoryId).orElseThrow(()->new ResourceNotFoundException("Categeory","Categeory Id",categeoryId));

        return this.modelMapper.map(categeory,CategeoryDto.class);
    }

    @Override
    public List<CategeoryDto> getAll() {
        List<Categeory> categeories=this.categeoryRepo.findAll();
        List<CategeoryDto>categeoryDtos=categeories.stream().map(categeory -> this.modelMapper.map(categeory,CategeoryDto.class)).collect(Collectors.toList());
        return categeoryDtos;
    }
}
