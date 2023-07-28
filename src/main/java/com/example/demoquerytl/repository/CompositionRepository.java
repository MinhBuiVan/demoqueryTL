package com.example.demoquerytl.repository;

import com.example.demoquerytl.model.Composition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompositionRepository extends JpaRepository<Composition, Long> {

    @Query("SELECT m FROM Composition m INNER JOIN Category c ON m.category.id = c.id WHERE c.name = :name")
    List<Composition> findCompositionByCategoryname(@Param("name") String name);
    @Query("SELECT m FROM Composition m INNER JOIN Author a ON m.category.id = a.id WHERE a.name = :name")
    List<Composition> findCompositionByAuthorname(String name);
    @Query("SELECT c.id, c.name, c.title, a.name AS author_name, ctg.name AS category_name, c.createdAt " +
            "FROM Composition c " +
            "INNER JOIN Category ctg ON c.category.id = ctg.id " +
            "INNER JOIN Author a ON c.author.id = a.id")
    List<Composition> findCompositionInfo();
}
