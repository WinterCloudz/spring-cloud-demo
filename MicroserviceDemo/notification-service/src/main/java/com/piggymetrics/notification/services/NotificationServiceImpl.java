package com.piggymetrics.notification.services;

import javax.management.Notification;
import javax.management.NotificationFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.piggymetrices.notification.domain.Account;
@Component
public class NotificationServiceImpl implements NotificationService {

@Autowired	
public RemoteAccountService remoteAccountService;

	@Override
	@HystrixCommand(fallbackMethod = "testFallback")
	public ResponseEntity getAccount(String name) {
		// TODO Auto-generated method stub
		return remoteAccountService.getAccount(name);
	}
	
	private ResponseEntity testFallback(String name) {
		return ResponseEntity.ok("Fallback Response");
	}

}
