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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.illud.redalert.client.red_alert_microservice.api.PostResourceApi;
import com.illud.redalert.client.red_alert_microservice.model.PostDTO;
import com.illud.redalert.client.crimestopper_microservice.api.ComplaintResourceApi;
import com.illud.redalert.client.crimestopper_microservice.model.ComplaintDTO;
import com.illud.redalert.client.friends_microservice.api.UserControllerApi;
import com.illud.redalert.client.friends_microservice.model.User;
@RestController
@RequestMapping("/api")
public class QueryResource {
	
	private final Logger log = LoggerFactory.getLogger(QueryResource.class);
	
	private static final String ENTITY_NAME = "redAlertGateWayPost";
	
	@Autowired
	PostResourceApi postResourceApi;
	@Autowired
ComplaintResourceApi complaintResourceApi;
	
	@Autowired
	UserControllerApi userControllerApi;
	
	@GetMapping("posts/user-id")
	public ResponseEntity<List<PostDTO>> getAlldetailsByUserId(@PathVariable String userId,Pageable pageable){
		log.debug("REST request to getAllDetailsByuserId : {}", userId);
		
		ArrayList<Order> list=new ArrayList<Order>();
		pageable.getSort().stream().forEach(list::add);
		List<String> sortlist=new ArrayList<String>();
		list.stream().map(x->x.toString()).forEach(sortlist::add);
		
		return postResourceApi.getAllDetailsByuserIdUsingGET(userId, pageable.getPageNumber(), pageable.getPageSize(), sortlist);
		
	}
	@GetMapping("user/findAllFriends/{userId")
	public ResponseEntity<List<User>> findAllFriendRequest(@PathVariable String userId){
		log.debug("REST request to findAllFriendRequestuserId : {}", userId);
		
		return userControllerApi.findAllFriendRequestsUsingGET(userId);
		
	}
	@GetMapping("user/{userId}")
	public ResponseEntity<List<User>> findFriends(@PathVariable String userId){
		log.debug("REST request to findFriendsRequestuserId : {}", userId);
		return userControllerApi.findFriendsUsingGET(userId);
		
	}
	/*
	 * @GetMapping("user/{userId}/friends/complaints") public
	 * ResponseEntity<Page<ComplaintDTO>> getAllcomplaintsOfFriends(@PathVariable
	 * String userId,Pageable pageable){
	 * log.debug("REST request to getAllDetailsByuserId : {}", userId);
	 * 
	 * 
	 * 
	 * return complaintResourceApi.getAllComplaintsUsingGET(eagerload, offset, page,
	 * pageNumber, pageSize, paged, size, sort, sortSorted, sortUnsorted, unpaged)
	 * 
	 * }
	 */
	/*
	 * @PostMapping("/complaint") public
	 * ResponseEntity<ComplaintDTO>createComplaint(@RequestBody ComplaintDTO
	 * complaintDTO){
	 * log.debug("Entered into gateway method create complaint with request body "
	 * +complaintDTO); return
	 * this.complaintResourceApi.createComplaintUsingPOST(complaintDTO); }
	 */
	
	
	
	

}
