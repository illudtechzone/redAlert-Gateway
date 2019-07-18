package com.illud.redalert.client.friends_microservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.redalert.client.friends_microservice.ClientConfiguration;

@FeignClient(name="${friendsMicroservice.name:friendsMicroservice}", url="${friendsMicroservice.url:35.225.108.188:8087/}", configuration = ClientConfiguration.class)
public interface UserControllerApiClient extends UserControllerApi {
}