package controllers;

import javafx.geometry.Pos;
import models.Post;
import play.mvc.*;
import services.*;
import com.google.inject.Inject;
import views.html.post.*;

import java.util.List;

/**
 * Created by breno on 04/03/17.
 */

public class PostController extends Controller {

    private IPostService postService;

    @Inject
    public PostController(IPostService postService) {
        this.postService = postService;
    }

    public Result index () {
        List<Post> posts = this.postService.getAll();
        return ok(index.render());
    }

    public Result details(Long id) {
        Post post = this.postService.getById(id);
        if (post == null) {
            post = new Post();
        }
        return ok(details.render(post));
    }

    public Result create() {
        Post post = new Post();
        post.title = "Sample Post";
        post.subtitle = "This is the first post";
        post.headerImage = "images/posts-bg.jpg";
        post.text = "This is my first post, and I like to thanks everybody that support me in this project." +
                "Fist of all, I want to thanks the people from my work, because of them, i took the necessary courage" +
                "to create this Blog." +
                "Thank you, guys.";
        this.postService.create(post);
        return ok();
    }

}
