package Lesson_05_Arrays_in_Java_Program;

public class Multi_Dimensional_Arrays_in_Java_Program {
    public static void main(String[] args) {
          // Declaring an array of integers
                    int[][] numbers=new int[4][5];
                // Declaring and initializing an array at the same time
                   int[][] ages = {{21, 35}, {17, 42}};
                // Initializing an array of strings
                    String[][] colors = new String[2][3];  // Declare with size 3
                    colors[0][0] = "Red";
                    colors[0][1] = "Green";
                    colors[0][2] = "Blue";
                    
                    int[][] numbers2 = {{10, 20}, {30, 40}};

                    // Accessing elements
                    System.out.println("Number at index [1][0]: " + numbers2[1][0]);  // 30
                    
                    // Modifying elements
                    numbers2[1][0] = 99;
                    System.out.println("Modified number at index [1][0]: " + numbers2[1][0]);  // 99

                    int[][] matrix = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
                    
                    // Accessing 2D array elements
                    System.out.println("Element at position [0][0]: " + matrix[0][0]);  // 1
                    System.out.println("Element at position [2][1]: " + matrix[2][1]);  // 8
                    // Accessing 2D array elements using for loop
                    System.out.println("Accessing using for loop statement");
                    for(int row=0;row<3;row++)
                    for(int column=0;column<3;column++)
                    {
                        System.out.println("Element at position["+row+"]["+column+"]: "+ matrix[row][column]);
                    }

                    int[][] matrixA = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
                    int[][] matrixB = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
                    int[][] result=new int[3][3];
                    for(int row=0;row<3;row++)
                    {
                    for(int column=0;column<3;column++)
                    {
                        result[row][column]=matrixA[row][column]+matrixB[row][column];
                    }
                    }
                    System.out.println("Accessing Result matrix");
                    for(int row=0;row<3;row++)
                    for(int column=0;column<3;column++)
                    {
                        System.out.println("Element at position["+row+"]["+column+"]: "+ result[row][column]);
                    }

    }
}
/*
 * Write a program which multiple two matrix, MatrixA and MatrixB.
 */