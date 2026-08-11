package com.vinicius.khcompletion.dtos.responses;

import com.vinicius.khcompletion.entities.Enemy;

import java.util.Set;
import java.util.stream.Collectors;

public record EnemyResponse (
    Long id,
    String name,
    String imageUrl,
    Set<WorldResponse> worlds,
    Set<ItemResponse> drops
){
    public static EnemyResponse fromEntity(Enemy enemy){
        Set<WorldResponse> worlds = enemy.getWorlds().stream()
                .map(WorldResponse::fromEntity)
                .collect(Collectors.toSet());

        Set<ItemResponse> drops = enemy.getDrops().stream()
                .map(ItemResponse::fromEntity)
                .collect(Collectors.toSet());

        return new EnemyResponse(enemy.getId(), enemy.getName(), enemy.getImageUrl(), worlds, drops);
    }
}
