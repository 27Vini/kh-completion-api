package com.vinicius.khcompletion.controllers;

import com.vinicius.khcompletion.dtos.responses.EnemyResponse;
import com.vinicius.khcompletion.services.EnemyService;
import com.vinicius.khcompletion.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constants.API + "enemies")
@RequiredArgsConstructor
public class EnemyController {
    private final EnemyService enemyService;

    @GetMapping
    public List<EnemyResponse> getAll(@RequestParam(required = false) Long worldId, @RequestParam(required = false) Long itemId) {
        return enemyService.getAll(worldId, itemId);
    }
}
