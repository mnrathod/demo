package com.codemagic.loanmanagement;

import org.springframework.stereotype.Service;


@Service
public interface SMSService {		
	public boolean sendSMS(String from, String to, String text);
}
