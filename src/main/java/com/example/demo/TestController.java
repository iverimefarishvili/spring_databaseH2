package com.example.demo;


import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    AttachmentRepository attachmentRepository;

    @GetMapping("/test")
    public void test() {

//        Student student = new Student();
//        student.setFirstName("giorgi");
//        student.setLastName("giorgadze");
//        student.setUsername("gio");
//        student.setAge(18);
//        //student.setId(1L);
//
//        studentRepository.save(student);
        ;
        List<Category> categories = new ArrayList<>();
        categories.add(categoryRepository.getOne(8L));
        categories.add(categoryRepository.getOne(9L));

        Post post = new Post();
        post.setTitle("პოსტი 7");
        post.setDescription("აღწერა");
        post.setCreateDate(new Date());
        post.setRate(5);
        post.setCategories(categories);

        Attachment attachment = new Attachment();
        attachment.setImage("image.jpg");
        post.setAttachment(attachment);

        postRepository.save(post);
    }

    @GetMapping("/addComment")
    public void addComent() {
        Post post = postRepository.getOne(1L);

        Comment comment = new Comment();
        comment.setText("სატესტო კომენტარი");
        comment.setPost(post);
        commentRepository.save(comment);

    }

    @GetMapping("/addCategory")
    public void addCategory() {
        Category category = new Category();
        category.setTitle("კატეგორია 1");
        Category category1 = new Category();
        category1.setTitle("კატეგორია 2");
        categoryRepository.save(category);
        categoryRepository.save(category1);
    }
}
