package com.ossabaw.msscdemo.controller;

import com.ossabaw.msscdemo.model.Post;
import com.ossabaw.msscdemo.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository repository) {
        postRepository = repository;
    }

    @GetMapping
    public List<Post> findAll(){
        return postRepository.findAll();
    }

}
