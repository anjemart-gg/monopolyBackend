package com.monoply.boardResources.player;

import com.monoply.boardResources.entities.SpaceEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Player {
    int playerNumber;

    String name;

    Boolean inJail = false;

    int jailTurnCount;

    int space;

    int getOutFreeCount;

    String color;

    int offset;

    List<SpaceEntity> ownedSpaces;

    int bank = 1500;



}
