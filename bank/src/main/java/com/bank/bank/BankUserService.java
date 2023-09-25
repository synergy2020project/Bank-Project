package com.bank.bank;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankUserService {

	@Autowired
	BankUserRepository bankUserRepository;

	public BankUser addBankUser(BankUser bankUser) {

		return bankUserRepository.save(bankUser);
	}
	//logging mapping
	//excepting handling
	//security 

	public BankUser findBankUserById(int id) throws ExceptionBank{
		Optional<BankUser> optionalBankUser = bankUserRepository.findById(id);

		//bankUserRepository.findById(id);
		if(!optionalBankUser.isPresent())
			throw new ExceptionBank("Request Not found");
		//return bankUserRepository.findById(id);
		return optionalBankUser.get();
		
	}

	public List<BankUser> getAllBAnkUser() {

		return bankUserRepository.findAll();
	}

	public void deleteBankUser(int id) {
		bankUserRepository.deleteById(id);
	}

	public BankUser updateBankUser(BankUser bankUser) {

		return bankUserRepository.save(bankUser);
	}
}
