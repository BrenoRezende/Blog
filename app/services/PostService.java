package services;

import com.google.inject.Inject;
import models.Post;
import play.db.*;

import java.util.List;

/**
 * Created by breno on 04/03/17.
 */
public class PostService implements IPostService {

    private Database db;

    @Inject
    public PostService(Database db) {
        this.db = db;
    }

    @Override
    public List<Post> getAll() {

        return null;
    }

}
