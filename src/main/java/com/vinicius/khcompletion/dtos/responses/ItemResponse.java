package com.vinicius.khcompletion.dtos.responses;

import com.vinicius.khcompletion.entities.Item;

public record ItemResponse (
        Long id,
        String name,
        String imageUrl
){
    public static ItemResponse fromEntity(Item item){
        return new ItemResponse(item.getId(), item.getName(), item.getImageUrl());
    }
}
