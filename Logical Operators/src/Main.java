public class Main {
    public static void main(String[] args){
        // && = AND
        // || = OR
        // ! = NOT

        double temp = 35;
        boolean isSunny = true;
        if (temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD...");
            System.out.println("It s sunny outside...");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD...");
            System.out.println("It s cloudy outside...");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad...");
        }
    }
}
