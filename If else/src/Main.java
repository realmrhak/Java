import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("your are student or not ? (True/False): ");
        isStudent = scanner.nextBoolean();


        if (name.isEmpty()){
            System.out.println("You are NOT entered your name.");
        }
        else{
            System.out.println("Hello " + name);
        }


        if (age >= 50){
            System.out.println("You are a old person.");
        }
        else if (age >= 18){
            System.out.println("You are a young adult.");
        }
        else{
            System.out.println("You are a under age child.");
        }

        if (isStudent){
            System.out.println("you're a student.");
        }
        else{
            System.out.println("you're NOT a student.");
        }
        scanner.close();
    }
}
