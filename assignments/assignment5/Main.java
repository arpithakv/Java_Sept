package co.arpitha.training.assignments.assignment5;

import co.arpitha.training.Utils.KeyboardUtils;

public class Main {
    public static int fibonacci(int index) {
        //Fibonacci Series code
        if (index == 1) {
            return 0;
        }
        if (index == 2) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i < index; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        //Read the index to find the number in Fibonacci series at that index
        int index = KeyboardUtils.getInt("Enter the index of Fibonacci series: ");
        //Call fibonacci() to get numberAtIndex
        int numberAtIndex = fibonacci(index);
        System.out.println("The number at index: " + index + " of fibonacci series is: " + numberAtIndex);
    }
}
/*OUTPUT
Enter the index of Fibonacci series: 5
The number at index: 5 of fibonacci series is: 3
********
Enter the index of Fibonacci series: 10
The number at index: 10 of fibonacci series is: 34
 */