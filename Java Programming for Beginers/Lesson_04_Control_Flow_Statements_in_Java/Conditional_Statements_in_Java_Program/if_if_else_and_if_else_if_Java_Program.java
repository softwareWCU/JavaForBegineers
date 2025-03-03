package Lesson_04_Control_Flow_Statements_in_Java.Conditional_Statements_in_Java_Program;

public class if_if_else_and_if_else_if_Java_Program {
    public static void main(String[] args) {
        int age = 20;

        // Simple if
        if (age >= 18) {
            System.out.println("You are an adult.");
        }
        
        // if-else
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        
        // if-else-if
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }
        
    }
}
