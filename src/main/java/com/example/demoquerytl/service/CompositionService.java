package com.example.demoquerytl.service;

import com.example.demoquerytl.model.Author;
import com.example.demoquerytl.model.Category;
import com.example.demoquerytl.model.Composition;
import com.example.demoquerytl.repository.CompositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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

public List<Object[]> findCompositionInfo() {
//    List<Object[]> results = compositionRepository.findCompositionInfo();
//    List<Composition> details = new ArrayList<>();
//    for (Object[] result : results) {
//        Composition detail = new Composition();
//        detail.setId((Long) result[0]);
//        detail.setName((String) result[1]);
//        detail.setTitle((String) result[2]);
//        detail.setAuthor((Author) result[3]);
//        detail.setCategory((Category) result[4]);
//        detail.setCreatedAt(((LocalDate) result[5]).atStartOfDay());
//        details.add(detail);
//    }
//    return details;
    return compositionRepository.findCompositionInfo();
}

    public List<Composition> findCompositionByKeywordName() {
        return compositionRepository.findCompositionByKeywordName("yêu", "thương", "anh", "em");
    }

    public List<Composition> findCompositionByTitleOrName() {
        return compositionRepository.findCompositionByTitleOrName("yêu", "thương", "anh", "em");
    }
}
