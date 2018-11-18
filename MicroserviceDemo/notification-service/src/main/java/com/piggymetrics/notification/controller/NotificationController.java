package com.piggymetrics.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.piggymetrics.notification.services.NotificationService;

@RestController
@RequestMapping(path="/v1/notifications")
public class NotificationController {
	
@Autowired	
private NotificationService notificationService;

@RequestMapping(path = "/current/accounts/{name}", method = RequestMethod.GET)
public ResponseEntity getCurrentNotificatigetonsSettings(@PathVariable String name) {
	return notificationService.getAccount(name);
}
}
