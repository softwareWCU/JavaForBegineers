package Lesson_07_Basic_Input_Output_in_Java;

import java.util.Scanner;

public class Accepting_input_from_Keyboard_java_Program {

    public static void main(String[] args) {
            String name="";
            int phone;
            
            Scanner input=new Scanner(System.in);
            Scanner input2=new Scanner(System.in);
          
            System.out.println("Enmesater Name"); 
            name=input.next();
            System.out.println("Enter Phone number");
            phone=input2.nextInt();
           
            System.out.println(name);
            System.out.println(phone);
    }
}