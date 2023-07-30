package com.example.demoquerytl.repository;

import com.example.demoquerytl.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("SELECT ctg " +
            "FROM Category ctg " +
            "INNER JOIN Composition cmp ON ctg.id = cmp.category.id " +
            "GROUP BY ctg " +
            "ORDER BY COUNT(cmp) DESC")
    List<Category> findCategoryWithMostComposition();
    @Query("SELECT c FROM Category c where c.id not in (select distinct comp.category.id from Composition comp)")
    List<Category> findCategoryNoAppearInComposition();
}
