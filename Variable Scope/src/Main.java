public class Main {
    static int x = 33; // CLASS SCOPE...
    public static void main(String[] args){
        // Variable scope = Where variable can be accessed...

        int x = 12; // LOCAL VARIABLE...
        System.out.println(x);
        doSomeThing();
    }
    static void doSomeThing(){
        int x = 22; // LOCAL VARIABLE...
        System.out.println(x);
    }
}
