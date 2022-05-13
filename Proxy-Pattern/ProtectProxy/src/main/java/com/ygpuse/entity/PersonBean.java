package com.ygpuse.entity;

public class PersonBean implements Person{

    private String name;
    private final Gender gender;
    private String interests;
    private double rating;
    private int ratingCount;

    public PersonBean(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.rating = 0.0;
        this.ratingCount = 0;
        this.interests = "default";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public double getHotOrNotRating() {
        return ratingCount == 0 ? 0.0 : rating / (double) ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(double rating) {
        this.rating += rating;
        ratingCount++;
    }
}
