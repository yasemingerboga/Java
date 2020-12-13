import java.util.Scanner;

public class ATM {
    public void operations(Account account){
        Login login=new Login();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome To Bank!");
        System.out.println("----------------------------------");
        System.out.println("Login your account");
        int entryNo=3;
        while(true){
            if(login.login(account)){
                System.out.println("Successful!");
                break;
            }
            else{
                System.out.println("Failed!");
                entryNo--;
                System.out.println("Remaining entry right is "+entryNo);
            }
            if(entryNo==0){
                System.out.println("Your right to entry is finished.");
                return;
            }
        }
        System.out.println("***************************************");
        System.out.println("1.View balance");
        System.out.println("2.Deposit money");
        System.out.println("3.Withdraw money");
        System.out.println("q. quit");
        System.out.println("***************************************");
        while(true){
            System.out.println("Please enter your transaction.");
            String operation=scanner.nextLine();
            if(operation.equals("q")){
                break;
            }
            else if(operation.equals("1")){
                System.out.println("Balance: "+account.getBalance());
            }
            else if(operation.equals("2")){
                System.out.println("How much money do you want to deposit?");
                int money=scanner.nextInt();
                scanner.nextLine();
                account.depositMoney(money);
            }
            else if(operation.equals("3")){
                System.out.println("How much money do you want to withdraw?");
                int money=scanner.nextInt();
                scanner.nextLine();
                account.withdrawMoney(money);
            }
            else{
                System.out.println("Invalid transaction");
            }
        }
    }
}
