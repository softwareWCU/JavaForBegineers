package Lesson_04_Control_Flow_Statements_in_Java.Jump_Statements_in_Java_Program;

public class Jump_Statements {
    public static void main(String[] args) {
        //break 
        System.out.println("---break statement---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // Exit the loop when i equals 5
            }
            System.out.println("Iteration " + i);
        }
        //  continue
        System.out.println("---continue statement---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Skip iteration when i equals 3
            }
            System.out.println("Iteration " + i);
        }
        
    }
}
/*
 * Write a program to print even numbers between 1 and 20 using a for loop.
 */
