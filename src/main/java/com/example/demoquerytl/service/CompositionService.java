package com.example.demoquerytl.service;

import com.example.demoquerytl.model.Composition;
import com.example.demoquerytl.repository.CompositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompositionService {
    @Autowired
    private CompositionRepository compositionRepository;

    public List<Composition> getCompositionByCategoryname(String name) {
        return compositionRepository.findCompositionByCategoryname(name);
    }

    public List<Composition> getCompositionByAuthorname(String name) {
        return compositionRepository.findCompositionByAuthorname(name);
    }

    public List<Composition> getCompositionInfo() {
        return compositionRepository.findCompositionInfo();
    }
}
