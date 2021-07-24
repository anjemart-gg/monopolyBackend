package com.monoply.boardResources.service;

import com.monoply.boardResources.entities.SpaceEntity;
import com.monoply.boardResources.repositories.testRepos.SpaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SpaceService {
    private final SpaceRepository spaceRepository;

    public List<SpaceEntity> getAllSpaces() {
        return spaceRepository.findAll();
    }

    public List<SpaceEntity> getSpacesByBoardGroup(int boardGroup) {
        return spaceRepository.findByBoardGroup(boardGroup);
    }
}
