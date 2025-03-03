package Lesson_03_Operators_in_Java.LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isRainy = true;
        boolean hasUmbrella = false;
        
        boolean goOutside = isRainy && hasUmbrella;  // AND operator
        boolean shouldStayHome = isRainy || !hasUmbrella;  // OR and NOT operators
        System.out.println("Can go outside: " + goOutside);
        System.out.println("Should stay home: " + shouldStayHome);
        
    }
}
