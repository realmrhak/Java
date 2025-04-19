import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //  .substring() = A method used to extract a portion of a string...
        //        string.substring(start, end)

        Scanner scanner = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")){
        username = email.substring(0 , email.indexOf("@"));
        domain = email.substring( email.indexOf("@") + 1);
        System.out.println(username);
        System.out.println(domain);
        }
        else {
            System.out.println("You entered the invalid email...");
        }
        scanner.close();
    }
}
