package Lesson_06_Strings_in_Java;

public class Strings_in_Java_Program {

    public static void main(String[] args) {
        //String Length and charAt Methods
        String message = "Hello, Java!";
        System.out.println("Length of the string: " + message.length());  // 12
        System.out.println("Character at index 7: " + message.charAt(7));  // 'J'
        
        //substring() Method
        String sentence = "Welcome to Java Programming!";
        System.out.println("Substring (7, 10): " + sentence.substring(7, 10));  // "to"
        
        //equals() Method 
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Java";

        System.out.println(str1.equals(str2));  // true
        System.out.println(str1.equals(str3));  // false

        //String Immutability
        String text = "Java";
        text = text.concat(" Programming");
        System.out.println(text);  // "Java Programming"

        //String Concatenation

        String part1 = "Hello";
        String part2 = " Java";
        String result = part1 + part2;
        System.out.println(result);  // "Hello Java"
        
        //Using concat() Method
        String greeting = "Hello";
        String language = "Java";
        String sentence2 = greeting.concat(" " + language);
        System.out.println(sentence2);  // "Hello Java"

        //StringBuilder
        StringBuilder builder = new StringBuilder("Java");
        builder.append(" Programming");
        System.out.println(builder.toString());  // "Java Programming"
        //StringBuffer 
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        System.out.println(buffer.toString());  // "Hello World"
    }
}
/*
 * Write a program to reverse a string.
 */