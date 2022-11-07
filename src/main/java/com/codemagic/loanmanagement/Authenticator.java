package com.codemagic.loanmanagement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Authenticator {

	@PostMapping ("/authenticate")
	public String authenticate (@RequestBody Customer customer) {
		return "addcustomer";
	}

}
