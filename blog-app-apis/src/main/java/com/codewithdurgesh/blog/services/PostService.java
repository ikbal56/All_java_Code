package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.payloads.PostDto;

public interface PostService {
	
	
	Post createPost(PostDto postDto);
	
	
	Post updatePost(PostDto postDto,Integer postId);
	
	
	void deletePost(Integer postId);
	
	
	Post getPostById(Integer postId);
	
	List<Post> getAllPost(Integer postId);
	
	
	
	

}
