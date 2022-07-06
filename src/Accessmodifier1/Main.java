package Accessmodifier1;

import Accessmodifier.Protected;
import Accessmodifier.Public;

public class Main {
    public static void main(String[] args) {
        Public.add();
        Public driver= new Public();
        driver.sub();
        Protected driver1= new Protected();
        //driver1.sub();
    }
}
