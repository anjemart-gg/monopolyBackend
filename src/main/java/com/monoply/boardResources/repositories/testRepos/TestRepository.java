package com.monoply.boardResources.repositories.testRepos;

import com.monoply.boardResources.entities.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Integer> {
}
