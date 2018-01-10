package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by Guest on 1/9/18.
 */
public class Post {
    private final String content;
    private static ArrayList<Post> instances = new ArrayList<>();
    private boolean published;
    private LocalDateTime createdAt;
    private int id;


    public Post (String content) {
        this.content = content;
        this.published = false;
        this.createdAt = LocalDateTime.now();
        instances.add(this);
        this.id = instances.size();
    }

    public String getContent() {
        return content;
    }



    public static ArrayList<Post> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }

    public boolean getPublished() {
        return this.published;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }

    public static Post findById(int id){
        return instances.get(id-1);
    }
}
