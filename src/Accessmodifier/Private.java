package Accessmodifier;

public class Private {
    private static void mul(){
        int a=11;
        int b=22;
        int c=a*b;
        System.out.println(c);
    }
    Private static void add(){
        int a=33;
        int b=44;
        int c=a+b;
       System.out.println(c);

    public static void main(String[] args) {
        Private.mul();
        Private.add();

    }

}
