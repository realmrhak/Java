public class Main {
    public static void main(String[] args){
        // 2d Array = An array where each element is an array
        //            useful for a storing matrix of data....

        String[] fruits = {"apple", "banana", "orange", "berry"};
        String[] vegetables = {"potato", "tomato", "onion", "ginger"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};
        groceries[0][0] = "pineapple";
        for (String[] foods : groceries){
            for (String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
