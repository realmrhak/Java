public class Main {
    public static void main(String[] args){
        // ternary operator ? = Return 1 of 2 values if a condition is true...
        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        /*
        if (score >= 75){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
         */
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);
    }
}
