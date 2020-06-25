package com.example.demo.service;

import com.example.demo.dto.post.*;

public interface PostService {
    // პოსტის წამოღება
    GetPostOutput getPost(GetPostInput getPostInput);

    // პოსტის დამატება
    AddPostOutput addPost(AddPostInput addPostInput);

    // პოსტის დეტალურად ნახვა
    PostDetailOutput postDetail(PostDetailInput postDetailInput);

    // პოსტის წაშლა
    DeletePostOutput deletePost(DeletePostInput deletePostInput);
}
