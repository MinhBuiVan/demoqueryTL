package com.example.demoquerytl.service;

import com.example.demoquerytl.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Object[]> findTopTwoAuthorHasMostComposition() {
        return authorRepository.findTopTwoAuthorHasMostComposition();
    }
}
