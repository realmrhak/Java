import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price = 9.99;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("Enter the item that you want: ");
        item = scanner.nextLine();
        System.out.print("Enter the quantity: ");
        quantity = scanner.nextInt();
        total = price * quantity ;
        System.out.println("You total bill is " + currency + total);

        scanner.close();
    }
}
