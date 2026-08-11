package com.vinicius.khcompletion.services;

import com.vinicius.khcompletion.dtos.responses.EnemyResponse;
import com.vinicius.khcompletion.entities.Enemy;
import com.vinicius.khcompletion.repositories.EnemyRepository;
import com.vinicius.khcompletion.specifications.EnemySpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EnemyService {
    private final EnemyRepository enemyRepository;

    @Transactional(readOnly = true)
    public List<EnemyResponse> getAll(
            Long worldId,
            Long itemId
    ) {
        List<Specification<Enemy>> filters = new ArrayList<>();

        if (worldId != null) {
            filters.add(EnemySpecification.hasWorldId(worldId));
        }

        if (itemId != null) {
            filters.add(EnemySpecification.hasDropItemId(itemId));
        }

        Specification<Enemy> specification = Specification.allOf(filters);

        return enemyRepository.findAll(specification)
                .stream()
                .map(EnemyResponse::fromEntity)
                .toList();
    }
}
