package com.ygpuse;

import com.ygpuse.entity.Person;
import com.ygpuse.entity.PersonBean;
import com.ygpuse.factory.PersonProxyFactory;

public class Main {
    public static void main(String[] args) {
        PersonBean joe = new PersonBean("Joe", Person.Gender.MALE);
        PersonProxyFactory factory = new PersonProxyFactory();
        Person ownProxy = factory.getOwnProxy(joe);
        Person nonOwnProxy = factory.getNonOwnProxy(joe);

        System.out.println(joe.getName() + " 's rating is " + joe.getHotOrNotRating());
        double rating = 10.0;
        try {
            ownProxy.setHotOrNotRating(rating);
        }catch (Exception e) {
            System.out.println("can't set rating from ownerProxy");
        }
        System.out.println(joe.getName() + " 's rating is " + joe.getHotOrNotRating());

        try {
            nonOwnProxy.setInterests("xxx");
        }catch (Exception e) {
            System.out.println("can't set interests from nonOwnProxy");
        }
        nonOwnProxy.setHotOrNotRating(rating);
        System.out.println(joe.getName() + " 's rating is " + joe.getHotOrNotRating());
    }
}
