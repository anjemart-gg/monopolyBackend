package com.monoply.boardResources.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "board_resources")
@Getter
@Setter
public class SpaceEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private Integer id;

    private Integer location;

    private String spaceName;

    private Integer price;

    private Integer owner;

    private Integer houseCount;

    private Integer hotelCount;

    private Integer landPrice;

    private Float houseMultiplier;

    private Float hotelMultiplier;

    private Integer mortgageValue;

    private Integer propertyGrouping;

}
