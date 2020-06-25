package com.example.demo.service;

import com.example.demo.dto.comment.AddCommentInput;
import com.example.demo.dto.comment.AddCommentOutput;

public interface CommentService {

    // კომენტარის დამატება

    AddCommentOutput addComment(AddCommentInput addCommentInput);
}
