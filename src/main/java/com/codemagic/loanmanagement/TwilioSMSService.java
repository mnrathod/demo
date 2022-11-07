package com.codemagic.loanmanagement;

import org.springframework.stereotype.Service;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.Data;

@Service
@Data
public class TwilioSMSService implements SMSService{

	public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
	public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
	
	
	public boolean sendSMS(String from, String to, String text) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		 Message message = Message.creator(
	             new com.twilio.type.PhoneNumber("+919723286945"),
	             new com.twilio.type.PhoneNumber("+919723286945"),
	             "Welcome")
	         .create();

	     System.out.println(message.getSid());
	     return true;
	}

}
