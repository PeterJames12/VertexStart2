package lesson4OOP.facebook.dao;

import lesson4OOP.facebook.data.Database;
import lesson4OOP.facebook.model.Post;

import java.util.List;

public class PostDao {


    public List<Post> getAllPost() {
        return Database.getAllPost();
    }
}
