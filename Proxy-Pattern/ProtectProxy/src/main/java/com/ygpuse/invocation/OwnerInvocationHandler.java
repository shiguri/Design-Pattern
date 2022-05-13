package com.ygpuse.invocation;

import com.ygpuse.entity.Person;
import com.ygpuse.entity.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    private final Person personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        /**
         * 用户可以调用除 setHotOrNotRating 以外的任何方法。
         */
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(personBean, args);
            }

        }catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
