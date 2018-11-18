package com.piggymetrics.notification.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.piggymetrices.notification.domain.Account;


public interface NotificationService {
	
	public ResponseEntity getAccount(String name);

}
