package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/9/18.
 */
public class PostTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void NewPostObjectGetsCorrectlyCreated_true() throws Exception {
        Post post = new Post("Day 1: Intro");
        assertEquals(true, post instanceof Post);
    }

    @Test
    public void PostInstantiatesWithContent_true() throws Exception {
        Post post = new Post("Day 1: Intro");
        assertEquals("Day 1: Intro", post.getContent());
    }

    @After
    public void tearDown() throws Exception {
        Post.clearAllPosts();
    }

    @Test
    public void AllPostsAreCorrectlyReturned_true() throws Exception {
        Post post = new Post("Day 1: Intro");
        Post otherPost = new Post("How to pair successfully");
        assertEquals(2, Post.getAll().size());
    }

    @Test
    public void AllPostsContainsAllPosts_true() throws Exception {
        Post post = new Post("Day 1: Intro");
        Post otherPost = new Post("How to pair successfully");
        assertTrue(Post.getAll().contains(post));
        assertTrue(Post.getAll().contains(otherPost));
    }
}