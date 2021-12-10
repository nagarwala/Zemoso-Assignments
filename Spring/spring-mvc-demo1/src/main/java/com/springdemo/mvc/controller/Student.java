package com.springdemo.mvc.controller;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private  String country;

    private LinkedHashMap<String,String> countryOptions;
    private String favouriteLanguage;
    private String[] operatingSystems;

    public Student(){

        countryOptions = new LinkedHashMap<>();

        countryOptions.put("RS","Russia");
        countryOptions.put("BR","Brazil");
        countryOptions.put("IN","India");
        countryOptions.put("CN","China");
        countryOptions.put("GE","Germany");
        countryOptions.put("JN","Japan");

    }

    // getter and setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }


}
