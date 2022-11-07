package com.codemagic.loanmanagement;

import org.springframework.beans.factory.annotation.Autowired;

public class SMSNotification implements NotificationService{

	@Autowired
	SMSService smsService;

	@Override
	public void sendNotification() {
		// TODO Auto-generated method stub
		
	}
	
}
