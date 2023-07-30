package com.example.demoquerytl.controller;

import com.example.demoquerytl.model.Author;
import com.example.demoquerytl.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/music")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    //f
    @GetMapping("/author/top")
    public List<Object[]> getTopTwoAuthorsHasMostComposition() {
        return authorService.findTopTwoAuthorHasMostComposition();
    }
}
