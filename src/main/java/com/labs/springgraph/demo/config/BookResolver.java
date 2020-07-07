package com.labs.springgraph.demo.config;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.labs.springgraph.demo.model.Book;
import com.labs.springgraph.demo.model.Tutorial;
import com.labs.springgraph.demo.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLResolver<Book> {

    @Autowired
    private TutorialRepository tutorialRepository;

    public Tutorial getTutorial(Book book){
        return tutorialRepository.findById(book.getTutorial().getId()).orElseThrow(null);
    }
}
