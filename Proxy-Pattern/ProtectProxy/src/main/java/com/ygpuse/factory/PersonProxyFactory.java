package com.ygpuse.factory;

import com.ygpuse.entity.Person;
import com.ygpuse.entity.PersonBean;
import com.ygpuse.invocation.NonOwnerInvocationHandler;
import com.ygpuse.invocation.OwnerInvocationHandler;

import java.lang.reflect.Proxy;

public class PersonProxyFactory {
    public Person getOwnProxy(PersonBean personBean) {
        return (Person) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean)
        );
    }

    public Person getNonOwnProxy(PersonBean personBean) {
        return (Person) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean)
        );
    }
}
