import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Enhanced switch = A replacement to man else if statements
        //            (Java14 feature)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of a day");
        String day = scanner.nextLine();
/*
        if (day.equals("Monday")){
            System.out.println("It is a weekday");
        }
        else if (day.equals("Tuesday")){
            System.out.println("It is a weekday");
        }
        else if (day.equals("Wednesday")){
            System.out.println("It is a weekday");
        }
        else if (day.equals("Thursday")){
            System.out.println("It is a weekday");
        }
        else if (day.equals("Friday")){
            System.out.println("It is a weekday");
        }
        else if (day.equals("Saturday")){
            System.out.println("It is a weekday");
        }
        else if (day.equals("Sunday")){
            System.out.println("It is a weekday");
        }
        else {
            System.out.println(day + " is NOT a day...");
        }
*/

        switch (day){
/*          case "Monday" -> System.out.println("It's a weekday...");
            case "Tuesday" -> System.out.println("It's a weekday...");
            case "Wednesday" -> System.out.println("It's a weekday...");
            case "Thursday" -> System.out.println("It's a weekday...");
            case "Friday" -> System.out.println("It's a weekday...");
            case "Saturday" -> System.out.println("It's a weekend...");
            case "Sunday" -> System.out.println("It's a weekend...");
 */
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It's a weekday...");
            case "Saturday", "Sunday"-> System.out.println("It's a weekend...");
                default -> System.out.println(day + " is NOT a day...");

        }
        scanner.close();
    }
}
