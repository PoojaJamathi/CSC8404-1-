package uk.ac.ncl.teach.ex.acc;
import uk.ac.ncl.teach.ex.measure.Measurable;
import uk.ac.ncl.teach.ex.measure.MeasurableCalculator;


/** 
 * UseCalculators - demo of calculators.
 *
 */ 
public class UseCalculators {
    
    public static void main(String[] args) {
       // useAccountCalculator();
       // useCashBoxCalculator();
        useMeasurableCalculator();
    }
    
   /* private static void useAccountCalculator() {
        System.out.println("useAcccountCalculator");
        System.out.println("-----------------------");
        
        final Account acc1 = new FreeAccount(1);
        final Account acc2 = new OverdraftAccount(2);
        final Account acc3 = new FreeAccount(3);
        
        acc1.deposit(200);
        acc2.withdraw(100);
        acc3.deposit(100);
        
        final AccountCalculator calculator = new AccountCalculator();
        System.out.println(calculator);
        
        calculator.update(acc1);
        System.out.println(calculator);

        calculator.update(acc2);
        System.out.println(calculator);

        calculator.update(acc3);
        System.out.println(calculator);
        System.out.println("-----------------------");
    }

    private static void useCashBoxCalculator() {
        System.out.println("useCashBoxCalculator");
        System.out.println("-----------------------");
        final CashBox box1 = new CashBox();
        final CashBox box2 = new CashBox(10);
        final CashBox box3 = new CashBox(3);
        
        box1.pay(50);
        
//       final int change = box2.pay(100, 200);
        
//       final int total = box3.empty();
        
        final CashBoxCalculator calculator = new CashBoxCalculator();
        System.out.println(calculator);
        
        calculator.update(box1);
        System.out.println(calculator);
        
        calculator.update(box2);
        System.out.println(calculator);
        
        calculator.update(box3);
        System.out.println(calculator);

        System.out.println("-----------------------");
    }

  
     */
    private static void useMeasurableCalculator() {
        System.out.println("useMeasurableCalculator");
        System.out.println("-----------------------");
        final CashBox box1 = new CashBox();
        final Account acc1 = new FreeAccount(1);
        final Account acc2 = new OverdraftAccount(2);
        
        box1.pay(50);
        acc1.deposit(200);
        acc2.withdraw(100);
        
        final MeasurableCalculator calculator 
            = new MeasurableCalculator();
        System.out.println(calculator);
        
        calculator.update(box1);
        System.out.println(calculator);
        
        calculator.update((Measurable) acc1);
        System.out.println(calculator);
        
        calculator.update((Measurable) acc2);
        System.out.println(calculator);

        System.out.println("-----------------------");
    }
    
}
