package com.shresthabinod.shresthabinod.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {
    @JsonProperty("full_name") // mapping the table name full_name with name of object
    private String name;
    private int age;
    private String location;
    private String email;
    private String department;
}
