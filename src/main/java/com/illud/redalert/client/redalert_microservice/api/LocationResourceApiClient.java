package com.illud.redalert.client.redalert_microservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.redalert.client.redalert_microservice.ClientConfiguration;

@FeignClient(name="${redalertMicroservice.name:redalertMicroservice}", url="${redalertMicroservice.url:35.225.108.188:8084/crimestopper}", configuration = ClientConfiguration.class)
public interface LocationResourceApiClient extends LocationResourceApi {
}