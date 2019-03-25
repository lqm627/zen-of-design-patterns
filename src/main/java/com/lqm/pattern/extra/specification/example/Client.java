package com.lqm.pattern.extra.specification.example;

import java.util.ArrayList;

/**
 * 通过for循环遍历一个动态数组，判断用户是否符合条件，将符合条件的用户放置到另外
 * 一个数组中，比较简单。我们编写场景类来模拟该情景，如代码清单38-4所示。
 * 代码清单38-4场景类
 */

public class Client {
    public static void main(String[] args) {
        //首先初始化一批用户
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("苏大", 3));
        userList.add(new User("牛二", 8));
        userList.add(new User("张三", 10));
        userList.add(new User("李四", 15));
        userList.add(new User("王五", 18));
        userList.add(new User("赵六", 20));
        userList.add(new User("马七", 25));
        userList.add(new User("杨八", 30));
        userList.add(new User("侯九", 35));
        userList.add(new User("布十", 40));
        //定义一个用户查询类
        IUserProvider userProvider = new UserProvider(userList);
        //打印出年龄大于20岁的用户
//        System.out.println("===年龄大于20岁的用户===");
//        //定义一个规格书
//        IUserSpecification userSpec = new UserByAgeThan(20);
//        System.out.println("===名字包含国庆的人员===");
//        //定义一个规格书
//        IUserSpecification userSpec = new UserByNameLike("%国庆%");
//        for (User u : userProvider.findUser(userSpec)) {
//            System.out.println(u);
//        }
        //定义一个规格书
        IUserSpecification spec = new UserByAgeThan(25);
        IUserSpecification spec2 = new UserByNameLike("%国庆%");
        for (User u : userProvider.findUser(spec.and(spec2))) {
            System.out.println(u);
        }
    }
}
