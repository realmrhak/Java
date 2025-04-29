import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        // Nested Loop = A loop inside another loop...
        //               Used often with matrices or DS&A...

//        int rows = 5;
//        for (int i = 1; i <= rows ; i++){
//            for (int x = 1; x <= i; x++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 3; i++){
//            for (int x = 0; x <= 9; x++){
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++){
            for (int x = 0; x < columns; x++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
