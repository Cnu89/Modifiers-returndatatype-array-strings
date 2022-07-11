package Constructorconceptsthis;

public class Main {
    public static void main(String[] args) {
        int a=50;
        int b=30;

        ConceptA driver=new ConceptA(a,b);
        ConceptB driver1=new ConceptB(a,b);
        ConceptC driver2=new ConceptC(a,b);

        driver.add(a,b);
        driver1.mul(a,b);
        driver2.sub(a,b);

    }
}
