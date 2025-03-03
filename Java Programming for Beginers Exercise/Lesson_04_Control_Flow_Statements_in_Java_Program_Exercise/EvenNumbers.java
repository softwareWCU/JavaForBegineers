package Lesson_04_Control_Flow_Statements_in_Java;

public class EvenNumbers {
        public static void main(String[] args) {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
}
