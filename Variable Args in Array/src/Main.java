public class Main {
    public static void main (String[] args){

        // varargs = allow a method to accept a varying number of arguments
        //           makes methods more flexible, no need of overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)

        System.out.println(average());
    }

    static double average(double... numbers){
        double sum = 0;

        if (numbers.length == 0){
            return 0;
        }
        for (double number : numbers){
            sum += number / numbers.length;
        }
        return sum;
    }
}
