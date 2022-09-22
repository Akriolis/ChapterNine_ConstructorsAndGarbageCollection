abstract class Animal {

    int cost;

    private int size;
    private String name;

    String getName(){
        return name;
    }

    int getSize(){
        return size;
    }

    void setName(String name){
        this.name = name;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public Animal(String name, int size){
        System.out.println("Making an animal");
    }

    public Animal(){

    }

    public void roam(){
        System.out.println("An animal is roaming!");
    }
}
