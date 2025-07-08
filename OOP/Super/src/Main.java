public class Main {
    public static void main(String[] args) {

        // Super = Refers to the parent class ( subclass <- superclass )
        //         Used in constructors and method overriding...
        //         Calls the parent constructor to initialize attributes...

        Person person = new Person("Joe", "Root");
        Student student = new Student("Babar", "Azam", 3.1);
        Empolyee empolyee = new Empolyee("Muhammad", "Naeem", 52000);

        empolyee.showSalary();
    }
}
