package Array;

public class Arraysession {
    static int a[]={10,20,30,40,50,60};
    static int b[]=new int[6];

    public static void main(String[] args) {
        b[2]=30;
        b[3]=40;
        b[4]=50;
        b[5]=60;
        System.out.println(a.length);
        System.out.println(a);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        System.out.println(b[5]);
        b[0]=10;
        b[1]=20;
    }
}
