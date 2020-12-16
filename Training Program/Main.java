import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to training Program!");
        String types="Available types\n" + "Burpee\n"+"Pushup\n"+"Situp\n"+"Squat\n";
        System.out.println("****************");
        System.out.println(types);
        System.out.println("****************");
        System.out.println("Create your training program ");
        System.out.println("Enter burpee number");
        int burpee_number=scanner.nextInt();
        System.out.println("Enter pushup number");
        int pushup_number=scanner.nextInt();
        System.out.println("Enter situp number");
        int situp_number=scanner.nextInt();
        System.out.println("Enter squat number");
        int squat_number=scanner.nextInt();
        scanner.nextLine();
        Training training=new Training(burpee_number,pushup_number,situp_number,squat_number);
        System.out.println("Your training start");

        while(!training.isFinish()){
            System.out.println("Enter type (burpee, pushup, situp,squat): ");
            String type=scanner.nextLine();
            System.out.println("How many movement are you going to do?");
            int number=scanner.nextInt();
            scanner.nextLine();
            training.move(type,number);
        }
        System.out.println("Congratulations! You have successfully completed your training program.");
    }
}
