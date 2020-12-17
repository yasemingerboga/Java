public class Dog extends Animal{
    private int teeth_number;

    public int getTeeth_number() {
        return teeth_number;
    }

    public void setTeeth_number(int teeth_number) {
        this.teeth_number = teeth_number;
    }

    public Dog(String name, int weight, int size, int number_legs, int teeth_number) {
        super(name, weight, size, number_legs);
        this.teeth_number=teeth_number;
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog is running "+speed+" m/s.");
    }

    public void run (int speed){
        System.out.println("Dog is running!");
        move(speed);
    }
}
