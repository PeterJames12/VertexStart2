package lesson4OOP.facebook.data;

import lesson4OOP.facebook.model.Post;
import lesson4OOP.facebook.model.User;

import java.util.LinkedList;
import java.util.List;

public class Database {

    public static List<User> getAll() {
        List<User> list = new LinkedList<>();
        User user = new User();
        user.setName("Aleksandr");
        list.add(user);
        return list;
    }

    public static List<Post> getAllPost() {
        List<Post> list = new LinkedList<>();
        Post post = new Post();
        post.setTitle("Some Title");
        post.setDiscription("Some text for print");
        list.add(post);
        return list;
    }
}
