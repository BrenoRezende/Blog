package services;

import com.avaje.ebean.EbeanServer;
import com.google.inject.Inject;
import models.Post;

import java.util.List;

/**
 * Created by breno on 04/03/17.
 */
public class PostService implements IPostService {

    private EbeanServer db;

    @Inject
    public PostService(EbeanServer db) {
        this.db = db;
    }

    @Override
    public List<Post> getAll() {
        return db.find(Post.class).findList();
    }

    @Override
    public Post getById(Long id) {
        return db.find(Post.class, id);
    }

    @Override
    public boolean delete(Long id) {
        try {
            db.delete(Post.class, id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean create(Post post) {
        try {
            db.save(post);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
