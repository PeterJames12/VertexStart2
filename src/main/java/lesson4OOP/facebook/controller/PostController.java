package lesson4OOP.facebook.controller;

import lesson4OOP.facebook.model.Post;
import lesson4OOP.facebook.services.PostService;

import java.util.List;

public class PostController {

    public static void main(String[] args) {

        PostService postService = new PostService();
        List<Post> allPost = postService.getAllPost();
        for (Post elem : allPost) {
            System.out.println(elem.getTitle());
            System.out.println(elem.getDiscription());
        }
    }
}
