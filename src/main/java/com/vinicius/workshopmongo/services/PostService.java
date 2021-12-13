package com.vinicius.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.workshopmongo.domain.Post;
import com.vinicius.workshopmongo.repository.PostRepository;
import com.vinicius.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
	    return post.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
	}
}
