package com.piggymetrics.notification.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.Response;

@FeignClient(name = "account-service")
public interface RemoteAccountService {
	
	@RequestMapping(method = RequestMethod.GET, value = "v1/accounts/{accountName}")
	ResponseEntity<String> getAccount(@PathVariable("accountName") String accountName);

}
