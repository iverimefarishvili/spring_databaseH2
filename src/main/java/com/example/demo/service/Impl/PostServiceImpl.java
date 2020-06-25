package com.example.demo.service.Impl;

import com.example.demo.dto.post.*;
import com.example.demo.model.Attachment;
import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Override
    public GetPostOutput getPost(GetPostInput getPostInput) {
        List<PostDTO> postDTOList = new ArrayList<>();

        for (Post post : postRepository.findAll()) {
            PostDTO postDTO = new PostDTO();
            postDTO.setId(post.getId());
            postDTO.setTitle(post.getTitle());
            postDTO.setDescription(post.getDescription());
            postDTO.setCreateDate(post.getCreateDate());
            postDTO.setRate(post.getRate());
        }

        GetPostOutput getPostOutput = new GetPostOutput();
        getPostOutput.setPosts(postDTOList);
        return getPostOutput;
    }

    @Override
    public AddPostOutput addPost(AddPostInput addPostInput) {
        Post post = new Post();
        post.setTitle(addPostInput.getTitle());
        post.setDescription(addPostInput.getDescription());
        post.setCreateDate(addPostInput.getCreateDate());
        post.setRate(addPostInput.getRate());

        Attachment attachment = new Attachment();
//        attachment.getImage(addPostInput.getA);
//        post.setAttachment(addPostInput.g);

        postRepository.save(post);
        return null;
    }

    @Override
    public PostDetailOutput postDetail(PostDetailInput postDetailInput) {
        return null;
    }

    @Override
    public DeletePostOutput deletePost(DeletePostInput deletePostInput) {
        return null;
    }
}
