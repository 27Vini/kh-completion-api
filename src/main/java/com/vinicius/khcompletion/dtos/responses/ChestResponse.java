package com.vinicius.khcompletion.dtos.responses;

import com.vinicius.khcompletion.entities.Chest;

public record ChestResponse (
    Long id,
    String location,
    ItemResponse item
)
{
    public static ChestResponse fromEntity(Chest chest){
        return new ChestResponse(chest.getId(), chest.getLocation(), ItemResponse.fromEntity(chest.getItem()));
    }
}
