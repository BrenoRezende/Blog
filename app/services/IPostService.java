package services;

import com.google.inject.ImplementedBy;
import models.Post;
import java.util.List;

/**
 * Created by breno on 04/03/17.
 */

@ImplementedBy(PostService.class)
public interface IPostService {
    List<Post> getAll();
}
