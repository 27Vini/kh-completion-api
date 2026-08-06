package com.vinicius.khcompletion.services;

import com.vinicius.khcompletion.dtos.responses.WorldResponse;
import com.vinicius.khcompletion.repositories.WorldRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorldService {
    private final WorldRepository worldRepository;

    @Transactional(readOnly = true)
    public List<WorldResponse> getAll(){
        return this.worldRepository.findAll()
                .stream()
                .map(WorldResponse::fromEntity)
                .toList();
    }
}
