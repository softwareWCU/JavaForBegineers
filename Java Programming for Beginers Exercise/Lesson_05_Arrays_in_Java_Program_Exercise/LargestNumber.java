package Lesson_05_Arrays_in_Java_Program_Exercise;

public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 15};
        int largest = numbers[0];
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest Number: " + largest);
    }
}
