package com.smh.onlineclasstest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OnlineClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

}
