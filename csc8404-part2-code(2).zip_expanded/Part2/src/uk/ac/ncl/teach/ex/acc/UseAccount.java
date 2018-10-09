package uk.ac.ncl.teach.ex.acc;

/** 
 * UseAccount - demo of accounts.
 *
 */ 
public class UseAccount {
    public static void main(String[] args) {
        final Account acc1 = new FreeAccount(1);
        
        final Account acc2 = new OverdraftAccount(2);
        
        final Account acc3 = new FreeAccount(3);
        
        Account acc4 = new OverdraftAccount(4);
        
        acc1.deposit(100);
        
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);
        
        final int acc2Withdraw = acc2.withdraw(20);
        System.out.println("withdrew " + acc2Withdraw
            + " from: " + acc2);
        
        final int acc3Withdraw = acc3.withdraw(10);
        System.out.println("withdrew " + acc3Withdraw 
            + " from: " + acc3);
        
         testTransfer(acc3, acc1);
        
        acc4 = acc3;
         testTransfer(acc4, acc3);
    }
    
  private static void testTransfer(Account toAcc, Account fromAcc) {
        System.out.println("Before transfer:");
       System.out.println("   toAcc is   " + toAcc);
        System.out.println("   fromAcc is " + fromAcc);
        
       toAcc.transferBalance(fromAcc);
        
       System.out.println("After transfer:");
        System.out.println("   toAcc is   " + toAcc);
       System.out.println("   fromAcc is " + fromAcc);
        
    }

}

