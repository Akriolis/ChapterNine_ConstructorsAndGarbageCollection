import java.util.ArrayList;
import java.util.SortedMap;

public class Duck extends Animal{

    int howManyCreations = 0;

    String nameOfDuck;

    ArrayList<Duck> myDucks = new ArrayList<Duck>();



    public Duck(String name, int size){
        super(name, size);

        System.out.println("Making a duck");

        System.out.println("Quack!");
    }

    public Duck(){

    }

}
