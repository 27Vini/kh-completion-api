package com.vinicius.khcompletion.repositories;

import com.vinicius.khcompletion.entities.Chest;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChestRepository extends JpaRepository<Chest, Long> {

    @EntityGraph(attributePaths = "item")
    List<Chest> findAllByWorldId(Long worldId);
}
