package com.monoply.boardResources.graphql.types;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.monoply.boardResources.entities.SpaceEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.mapstruct.Mapper;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;

@Builder(toBuilder = true)
@Getter
@EqualsAndHashCode
@ToString
@JsonAutoDetect(fieldVisibility = ANY, getterVisibility = NONE)
public class Space {
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

    private Integer leftPos;

    private Integer topPos;

    private Integer boardGroup;

}
