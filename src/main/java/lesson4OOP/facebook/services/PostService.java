package lesson4OOP.facebook.services;

import lesson4OOP.facebook.dao.PostDao;
import lesson4OOP.facebook.model.Post;

import java.util.List;

public class PostService {


    public List<Post> getAllPost() {
        PostDao postDao = new PostDao();
        return postDao.getAllPost();
    }
}
