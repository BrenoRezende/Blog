package controllers;

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

    public Result details(int id) {

        Post post = new Post();

        if (id == 1) {
            post.setHeaderImage("images/posts-bg.jpg");
            post.setTitle("Welcome");
            post.setSubtitle("That's my first post");
            post.setText("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque\n" +
                    "        laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto\n" +
                    "        beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut\n" +
                    "        odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.\n" +
                    "        Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet");
        }

        return ok(details.render(post));
    }
}
