package com.prolog.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Staff {

    private String name;
    private int age;
    private String[] position;  //array
    private Map<String, BigDecimal> salary; //map
    private List<String> skills;  //list

    public Staff() {
    }

    @JsonCreator
    public Staff(
            @JsonProperty("name") String name,
            @JsonProperty("age") int age,
            @JsonProperty("position") String[] position,
            @JsonProperty("salary") Map<String, BigDecimal> salary,
            @JsonProperty("skills") List<String> skills) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getPosition() {
        return position;
    }

    public void setPosition(String[] position) {
        this.position = position;
    }

    public Map<String, BigDecimal> getSalary() {
        return salary;
    }

    public void setSalary(Map<String, BigDecimal> salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
