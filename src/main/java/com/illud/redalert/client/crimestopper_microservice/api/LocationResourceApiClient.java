package com.illud.redalert.client.crimestopper_microservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.redalert.client.crimestopper_microservice.ClientConfiguration;

@FeignClient(name="${crimestopperMicroservice.name:crimestopperMicroservice}", url="${crimestopperMicroservice.url:35.225.108.188:8084/crimestopper}", configuration = ClientConfiguration.class)
public interface LocationResourceApiClient extends LocationResourceApi {
}