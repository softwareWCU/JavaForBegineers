package Lesson_02_Data_Types_and_Variables_in_Java.Variables_and_Constants;

public class VariableAndConstant {
    public static void main(String[] args) {
        int score1 = 90;  
        score1 = 95; // we can Change the value
        final double PI = 3.14159;  // Constant (unchangeable)
        //PI=3.14158;  //we cann't Change the value of constant variable
        
        int _age = 25;
        //int 2age=25; we cann't start varible declaration with numbers
        //int person-age=25; we cann't separt two word variable with -(dash) 
        double Emp_salary = 50000.75;
        char grade_ = 'A';
        boolean isJavaFun = true;
       
        
        System.out.println("Age: " + _age + ", Salary: " + Emp_salary + ", Grade: " + grade_ + ", Is Java Fun? " + isJavaFun);
        System.out.println("Score: "+score1);
        System.out.println("PI value: "+PI);
    }
}
