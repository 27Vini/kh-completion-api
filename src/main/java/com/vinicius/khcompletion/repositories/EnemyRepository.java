package com.vinicius.khcompletion.repositories;

import com.vinicius.khcompletion.entities.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EnemyRepository extends JpaRepository<Enemy, Long>, JpaSpecificationExecutor<Enemy> {
}
