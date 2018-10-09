package uk.ac.ncl.teach.ex.factory.acc;

import java.util.HashMap;
import java.util.Map;

import uk.ac.ncl.teach.ex.acc.Account;

/** 
 * AccountFactory - factory for accounts that also provides 
 * abstract (partial) implementation of Account (all 
 * but withdraw method). Note that this implements
 * the uk.ac.ncl.teach.ex.acc.Account 
 * interface (imported above)
 *
 */ 
public abstract class AccountFactory implements Account {
    /**
     * Free account type.
     */
    public static final String FREE_ACCOUNT = "free";
    /**
     * Overdraft account type.
     */
    public static final String OVERDRAFT_ACCOUNT = "overdraft";
    
    // map of account number to instantiated account
    private static final Map<Integer, Account> accounts
        = new HashMap<Integer, Account>();
    
    private final int accountNumber;
    private int balance;
    
    AccountFactory(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    /**
     * Return an account of the specified type with the specified
     * account number.
     *
     * @param account the type of account to return
     * @param accountNumber the account number
     * @return an account of the specified type. An existing account
     * is returned if accountNumber is already known. Otherwise
     * a new account with the given number is returned.
     * @throws NullPointerException if accountType is null
     * @throws IllegalArgumentException if accountType is an 
     * invalid accounttype
     */
    public static Account getInstance(String account, 
        int accountNumber) {
        // enforce single instance per accountNumber
        Account acc = accounts.get(accountNumber);
        
        if (acc != null)
            return acc;
        
        // Here just return either free or overdraft account. 
        // A more complex 
        // implementation could build a map of account to 
        // implementation from a configuration file
        if (account.equals(FREE_ACCOUNT)) {
            acc = new FreeAccount(accountNumber);
        } else if (account.equals(OVERDRAFT_ACCOUNT)) {
            acc = new OverdraftAccount(accountNumber);
        } else {
            throw new IllegalArgumentException(
                        "invalid account type: " + account);
        }
        
        // put acc in accounts map
        accounts.put(accountNumber, acc);
        
        // return the instance
        return acc;
    }

    /**
     * @see uk.ac.ncl.teach.ex.acc.Account#deposit(int)
     */
    public void deposit(int amount) {
        if (amount < 0)
            throw new IllegalArgumentException(
                "Negative deposit: " + amount);
        
        balance = balance + amount;
    }

    /**
     * @see uk.ac.ncl.teach.ex.acc.Account#getAccountNumber()
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @see uk.ac.ncl.teach.ex.acc.Account#getBalance()
     */
    public int getBalance() {
        return balance;
    }
    
    /**
     * @see uk.ac.ncl.teach.ex.acc.Account#transferBalance(Account)
     */
    public void transferBalance(Account acc) {
        final int accBalance = acc.getBalance();
        
        if (accBalance < 0) 
            throw new IllegalArgumentException(
                "Transfer from overdrawn account not allowed: " + acc);
        
        deposit(acc.withdraw(accBalance));
    }
        
    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "account number: " +  accountNumber 
                + " (balance: " + balance + ")";
    }

    // utility method to allow subclasses to set the account balance
    void setBalance(int balance) {
        this.balance = balance;
    }
}
