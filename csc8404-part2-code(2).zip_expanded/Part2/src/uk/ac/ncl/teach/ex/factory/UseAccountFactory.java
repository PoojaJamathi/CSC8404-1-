package uk.ac.ncl.teach.ex.factory;

// note Account and AccountFactory are in different packages
import uk.ac.ncl.teach.ex.acc.Account;
import uk.ac.ncl.teach.ex.factory.acc.AccountFactory;
// see what happens when you uncomment the following import statement
// import uk.ac.ncl.teach.ex.factory.acc.FreeAccount;

/** 
 * UseFactories - examples of factory use.
 *
 */ 
public class UseAccountFactory {

    public static void main(String[] args) {
        System.out.println("Using account factory");
        final Account freeAccount1
            = AccountFactory.getInstance(
                AccountFactory.FREE_ACCOUNT, 1234);
        
        final Account freeAccount2 
            = AccountFactory.getInstance(
                AccountFactory.FREE_ACCOUNT, 1234);
        
        // check that freeAccount1 == freeAccount2 - same instance
        System.out.println(
            "Only have single instance of freeAccount "
            + freeAccount1.getAccountNumber() + ": "
            + (freeAccount1 == freeAccount2));
        
        printAccountInfo(AccountFactory.FREE_ACCOUNT, 
            freeAccount1);
        
        // can you import uk.ac.ncl.teach.ex.factory.acc.FreeAccount?
        // uncomment line 7 above
        // final FreeAccount acc = (FreeAccount) freeAccount1;
        
        // final Account acc2 = new FreeAccount(6);
        
        final Account overdraftAccount 
            = AccountFactory.getInstance(
                AccountFactory.OVERDRAFT_ACCOUNT, 4567);
            
        printAccountInfo(AccountFactory.OVERDRAFT_ACCOUNT, 
            overdraftAccount);
    }
    
    private static void printAccountInfo(String accType, 
        Account account) {
        System.out.println(accType + " " + account
            + " is implemented by: " + account.getClass());
    }

}
