import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//        String name = "";
//
//        while (name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//        System.out.println("Hello " + name);

//        String response = "";
//
//        while(!response.equals("Q")){
//            System.out.println("You are playing game...");
//            System.out.print("Press Q to quit: ");
//            response = scanner.nextLine().toUpperCase();
//        }
//        System.out.println("Now you quit the game...");

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age can't be negative...");
            System.out.print("Enter your age now again: ");
            age = scanner.nextInt();
        }
        System.out.println("Your are " + age + " years old...");
        scanner.close();
    }
}
