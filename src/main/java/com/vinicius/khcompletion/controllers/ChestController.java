package com.vinicius.khcompletion.controllers;

import com.vinicius.khcompletion.dtos.responses.ChestResponse;
import com.vinicius.khcompletion.services.ChestService;
import com.vinicius.khcompletion.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constants.API + "chests")
@RequiredArgsConstructor
public class ChestController {
    private final ChestService chestService;

    @GetMapping
    public List<ChestResponse> getAllByWorldId(@RequestParam Long worldId){
        return this.chestService.getAllWorldChests(worldId);
    }

}
