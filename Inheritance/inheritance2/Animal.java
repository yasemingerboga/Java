
public class Animal {

    private String name;
    private int weight;
    private int size;
    private int number_legs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber_legs() {
        return number_legs;
    }

    public void setNumber_legs(int number_legs) {
        this.number_legs = number_legs;
    }

    public Animal(String name, int weight, int size, int number_legs) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.number_legs = number_legs;
    }
    public void eat(){
        System.out.println("Animal is eating..");
    }
    public void move(int speed){
        System.out.println("Animal is running "+speed+"m/s.");
    }
}
