package Accessmodifier;

public class Main {
    public static void main(String[] args) {
        Public.add();
        Public driver= new Public();
        driver.sub();
        //Private.mul();
        Protected.add();
        Protected driver1= new Protected();
        driver1.sub();
}

}
