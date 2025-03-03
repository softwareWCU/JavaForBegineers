package Lesson_06_Strings_in_Java;

public class ReverseString{

    public static void main(String[] args) {
        String str = "Hello, Java!";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}
