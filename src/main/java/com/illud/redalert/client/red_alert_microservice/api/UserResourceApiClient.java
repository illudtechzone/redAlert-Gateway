package com.illud.redalert.client.red_alert_microservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.redalert.client.red_alert_microservice.ClientConfiguration;

@FeignClient(name="${redAlertMicroservice.name:redAlertMicroservice}", url="${redAlertMicroservice.url:localhost:8081/redAlert}", configuration = ClientConfiguration.class)
public interface UserResourceApiClient extends UserResourceApi {
}