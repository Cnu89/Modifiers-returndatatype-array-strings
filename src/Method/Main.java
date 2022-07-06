package Method;

public class Main {
    public static void main(String[] args) {
        Returndatatype driver= new Returndatatype();
        int output=driver.add();
        System.out.print(output);
        String name =driver.name();
        System.out.print(name);
        Paramaters driver1= new Paramaters();
        driver1.sub(12,23.05f);
        driver1.add(56,78);

    }
}
