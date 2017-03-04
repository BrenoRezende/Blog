package app.controllers;

import app.services.PostService;

/**
 * Created by breno on 04/03/17.
 */
public class PostController extends Controller {

    private PostService _postService;

    public PostController(IPostService postService) {
        _postService = postService;
    }

    public Result index () {

    }
}
