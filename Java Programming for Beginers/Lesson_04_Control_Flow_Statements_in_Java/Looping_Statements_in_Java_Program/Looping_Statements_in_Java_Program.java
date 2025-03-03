 package Lesson_04_Control_Flow_Statements_in_Java.Looping_Statements_in_Java_Program;

class Looping_Statements_in_Java_Program {

    public static void main(String[] args) {
        //for  loop
        System.out.println("---for loop---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }
        //while loop
        System.out.println("----while loop----");
        int i = 6;
        while (i <= 5) {
            System.out.println("Iteration " + i);
            i++;
        }
        //do-while loop
        System.out.println("----do-while loop---");
        int x = 6;
        do {
            System.out.println("Iteration " + x);
            x++;
        } while (x <= 5);
                
    }
}