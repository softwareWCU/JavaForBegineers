package Lesson_04_Control_Flow_Statements_in_Java.Conditional_Statements_in_Java_Program;

public class Switch_case_Java_Program {
    public static void main(String[] args) {
        int day = 3;
        String dayName;
        
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "Invalid day"; break;
        }
        System.out.println("Today is " + dayName);
        
    }
}
