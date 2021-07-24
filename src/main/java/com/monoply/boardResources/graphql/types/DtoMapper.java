package com.monoply.boardResources.graphql.types;

import com.monoply.boardResources.entities.SpaceEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DtoMapper {
    Space toSpace(SpaceEntity input);
}
