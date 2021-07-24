package com.monoply.boardResources.repositories.testRepos;

import com.monoply.boardResources.entities.SpaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpaceRepository extends JpaRepository<SpaceEntity, Integer> {
    List<SpaceEntity> findByBoardGroup(int boardGroup);
}
