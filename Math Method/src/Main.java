import java.util.Scanner;
public class Main {
    public static void main(String[] args){

     /*
        double result;

        result = Math.pow(2, 3);
        result = Math.abs(-6);
        result = Math.sqrt(9);
        result = Math.round(5.14);
        result = Math.ceil(5.14);
        result = Math.floor(2.99);
        result = Math.max(20, 30);
        result = Math.min(20, 30);
        System.out.println(result);
        */
        Scanner scanner = new Scanner(System.in);
        // HYPOTENUSE c = Math.sqrt(Math.pow(a, 2) +(Math.pow(b, 2))

        /*
        double a;
        double b;
        double c;

        System.out.print("Enter the length of side 'A' of Triangle: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side 'B' of Triangle: ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)));

        System.out.println("The HYPOTENUSE of (side C) is: " + c + "cm");
        */

        // Circumference = 2 * Math.PI * radius;
        // Area = Math.PI * Math.pow(radius, 2);
        // Volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        double radius;
        double Circumference;
        double Area;
        double Volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        Circumference = 2 * Math.PI * radius;
        Area = Math.PI * Math.pow(radius, 2);
        Volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);


        System.out.println("The Circumference is: " + Circumference + "cm");
        System.out.println("The Area is: " + Area + "cm2");
        System.out.println("The Volume is: " + Volume + "cm3");

        scanner.close();
    }
}

