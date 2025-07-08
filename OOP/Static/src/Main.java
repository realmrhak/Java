public class Main {
    public static void main(String[] args) {

        // Static = Makes a variable or method belong to the class
        //          rather than to any specific object...
        //          Commonly used for utility methods or shared resources...

        Friend friend1 = new Friend("El");
        Friend friend2 = new Friend("Mike");
        Friend friend3 = new Friend("Lucas");
        Friend friend4 = new Friend("Will");
        Friend friend5 = new Friend("Max");

        Friend.showFriends();

    }
}
