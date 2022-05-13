package com.ygpuse.invocation;

import com.ygpuse.entity.Person;
import com.ygpuse.entity.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    private final Person personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        /**
         * 只允许访问 setHotOrNotRating 和 所有的 get方法。
         */
        try {
            if (method.getName().equals("setHotOrNotRating") ||
                method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        }catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
