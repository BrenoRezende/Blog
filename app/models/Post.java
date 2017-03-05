package models;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by breno on 04/03/17.
 */

@Entity
public class Post extends Model{

    @Id
    public Long id;

    @Constraints.Required
    public String headerImage;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String subtitle;

    @Constraints.Required
    public String text;

    @Formats.DateTime(pattern = "dd/MM/yyyy")
    public Date pubDate = new Date();

    public static Finder<Long, Post> find = new Finder<Long, Post>(Post.class);

}
