package com.prolog.prob;

import com.prolog.model.User;

public class CheckUser {

    public static void main(String[] args) {

        User user1 = new User("ashik", 22, "scott street");
        User user2 = new User("ashik", 22, "scott street");

        System.out.println(user1.equals(user2));

    }


}
