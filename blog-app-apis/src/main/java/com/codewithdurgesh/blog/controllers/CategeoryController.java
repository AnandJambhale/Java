package com.codewithdurgesh.blog.controllers;

import com.codewithdurgesh.blog.payloads.ApiResponse;
import com.codewithdurgesh.blog.payloads.CategeoryDto;
import com.codewithdurgesh.blog.services.CategeoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/categeories")
public class CategeoryController {

    @Autowired
    private CategeoryService categeoryService;

    //create
    @PostMapping("/")
    public ResponseEntity<CategeoryDto> createCategeory(@Valid @RequestBody CategeoryDto categeoryDto){
        CategeoryDto createCategory=this.categeoryService.createCategeory(categeoryDto);
        return new ResponseEntity<CategeoryDto>(createCategory, HttpStatus.CREATED);
    }

    //update
    @PutMapping("/{catId}")
    public ResponseEntity<CategeoryDto> updateCategeory(@Valid @RequestBody CategeoryDto categeoryDto,@PathVariable Integer catId){
        CategeoryDto updateCategeory=this.categeoryService.updateCategeory(categeoryDto,catId);
        return new ResponseEntity<CategeoryDto>(updateCategeory,HttpStatus.OK);
    }

    //delete
    @DeleteMapping("/{catId}")
    public ResponseEntity<ApiResponse> deleteCategeory(@PathVariable Integer catId){
        this.categeoryService.deleteCategeory(catId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("categeory is  deleted successfully!",true),HttpStatus.OK);
    }

    //get
    @GetMapping("/{catId}")
    public ResponseEntity<CategeoryDto> getCategeory(@PathVariable Integer catId){
        CategeoryDto categeoryDto=this.categeoryService.getCategeory(catId);
        return new ResponseEntity<CategeoryDto>(categeoryDto,HttpStatus.OK);
    }

    //get all
    @GetMapping("/")
    public ResponseEntity<List<CategeoryDto>> getCategeories(){
        List<CategeoryDto> categeoryDtos=this.categeoryService.getAll();
        return ResponseEntity.ok(categeoryDtos);
    }
}
