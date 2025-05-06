public class Main {
    public static void main(String[] args){
        // Overloaded Methods = Methods that shares the same name, but different parameters...
        // Signature = name + parameters

       // System.out.println(add(1, 2, 4, 7));

        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);
    }
    static String bakePizza(String bread){
        return bread + "pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }

    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }
}
