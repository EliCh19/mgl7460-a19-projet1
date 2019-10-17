import static org.junit.Assert.*;
import java.util.Scanner;

import org.junit.Test;

public class BankingApplicationTest {


	@Test
	public void testdeposit()
	{
		int expected = 5000;
		int amount = 4000;
		int balance = 1000;
	    balance = balance + amount;
		
		assertEquals(expected , balance  );
		
				}
	
	@Test
	public void withdraw()
	{
		int expected = 3000;
		int balance = 5000;
		int withdraw = 2000;
		balance = balance - withdraw;
		assertEquals(expected, balance );
		
				}
	
	@Test
	public void getPreviousTransaction1()
	{
		int deposit = 1000;
		int previousTransaction = 1000;
		assertEquals( deposit, previousTransaction);	 
	
	 }
	
	@Test
	public void getPreviousTransaction2()
	{
		int withdraw = 1000;
		int previousTransaction = -1000;
		assertEquals( withdraw, Math.abs(previousTransaction));	 
	
	 }
	
	@Test
	public void getAverageAccount()
	{
		int balance = 12000;
        int averageAccount;
		int expected = 1000;	
			assertEquals( expected , (averageAccount = balance/12) );
	 }
		
		

}
