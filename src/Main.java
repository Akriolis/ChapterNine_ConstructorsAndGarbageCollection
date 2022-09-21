import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Duck myDuck = new Duck("Big Smokey", 2);
        System.out.println(myDuck.size);
        System.out.println(myDuck.name);
        myDuck.roam();
        myDuck.setCost(10);
        System.out.println(myDuck.getCost());
    }
}
