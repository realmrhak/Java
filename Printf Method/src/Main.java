public class Main {
    public static void main(String[] args){

        // printf() = is a method used to format output...
        // %[flags][width][.precision][specifier-character]
        /*
        //                          [specifier-character]...

        String name = "Burak";
        int age = 22;
        char FirstLetter = 'B';
        double cgpa = 3.4;
        boolean isStudent = true;

        System.out.printf("My name is %S.\n" , name);
        System.out.printf("My age is %d.\n" , age);
        System.out.printf("My name first letter is %c.\n" , FirstLetter);
        System.out.printf("My cgpa is %f.\n" , cgpa);
        System.out.printf("I am a student %b.\n" , isStudent);
        System.out.printf("My name is %S & I am %d years old." , name, age);
         */
        //                          [.precision]...

        /*                          [flags]...
             + = output a plus...
             , = comma grouping separator...
             ( = negative numbers are enclosed in ()...
             space = display a minus if negative, space if positive...
         */
        /*
        double price1 = 9.99;
        double price2 = 111000.69;
        double price3 = -33.02;

        System.out.printf("%(+.2f\n" , price1);
        System.out.printf("%,.2f\n" , price2);
        System.out.printf("%(.2f\n" , price3); */

        /*                          [width]...
             0 = zero padding...
             number = right justified padding...
             negative number = left justified padding...
             space = display a minus if negative, space if positive...
         */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n" , id1);
        System.out.printf("%-4d\n" , id2);
        System.out.printf("%-4d\n" , id3);
        System.out.printf("%-4d\n" , id4);

    }
}
