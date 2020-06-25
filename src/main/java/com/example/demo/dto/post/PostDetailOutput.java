package com.example.demo.dto.post;

import com.example.demo.dto.attachment.AttachmentDTO;
import com.example.demo.dto.category.CategoryDTO;
import com.example.demo.dto.comment.CommentDTO;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class PostDetailOutput {
    private Long id;
    private String title;
    private String description;
    private Date createDate;
    private int rate;
    List<CommentDTO> comments = new ArrayList<>();
    List<CategoryDTO> categories = new ArrayList<>();
    AttachmentDTO attachmentDTO;
}
