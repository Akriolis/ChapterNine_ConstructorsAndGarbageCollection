import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting..");

        Duck myDuck = new Duck("Big Smokey", 2);
        System.out.println(myDuck.getSize());
        System.out.println(myDuck.getName());
        myDuck.roam();
        myDuck.setCost(10);
        System.out.println(myDuck.getCost());

        Duck bigDuck = new Duck();

        System.out.println(bigDuck.getName());
        System.out.println(bigDuck.getSize());

        bigDuck.cost = 10;
    }

    // constructor chaining

    // the superclass parts of an object have to be fully formed
    // before the subclass parts can be constructed

    // keyword this is a reference to the current object


}
