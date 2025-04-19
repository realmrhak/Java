public class Main {
    public static void main(String[] args){
        String name = "Pass code";

        int length = name.length();
        char letter = name.charAt(4);
        int index = name.indexOf("k");
        int lastIndex = name.lastIndexOf("a");
        name = name.trim();

       // name = name.replace("k" , "q");
       // name = name.toUpperCase();
       // name = name.toLowerCase();

        /*
        if (name.isEmpty()){
            System.out.println("Your name is empty...");
        }
        else {
            System.out.println("Hello Mr." + name + "...");
        }

        if (name.contains(" ")){
            System.out.println("Your name conatains a space...");
        }
        else {
            System.out.println("Your name DOESN'T contain an spaces...");
        }
        */

        if (name.equalsIgnoreCase("Pass Code")){
            System.out.println("Your name CAN'T be Pass code...");
        }
        else {
            System.out.println("Hello " + name);
        }


        //System.out.println(name.isEmpty());
    }
}
