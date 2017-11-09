package lesson4OOP.facebook.controller;

import lesson4OOP.facebook.model.User;
import lesson4OOP.facebook.services.UserService;

import java.util.List;

public class UserController {

    public static void main(String[] args) {

        UserService userService = new UserService();
        List<User> all = userService.getAll();
        for (User elem : all) {
            System.out.println(elem.getName());
        }
    }
}
