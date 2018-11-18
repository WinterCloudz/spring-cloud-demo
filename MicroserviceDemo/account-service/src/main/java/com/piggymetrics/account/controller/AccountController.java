package com.piggymetrics.account.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.piggymetrics.account.domain.Account;

@RestController
@RequestMapping(path="/v1/accounts")
public class AccountController {
	
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public Account getAccountByName(@PathVariable String name) {
		
		Account account1 = new Account();
		account1.setName("Dhruba");
		account1.setAddress("Bangalore");
		account1.setId("abc");
		if(name.equalsIgnoreCase(account1.getName())) {
		return account1;
		}else {
			return new Account();
		}
	}

}
