package uk.ac.ncl.teach.ex.om;

public class MethodParamsQuizTwo {

    public static void main(String[] args) {
        Person nick = new Person("Nick");
        doSomethingWith(nick);
        System.out.println(nick);
    }
    
    static void doSomethingWith(Person p) {
        System.out.println(p);
        p.setName("Bob");
        System.out.println(p);
    }
}
