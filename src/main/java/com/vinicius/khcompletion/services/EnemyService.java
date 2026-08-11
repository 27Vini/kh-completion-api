package com.vinicius.khcompletion.services;

import com.vinicius.khcompletion.dtos.responses.EnemyResponse;
import com.vinicius.khcompletion.entities.Enemy;
import com.vinicius.khcompletion.repositories.EnemyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnemyService {
    private final EnemyRepository enemyRepository;

    @Transactional(readOnly = true)
    public List<EnemyResponse> getAll(){
        return this.enemyRepository.findAll()
                .stream()
                .map(EnemyResponse::fromEntity)
                .toList();
    }
}
