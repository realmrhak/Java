public class Main {
    public static void main(String[] args){
        // Break = Break out of a loop (STOP)...
        // Continue = Skip current iteration of a loop (Skip)...

        for (int i = 0; i < 10; i++){

            if (i == 5){
                continue;
            }
            System.out.print(i + "   ");
        }
    }
}
