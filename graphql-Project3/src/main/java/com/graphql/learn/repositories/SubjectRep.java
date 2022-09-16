package com.graphql.learn.repositories;

import com.graphql.learn.entities.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRep extends JpaRepository<Subjects,Integer> {
}
