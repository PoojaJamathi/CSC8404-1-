package uk.ac.ncl.teach.ex.acc;

/** 
 * FreeAccount - bank account with no overdraft and no charges.
 *
 */

public final class FreeAccount extends AbstractAccount {

    /**
     * @see AbstractAccount#AbstractAccount(int)
     */
    public FreeAccount(int accountNumber) {
        super(accountNumber);
    }
 
    /**
     * A withdrawal that puts the account into 
     * the red will not be permitted.
     * @see uk.ac.ncl.teach.ex.acc.Account#withdraw(int)
     */
    public int withdraw(int amount) {
        if (amount < 0)
            throw new IllegalArgumentException(
                "Negative withdrawal: " + amount);
        
        final int currentBalance = getBalance();
        
        if (currentBalance < amount)
            return 0;
        
        setBalance(currentBalance - amount);
        
        return amount;
    }

	@Override
	public int getMeasure() {
		// TODO Auto-generated method stub
		return 0;
	}

}
