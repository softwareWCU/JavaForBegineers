package Lesson_05_Arrays_in_Java_Program;

import java.util.Arrays;

public class Single_Dimensional_Array_in_Java_Program {

    public static void main(String[] args) {
                // Declaring an array of integers
                    int[] numbers=new int[4];
                // Declaring and initializing an array at the same time
                   int[] ages = {21, 35, 17, 42};
                // Initializing an array of strings
                    String[] colors = new String[3];  // Declare with size 3
                    colors[0] = "Red";
                    colors[1] = "Green";
                    colors[2] = "Blue";
                    
                    int[] numbers2 = {10, 20, 30, 40};

                    // Accessing elements
                    System.out.println("Number at index 2: " + numbers2[2]);  // 30
                    
                    // Modifying elements
                    numbers2[2] = 99;
                    System.out.println("Modified number at index 2: " + numbers2[2]);  // 99

                    //Common Array Operations
                       int[] numbers3 = {5, 2, 8, 1, 3};
                        Arrays.sort(numbers3);

                        // Printing sorted array
                        System.out.println("Sorted array: " + Arrays.toString(numbers3));

                        //For-each Loop and Array
                            String[] colors2 = {"Red", "Green", "Blue"};

                            for (String color : colors2) {
                                System.out.println(color);
                            }

    }
}
/*
 * Write a program to find the largest number in an array.
 */