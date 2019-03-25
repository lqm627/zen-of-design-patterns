package com.lqm.pattern.extra.specification.example;

import java.util.ArrayList;

public interface IUserProvider {
    //根据条件查找用户
    public ArrayList<User> findUser(IUserSpecification userSpec);
}
