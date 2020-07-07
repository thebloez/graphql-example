package com.labs.springgraph.demo.config;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.labs.springgraph.demo.model.Author;
import com.labs.springgraph.demo.model.Book;
import com.labs.springgraph.demo.model.Tutorial;
import com.labs.springgraph.demo.repository.AuthorRepository;
import com.labs.springgraph.demo.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TutorialResolver implements GraphQLResolver<Tutorial> {

    @Autowired
    private AuthorRepository authorRepository;

    public Author getAuthor(Tutorial tutorial){
        return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
    }
}
