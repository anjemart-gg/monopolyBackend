package com.monoply.boardResources.controllers;

import com.monoply.boardResources.entities.TestEntity;
import com.monoply.boardResources.repositories.testRepos.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TestDBController {
    private final TestRepository testRepository;

    public List<TestEntity> getInfo() {
        return testRepository.findAll();
    }
}
