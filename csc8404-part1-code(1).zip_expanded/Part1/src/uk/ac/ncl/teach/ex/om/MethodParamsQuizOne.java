package uk.ac.ncl.teach.ex.om;

public class MethodParamsQuizOne {

    public static void main(String[] args) {
        Integer i = new Integer(2);
        doSomethingWith(i);
        System.out.println(i);
    }
    
    static void doSomethingWith(Integer i) {
        System.out.println(i);
        i = new Integer(2000);
        System.out.println(i);
    }

}
