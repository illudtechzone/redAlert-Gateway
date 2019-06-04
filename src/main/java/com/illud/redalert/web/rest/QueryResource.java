package com.illud.redalert.web.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.illud.redalert.client.red_alert_microservice.api.PostResourceApi;
import com.illud.redalert.client.red_alert_microservice.model.PostDTO;

@RestController
@RequestMapping("/Api")
public class QueryResource {
	
	private final Logger log = LoggerFactory.getLogger(QueryResource.class);
	
	private static final String ENTITY_NAME = "redAlertGateWayPost";
	
	@Autowired
	PostResourceApi postResourceApi;
	
	@GetMapping("posts/user-id")
	public ResponseEntity<List<PostDTO>> getAlldetailsByUserId(@PathVariable String userId,Pageable pageable){
		log.debug("REST request to getAllDetailsByuserId : {}", userId);
		
		ArrayList<Order> list=new ArrayList<Order>();
		pageable.getSort().stream().forEach(list::add);
		List<String> sortlist=new ArrayList<String>();
		list.stream().map(x->x.toString()).forEach(sortlist::add);
		
		return postResourceApi.getAllDetailsByuserIdUsingGET(userId, pageable.getPageNumber(), pageable.getPageSize(), sortlist);
		
	}

}