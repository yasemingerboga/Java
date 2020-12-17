import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Employee //superclass or Baseclass
{

    private String name;
    private int salary;
    private String department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setdepartment(String department){
        this.department=department;
    }

    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public void work(){
        System.out.println("He/She is working!");
    }
    public void showInformation(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Department"+department);
    }
    public void changeDepartment(String newDepertmant){
        System.out.println("Your department is changing.");
        this.department=newDepertmant;
        System.out.println("Your new department is "+department);
    }
}
