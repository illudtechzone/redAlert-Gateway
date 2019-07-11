package com.illud.redalert.web.rest;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.illud.redalert.client.red_alert_microservice.api.PostResourceApi;
import com.illud.redalert.client.red_alert_microservice.model.PostDTO;
import com.illud.redalert.web.rest.errors.BadRequestAlertException;
import com.illud.redalert.web.rest.util.HeaderUtil;
import com.illud.redalert.client.friends_microservice.api.UserControllerApi;
import com.illud.redalert.client.friends_microservice.model.User;
@RestController
@RequestMapping("/api")
public class CommandResource {
	
	private final Logger log = LoggerFactory.getLogger(CommandResource.class);
	
	private static final String ENTITY_NAME = "redAlertGateWayPost";
	
	@Autowired
	PostResourceApi postResourceApi;
	@Autowired 
	UserControllerApi userControllerApi;
	
	@PostMapping("/posts/create")
	public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO postDTO) {
		log.debug("redAlertgateway createPostUsingPOST {pppp} :", postDTO );
		if (postDTO.getId() != null) {
            throw new BadRequestAlertException("A new post cannot already have an ID", ENTITY_NAME, "idexists");
        }
		ResponseEntity<PostDTO> result = postResourceApi.createPostUsingPOST(postDTO);
		return result;
	}
	@DeleteMapping("/posts/delete")
	public ResponseEntity<Void> deletePost(@PathVariable Long id){
		log.debug("redAlertgateway deletePOST {pppp} :", id );
		/* ResponseEntity<Void> result = */ 
		return postResourceApi.deletePostUsingDELETE(id);
	}
	
	@PostMapping("/user")
	public ResponseEntity<User>createUser(@RequestBody User user){
	
		return userControllerApi.createUserUsingPOST(user);
		
	}
}
