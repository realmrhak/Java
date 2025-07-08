import java.util.Arrays;

public class Main {
   public static void main(String[] args){
       // Array = A collection of values of a same data type...
       //         * think of it as a variable that can store more than 1 *

       String[] fruit = {"Apple", "Banana", "Pineapple", "Coconut"};
       fruit[2] = "Orange";
       //int numOfFruits = fruit.length;
       //System.out.println(numOfFruits);
       //System.out.println(fruit[2]);
       //System.out.println(Arrays.toString(fruit));
//       for (int i = 0; i < fruit.length; i++){
//           System.out.print(fruit[i] + " ");
//       }
       //Arrays.sort(fruit);
       //Arrays.fill(fruit, "Blue-Berry");
       for (String fruits : fruit){
           System.out.println(fruits);
       }
   }
}
