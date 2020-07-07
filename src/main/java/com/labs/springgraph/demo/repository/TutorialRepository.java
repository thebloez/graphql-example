package com.labs.springgraph.demo.repository;

import com.labs.springgraph.demo.model.Author;
import com.labs.springgraph.demo.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    @Query("select t from Tutorial t where t.author.id = ?1")
    Iterable<Tutorial> findTutorialsByAuthorId(Long idAuthor);
}
