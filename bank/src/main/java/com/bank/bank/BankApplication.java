package com.bank.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication  implements CommandLineRunner{	

	@Autowired 
	BankUserService userService;
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

	public void run(String... args) throws Exception {
		BankUser b =new BankUser();
		b.setBankName("xyz");
		b.setName("prashant");
		userService.addBankUser(b);
	}
	
	

}
