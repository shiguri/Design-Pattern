package com.ygpuse.entity;

public interface Person {
    enum Gender {MALE, FEMALE};

    String getName();
    String getInterests();
    Gender getGender();
    double getHotOrNotRating();

    void setName(String name);
    void setInterests(String interests);
    void setHotOrNotRating(double rating);
}
