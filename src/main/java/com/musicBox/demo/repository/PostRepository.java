package com.musicBox.demo.repository;

import com.musicBox.demo.model.Post;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}


