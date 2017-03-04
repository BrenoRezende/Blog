package services;

import com.google.inject.ImplementedBy;
import models.Post;

/**
 * Created by breno on 04/03/17.
 */

@ImplementedBy(PostService.class)
public interface IPostService {
    Post getAll();
}
