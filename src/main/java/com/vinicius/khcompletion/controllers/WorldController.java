package com.vinicius.khcompletion.controllers;

import com.vinicius.khcompletion.dtos.responses.WorldResponse;
import com.vinicius.khcompletion.services.WorldService;
import com.vinicius.khcompletion.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constants.API + "worlds")
@RequiredArgsConstructor
public class WorldController {
    private final WorldService worldService;

    @GetMapping
    public List<WorldResponse> getAll(){
        return this.worldService.getAll();
    }
}
