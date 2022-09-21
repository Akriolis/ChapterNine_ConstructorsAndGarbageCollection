abstract class Animal {

    private int cost;

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public Animal(String name, int size){

    }

    public void roam(){
        System.out.println("An animal is roaming!");
    }
}
