package uk.ac.ncl.teach.ex.acc;

import uk.ac.ncl.teach.ex.measure.ObjectCalculator;
import uk.ac.ncl.teach.ex.measure.Measurer;

/** 
 * UseMeasurers - demonstrate Measurers.
 *
 */ 
public class UseMeasurers {
    
    public static void main(String[] args) {
        useMeasurers();
        useWealthMeasurer();
    }
    
    private static void useMeasurers() {
        System.out.println("use Measurers");
        System.out.println("-----------------------");
        
        final Account acc1 = new FreeAccount(1);
        final Account acc2 = new FreeAccount(2);
        final Account acc3 = new OverdraftAccount(3);
        
        acc1.deposit(200);
        acc2.deposit(100);
        
        final CashBox box1 = new CashBox();
        final CashBox box2 = new CashBox(10);
        final CashBox box3 = new CashBox(3);
        
        box1.pay(50);
        box3.pay(300);
        
        @SuppressWarnings("unused")
        final int change = box2.pay(100, 200);
        
        final ObjectCalculator calculator 
            = new ObjectCalculator();

        System.out.println(calculator);
        
        final Measurer accMeasurer = new AccountMeasurer();
        
        calculator.update(accMeasurer, acc1);
        System.out.println(calculator);

        calculator.update(accMeasurer, acc2);
        System.out.println(calculator);

        final Measurer cbMeasurer = new CashBoxMeasurer();
        
        calculator.update(cbMeasurer, box1);
        System.out.println(calculator);
        
        calculator.update(cbMeasurer, box2);
        System.out.println(calculator);
        
        calculator.update(cbMeasurer, box3);
        System.out.println(calculator);
        
        acc3.withdraw(100);
        calculator.update(accMeasurer, acc3);
        System.out.println(calculator);
        
        
        System.out.println("-----------------------");
    }

    private static void useWealthMeasurer() {
        System.out.println("useWealthMeasurer");
        System.out.println("-----------------------");
        final CashBox box1 = new CashBox();
        final Account acc1 = new FreeAccount(1);
        final Account acc2 = new OverdraftAccount(2);
        
        box1.pay(50);
        acc1.deposit(200);
        acc2.withdraw(100);
        
        final Measurer measurer = new WealthMeasurer();
        
        final ObjectCalculator calculator = new ObjectCalculator();
        System.out.println(calculator);
        
        calculator.update(measurer, box1);
        System.out.println(calculator);
        
        calculator.update(measurer, acc1);
        System.out.println(calculator);
        
        calculator.update(measurer, acc2);
        System.out.println(calculator);

        System.out.println("-----------------------");
    }}
