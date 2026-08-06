package com.vinicius.khcompletion.repositories;

import com.vinicius.khcompletion.entities.World;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorldRepository extends JpaRepository<World, Long> {
}
