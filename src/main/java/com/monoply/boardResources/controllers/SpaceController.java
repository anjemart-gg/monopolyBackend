package com.monoply.boardResources.controllers;

import com.google.gson.Gson;
import com.monoply.boardResources.repositories.testRepos.SpaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class SpaceController {

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
