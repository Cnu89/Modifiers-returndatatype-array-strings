package Constructorconcepts;

public class Concept {
    public Concept(int a) {
        System.out.println(a);
    }
    public Concept(int a,int b){
        System.out.println(a-b);
    }
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }

}
