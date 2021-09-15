package co.arpitha.training.assignments.assignment9;

import co.arpitha.training.Utils.KeyboardUtils;

import java.util.Scanner;

public class Main {
    public static int[] sumOfEvensAndOdds(int[] nums) {
        //Create a result array
        int[] result = {0, 0};
        //Loop all the numbers in nums array
        for (int num : nums) {
            //If number is even: add number to result[0] , else add number to result[1]
            if (num % 2 == 0) {
                result[0] += num;
            } else {
                result[1] += num;
            }
        }
        return result;
    }

    public static int[] getNumbers(int[] nums, int size) {
        //A function to read a number of inputs  and return an array of numbers
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    public static void main(String[] args) {
        //Take the number of inputs user is going to enter
        int size = KeyboardUtils.getInt("Enter size of array");
        //Create an array of the size entered
        int nums[] = new int[size];
        //Read the numbers using getNumbers()
        nums = getNumbers(nums, size);
        //Find result which has two numbers using sumOfEvensAndOdds():
        // result[0] --> sum of even numbers  and result[1] ----> sum of odd numbers
        int[] result = sumOfEvensAndOdds(nums);
        System.out.println("Sum of even numbers is: " + result[0] + " and Sum of odd Numbers is: " + result[1]);
        return;

    }
}
/*OUTPUT
Enter size of array5
Enter the numbers
78
3
5
99
2
Sum of even numbers is: 80 and Sum of odd Numbers is: 107
 */