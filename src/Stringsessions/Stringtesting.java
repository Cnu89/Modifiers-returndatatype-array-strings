package Stringsessions;

public class Stringtesting {
    static String s1="Raju";
    static String s2="Raju is my friend";

    static String s3="I love my family";

    String s4="Pakala";
    static String s5="My vehicle is jeep";
    static String s6="My vehicle is jeep";
    static String firstname= "Srinivas";
    static String lastname= "Reddy";
    static String fullname="srinivasreddy";

    static String s9="My Vehicle is Jeep";
    static String s10="my vehicle is jeep";

    public static void main(String[] args) {
        //Length//
        System.out.println(s1.length());

        //Uppercase//
        System.out.println(s1.toUpperCase());

        //Lowercase//
        System.out.println(s1.toLowerCase());
        System.out.println(s2.length());

        //Contains//
        System.out.println(s3.contains("my"));

        //length variable//
        int len=s3.length();
        System.out.println(len);

        //Concat variable + operator//
        fullname=firstname+lastname;
        System.out.println(fullname);
        System.out.println("Full name of the string is :"+fullname);

        //Concat//
        fullname=firstname.concat(lastname);
        System.out.println(fullname);

        //Non static//
        Stringtesting driver=new Stringtesting();
        String v=driver.s4;
        System.out.println(v.length());

        //== & Contentequals method//
        System.out.println(s5==s6);
        System.out.println(s5.contentEquals(s6));
        String r=s5.toUpperCase();
        System.out.println(r);

        // only use of Contentequals method//
        String s7=new String("My name is srinivas reddy");
        String s8=new String("My name is srinivas reddy");
        System.out.println(s7.equals(s8));
        System.out.println(s7==s8);
        System.out.println(s9.equalsIgnoreCase(s10));

        //Indexof//
        System.out.println(s7.indexOf("is"));
        System.out.println(s7.indexOf('i'));

        // Variable indexof//
        int position=s7.indexOf('i');
        System.out.println("i index" +position);

        int startposition=s7.indexOf("srinivas");
        System.out.println("name index" +startposition);

        //Substring one index//
        System.out.println(s7.substring(startposition));

        int endposition=s7.indexOf('n',startposition);
        System.out.println("n index" +endposition);

        //Substring start & end index//
        System.out.println(s7.substring(startposition,endposition));

        //Chararray//
        String name="My name is Raju";
        char[] ch=name.toCharArray();
        System.out.println(ch.length);
        System.out.println(ch[4]);
        System.out.println(ch[ch.length-3]);

        //Splitstring//
        String[] splitstring=name.split(" ");
        System.out.println(splitstring[3]);
        String[] splitstring1=name.split("is");
        System.out.println(splitstring[2]);


    }
}
