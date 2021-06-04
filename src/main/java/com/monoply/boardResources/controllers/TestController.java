package com.monoply.boardResources.controllers;

import com.google.gson.Gson;
import com.monoply.boardResources.entities.SpaceEntity;
import com.monoply.boardResources.entities.TestEntity;
import com.monoply.boardResources.repositories.testRepos.SpaceRepository;
import com.monoply.boardResources.repositories.testRepos.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.gson.GsonBuilderCustomizer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final SpaceRepository spaceRepository;

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/getSpaceInfo")
    @ResponseBody
    public String setVal() {
        return new Gson().toJson(spaceRepository.findAll());
    }
}
