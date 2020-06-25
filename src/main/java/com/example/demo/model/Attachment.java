package com.example.demo.model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String image;

    @ToString.Exclude
    @OneToOne(mappedBy = "attachment", cascade = CascadeType.ALL)
    Post post;

    public Long getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public Post getPost() {
        return post;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
