import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//In this activity, you will be writing tests for testing exceptions:

class Activity2 {

	@Test
	void notEnoughFundsTest() {
	BankAccount bankaccount = new BankAccount(9);
	
	assertThrows(NotEnoughFundsException.class,()-> bankaccount.withdraw(10),"Balance less than withdrawal request");
	
	}
	
	@Test
	void enoughFundsTest() {
	
	//This is for testing when the balance is equal to the amount 	
	BankAccount bankaccount = new BankAccount(100);
	
	assertDoesNotThrow(()-> bankaccount.withdraw(100), "Enough funds avaiable");
	
	}
	
	
	@Test
	void enoughFunds1Test(){
		//This is for testing when the balance is more than the withdrawal amount requested 		
		
		BankAccount bankaccount = new BankAccount(100);
		assertDoesNotThrow(()->bankaccount.withdraw(99), "Enough funds available");
		
	}

}
