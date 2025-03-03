package Lesson_02_Data_Types_and_Variables_in_Java.TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (small to big)
            int myInt = 9;
            double myDouble = myInt;  // Automatically converts
        System.out.println("New Implicit Type Casted value : "+ myDouble);
    // Explicit casting (big to small)
        double price = 9.99;
        int newPrice = (int) price;  // Manually converts
        System.out.println("New Explicit Type Casted value : "+newPrice);

        char letter='A';
        int decimal_value=(int)letter;
        System.out.println("New Explicit Type Casted value : "+ decimal_value);

    }
}
