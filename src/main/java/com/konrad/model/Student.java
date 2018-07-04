package com.konrad.model;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.LinkedList;

@Data
public class Student {
    private Sex sex;
    private LinkedList<Sex> sexes;
    private String name;
    private String surname;
    private String country;
    private LinkedHashMap<String, String> countries;
    private String[] system;
    private String[] systems;

    public Student() {
        name = "no data";
        surname = "no data";
        country = "no data";
        sex = Sex.NON;
        countries = fillCountries();
        sexes = fillSexes();
        systems = new String[]{"Windows", "Mac", "Linux"};
    }

    private LinkedList<Sex> fillSexes() {
        LinkedList<Sex> sexOptions = new LinkedList<>();
        sexOptions.add(Sex.MEN);
        sexOptions.add(Sex.WOMEN);
        sexOptions.add(Sex.NON);
        return sexOptions;
    }

    private LinkedHashMap<String, String> fillCountries() {
        LinkedHashMap<String, String> countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("PL", "Poland");
        return countryOptions;
    }
}
