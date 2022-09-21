import java.util.ArrayList;
import java.util.SortedMap;

public class Duck extends Animal{

    int size;
    String name;



    int howManyCreations = 0;

    String nameOfDuck;

    ArrayList<Duck> myDucks = new ArrayList<Duck>();



    public Duck(String name, int size){
        super(name,size);

        System.out.println("Quack!");
    }
}
