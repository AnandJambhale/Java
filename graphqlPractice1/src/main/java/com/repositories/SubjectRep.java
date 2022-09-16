package com.repositories;

import com.entities.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRep extends JpaRepository<Subjects,Integer> {
}
