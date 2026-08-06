package com.vinicius.khcompletion.services;

import com.vinicius.khcompletion.dtos.responses.ChestResponse;
import com.vinicius.khcompletion.repositories.ChestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChestService {
    private final ChestRepository chestRepository;

    @Transactional(readOnly = true)
    public List<ChestResponse> getAllWorldChests(Long worldId){
        return this.chestRepository.findAllByWorldId(worldId)
                .stream()
                .map(ChestResponse::fromEntity)
                .toList();
    }

}
