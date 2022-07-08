package Constructorconcepts;

import java.util.concurrent.Callable;

public class Main1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        ConceptA obj = new ConceptA(a,b);
        ConceptB obj1 = new ConceptB(a,b);
        ConceptC obj2 = new ConceptC(a,b);

        obj.add(a,b);
        obj1.mul(a,b);
        obj2.sub(a,b);

    }
}