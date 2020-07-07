package com.labs.springgraph.demo.repository;

import com.labs.springgraph.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
