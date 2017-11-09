package lesson4OOP.facebook.services;

import lesson4OOP.facebook.dao.UserDao;
import lesson4OOP.facebook.model.User;

import java.util.List;

public class UserService {

    public List<User> getAll() {
        UserDao userDao = new UserDao();
        return userDao.getAll();
    }
}
