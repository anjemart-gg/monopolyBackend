package com.monoply.boardResources.controllers;

import com.google.gson.Gson;
import com.monoply.boardResources.entities.TestEntity;
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

    private final TestDBController testDBController;
    private final TestRepository testRepository;

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/getAllUsers")
    @ResponseBody
    public String setVal() {
        List<TestEntity> entities = testRepository.findAll();
        String json = new Gson().toJson(entities);
        return json;
    }
}
