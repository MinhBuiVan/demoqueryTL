package com.example.demoquerytl.controller;

import com.example.demoquerytl.model.Composition;
import com.example.demoquerytl.service.CompositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/music")
public class CompositionController {
    @Autowired
    private CompositionService compositionService;

    @GetMapping("/composition/category")
    public List<Composition> getAllCompositionsByCategoryname(@RequestParam String name) {
        return compositionService.getCompositionByCategoryname(name);
    }

    @GetMapping("/composition/author")
    public List<Composition> getAllCompositionByAuthorname(@RequestParam String name) {
        return compositionService.getCompositionByAuthorname(name);
    }

    @GetMapping("/composition/info")
    public List<Composition> getAllCompositionInfo() {
        return compositionService.getCompositionInfo();
    }

}
