package com.vinicius.khcompletion.services;

import com.vinicius.khcompletion.dtos.responses.ChestResponse;
import com.vinicius.khcompletion.exceptions.ResourceNotFoundException;
import com.vinicius.khcompletion.repositories.ChestRepository;
import com.vinicius.khcompletion.repositories.WorldRepository;
import com.vinicius.khcompletion.util.IdValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChestService {
    private final ChestRepository chestRepository;
    private final WorldRepository worldRepository;

    @Transactional(readOnly = true)
    public List<ChestResponse> getAllWorldChests(Long worldId){
        IdValidator.validateId(worldId);

        if(!worldRepository.existsById(worldId)){
            throw new ResourceNotFoundException("World not found with ID: " + worldId);
        }

        return this.chestRepository.findAllByWorldId(worldId)
                .stream()
                .map(ChestResponse::fromEntity)
                .toList();
    }

}
