package com.ossabaw.msscdemo.repository;

import com.ossabaw.msscdemo.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post,Integer> {
}
