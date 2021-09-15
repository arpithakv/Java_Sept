package co.arpitha.training.assignments.assignment3;

import co.arpitha.training.Utils.KeyboardUtils;

public class Main {
    public static void sortThreeNumbers(int a, int b, int c) {
        //temp variable used for swapping numbers
        int temp;
        if (a > b) {
            temp = b;
            b = a;
            a = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.printf("Sorted Number list is: %d, %d , %d", a, b, c);
    }

    public static void main(String[] args) {
        //Read three input numbers.
        int number1 = KeyboardUtils.getInt("Enter number 1");
        int number2 = KeyboardUtils.getInt("Enter number 2");
        int number3 = KeyboardUtils.getInt("Enter number 3");
        //sort and print numbers using sortThreeNumbers()
        sortThreeNumbers(number1, number2, number3);

    }
}

/*OUTPUT
Enter number 15
Enter number 21
Enter number 33
Sorted Number list is: 1, 3 , 5
*******
Enter number 117
Enter number 28
Enter number 312
Sorted Number list is: 8, 12 , 17
 */