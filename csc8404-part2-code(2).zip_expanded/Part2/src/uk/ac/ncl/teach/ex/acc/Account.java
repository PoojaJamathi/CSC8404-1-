package uk.ac.ncl.teach.ex.acc;

/** 
 * Account - interface to bank accounts.
 *
 */ 
public interface Account {
    /**
     * Deposits money in the account.
     *
     * @param amount the amount of money to deposit 
     * @throws IllegalArgumentException if 
     * <code>amount < 0</code>
     */
    void deposit(int amount);
    
    /**
     * Returns the account number. 
     * All accounts must have an account number
     * which uniquely identifies an account at a bank.
     *
     * @return the account number
     */
    int getAccountNumber();
    
    /** 
     * Returns the account balance.
     *
     * @return the balance of the account
     */    
    int getBalance();
    
    /**
     * Transfers the balance of the given account 
     * to this account. It is 
     * forbidden to transfer the balance from 
     * an overdrawn account.
     * 
     * @param acc the account to transfer the balance from
     * @throws NullPointerException if <code>acc</code> 
     * is <code>null</code>
     * @throws IllegalArgumentException if 
     * <code>acc</code> is overdrawn
     */
    void transferBalance(Account acc);
    
    /**
     * Withdraws money from the account.
     *
     * @param amount the amount of money requested
     * @return the amount of money withdrawn which 
     * will be zero if there are 
     * insufficent funds in the account 
     * for the requested withdrawal
     * @throws IllegalArgumentException 
     * if <code>amount < 0</code>
     */
    int withdraw(int amount);
}
