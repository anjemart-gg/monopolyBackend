package com.monoply.boardResources.graphql;

import com.monoply.boardResources.graphql.types.DtoMapper;
import com.monoply.boardResources.graphql.types.Space;
import com.monoply.boardResources.service.SpaceService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
@RequiredArgsConstructor
public class SpaceQueryResolvers {
    private final SpaceService spaceService;
    private final DtoMapper mappings;

    @DgsQuery
    public List<Space> getSpaces(int boardGroup) {
        return spaceService.getSpacesByBoardGroup(boardGroup).stream().map(mappings::toSpace)
                .collect(Collectors.toList());
    }
}
