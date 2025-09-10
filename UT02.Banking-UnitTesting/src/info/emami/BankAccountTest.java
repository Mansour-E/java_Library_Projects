package info.emami;

import static org.junit.Assert.*;

/**
 *
 */
public class BankAccountTest {

    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("Mansour", "Emami", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance , 0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("this test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Mansour", "Emami", 1000.00 , BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Mansour", "Emami", 1000.00, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true(){
        BankAccount account = new BankAccount("Mansour", "Emami", 1000.00, BankAccount.CHECKING);
        assertTrue("The account is not checking account", account.isChecking());
    }
    
}