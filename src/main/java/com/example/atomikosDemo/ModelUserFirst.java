package com.example.atomikosDemo;

import java.util.UUID;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ModelUserFirst {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String password;

}
