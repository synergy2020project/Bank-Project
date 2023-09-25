package com.bank.bank;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	private static final org.jboss.logging.Logger logInfo = LoggerFactory.logger(BankController.class);

	@Autowired
	BankUserService bank;
	
	@PostMapping
	public BankUser addBankUser(@RequestBody BankUser bankUser) {
		
		return bank.addBankUser(bankUser); 
	}
	
	@PutMapping
	public BankUser updateBankUser(@RequestBody BankUser bankUser) {
		
		
		return bank.updateBankUser(bankUser); 
	}
	
	@GetMapping
	public List<BankUser> getBankUser() {
		
		logInfo.info("Bankuser Info Logging is enabled");
		logInfo.debug("bankuser debugg logging is enabled");	
		
	return bank.getAllBAnkUser();
	}
	
	@GetMapping("/{id}")
	public BankUser getBankUserByID(@PathVariable("id")int id) {
		
		
		
	return bank.findBankUserById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteBnkUser(@PathVariable("id")int id) {
		
	 bank.deleteBankUser(id);
	 return "User has been deleted successfully";
	}
		
	
}
