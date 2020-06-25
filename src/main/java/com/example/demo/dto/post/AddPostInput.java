package com.example.demo.dto.post;

import com.example.demo.dto.attachment.AttachmentDTO;
import com.example.demo.dto.category.CategoryDTO;
import com.example.demo.dto.comment.CommentDTO;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class AddPostInput {
    private Long id;
    private String title;
    private String description;
    private Date createDate;
    private int rate;
    List<CommentDTO> comments = new ArrayList<>();
    List<CategoryDTO> categories = new ArrayList<>();
    AttachmentDTO attachmentDTO;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getRate() {
        return rate;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }

    public AttachmentDTO getAttachmentDTO() {
        return attachmentDTO;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }

    public void setAttachmentDTO(AttachmentDTO attachmentDTO) {
        this.attachmentDTO = attachmentDTO;
    }
}
