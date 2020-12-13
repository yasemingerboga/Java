public class Main {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Account account=new Account("yasmin","123",1000);
        atm.operations(account);
        System.out.println("Program exits. ");
    }
}
