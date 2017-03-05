package services;

import com.google.inject.Inject;
import models.Post;
import play.db.*;

import java.util.List;

/**
 * Created by breno on 04/03/17.
 */
public class PostService implements IPostService {

    @Override
    public List<Post> getAll() {
        return Post.find.all();
    }

    @Override
    public Post getById(Long id) {
        return Post.find.byId(id);
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean create(Post post) {
        try {
            Post.db().save(post);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
