package com.labs.springgraph.demo.repository;

import com.labs.springgraph.demo.model.Author;
import com.labs.springgraph.demo.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
