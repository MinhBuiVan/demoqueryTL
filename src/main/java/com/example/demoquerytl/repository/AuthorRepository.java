package com.example.demoquerytl.repository;

import com.example.demoquerytl.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query(value = "SELECT a.name, COUNT(c.id) AS numCompositions " +
            "FROM Author a " +
            "JOIN Composition c ON a.id = c.id_author " +
            "GROUP BY a.id " +
            "ORDER BY numCompositions DESC LIMIT 2", nativeQuery = true)
    List<Object[]> findTopTwoAuthorHasMostComposition();
}
