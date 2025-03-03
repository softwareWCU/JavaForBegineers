package Lesson_03_Operators_in_Java.RelationalOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 10, y = 20;
        boolean isEqual = (x == y);    // Equal to
        boolean isNotEqual = (x != y); // Not equal to
        boolean isGreaterThan = (x > y); // Greater than
        boolean isLessThan = (x < y);   // Less than
        boolean isGreaterOrEqual = (x >= y); // Greater than or equal to
        boolean isLessOrEqual = (x <= y);    // Less than or equal to
        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
        System.out.println("Greater Than: " + isGreaterThan);
        System.out.println("Less Than: " + isLessThan);
        System.out.println("Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Less or Equal: " + isLessOrEqual);
        
    }
}
