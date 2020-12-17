public class Manager extends Employee //subclass
{
    private int responsible_person;

    public Manager(String name, int salary, String department, int responsibleperson) {
        super(name, salary, department);    //superclass' constructor
        this.responsible_person = responsibleperson;
    }

    public void raise(int raise_amount) {
        System.out.println("Employees were paid " + raise_amount + " $ increase.");
    }

    @Override
    public void showInformation() {
        super.showInformation();        //superclass' function
        System.out.println("The number of you responsible people are: "+ responsible_person);   //extra
    }
}
