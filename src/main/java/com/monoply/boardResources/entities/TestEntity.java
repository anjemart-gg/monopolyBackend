package com.monoply.boardResources.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "test_table")
@Getter
@Setter
public class TestEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;
}
