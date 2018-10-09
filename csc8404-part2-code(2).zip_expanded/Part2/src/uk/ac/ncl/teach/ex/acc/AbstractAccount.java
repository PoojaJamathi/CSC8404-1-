package uk.ac.ncl.teach.ex.acc;
import uk.ac.ncl.teach.ex.measure.Measurable;

/** 
 * AbstractAccount - abstract (partial) implementation of Account (all but 
 * withdraw method).
 *
 */ 
public abstract class AbstractAccount implements Account,Measurable{
    /* Neither of the following member fields is directly accessible to 
     * any subclass
     */
    private final int accountNumber;
    private int balance;
    public int getMeasre()
    {
    	return getBalance();
    }
    
    // package-private
    AbstractAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "account " +  accountNumber + " : " + balance;
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
     * @see uk.ac.ncl.teach.ex.acc.Account#transferBalance(uk.ac.ncl.teach.ex.acc.Account)
     */
    public void transferBalance(Account acc) {
        // this method has a deliberate mistake
        /*final AbstractAccount fromAcc 
            = (AbstractAccount) acc;
        
        if (fromAcc.balance < 0)
            throw new IllegalArgumentException("acc: " + acc
                + " has negative balance");
        
        balance += fromAcc.balance;
        
        fromAcc.balance = 0;*/
    	deposit(acc.withdraw(acc.getBalance()));
    }
        
    // to set the account balance as cannot access 
    // balance directly
    // rely on subclasses to maintain invariants
    void setBalance(int balance) {
        this.balance = balance;
    }
}
