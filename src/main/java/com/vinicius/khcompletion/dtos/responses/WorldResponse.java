package com.vinicius.khcompletion.dtos.responses;

import com.vinicius.khcompletion.entities.World;

public record WorldResponse(
        Long id,
        String name,
        String game,
        String imageUrl
) {

    public static WorldResponse fromEntity(World world) {
        return new WorldResponse(world.getId(), world.getName(), world.getGame().getDisplayName(), world.getImageUrl());
    }
}