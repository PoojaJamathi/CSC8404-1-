package uk.ac.ncl.teach.ex.acc;

/** 
 * OverdraftAccount - bank account that allows overdrafts that incur a charge.
 *
 */

public final class OverdraftAccount extends AbstractAccount {
    private final static int OVERDRAFT_CHARGE = 10;

    /**
     * @see AbstractAccount#AbstractAccount(int)
     */
    public OverdraftAccount(int accountNumber) {
        super(accountNumber);
    }

    /**
     * Withdraw allows accounts to go into to the red and imposes
     * a fixed charge for withdrawals from overdrawn accounts.
     * 
     * @see uk.ac.ncl.teach.ex.acc.Account#withdraw(int)
     */
    public int withdraw(int amount) {
        if (amount < 0)
            throw new IllegalArgumentException(
                "Negative withdrawal: " + amount);
        
        final int newBalance = getBalance() - amount;
        
        if (newBalance < 0) {
            setBalance(newBalance - OVERDRAFT_CHARGE);
        } else {
            setBalance(newBalance);
        }
        
        return amount;
    }

	@Override
	public int getMeasure() {
		// TODO Auto-generated method stub
		return 0;
	}

}
