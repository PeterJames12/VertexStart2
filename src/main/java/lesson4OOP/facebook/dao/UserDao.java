package lesson4OOP.facebook.dao;

import lesson4OOP.facebook.data.Database;
import lesson4OOP.facebook.model.User;

import java.util.List;

public class UserDao {

    public List<User> getAll() {
        return Database.getAll();
    }
}
