package com.example.demo.dto.post;

import java.util.List;

public class GetPostOutput {
    List<PostDTO> posts;

    public List<PostDTO> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDTO> posts) {
        this.posts = posts;
    }
}
