public class Main {
    public static void main(String[] args){
        // Method = A block of reusable code that is executed when called ()

//        String name = "Burak";
//        int age = 22;

//        happyBirthday(name, age);

//        double result = square(3);
//        System.out.println(result);

//        System.out.println(square(3));

//        System.out.println(cube(3));

        int age = 18;

        if (ageCheck(age)){
            System.out.println("You are eligible for casting a elections vote...");
        }
        else{
            System.out.println("You are NOT eligible for casting a elections vote...");
        }
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!...");
        System.out.printf("Happy Birthday dear %s!...\n" , name);
        System.out.printf("You are %d year old...\n" , age);
        System.out.println("Happy Birthday to you!...\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static boolean ageCheck(int age){
        if (age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
