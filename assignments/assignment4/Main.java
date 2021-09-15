package co.arpitha.training.assignments.assignment4;

import co.arpitha.training.assignments.assignment2.IsPrimeNumber;
import co.arpitha.training.Utils.KeyboardUtils;

public class Main {
    public static int sumOfPrimes(int from, int to) {
        //Initialize the sum to zero
        int sum = 0;
        //loop all numbers between from and to
        for (int i = from; i <= to; i++) {
            //Calling isPrimeNumber() from assignment2 to check if a number is prime or not
            //If a number is prime it is added to the sum
            if (IsPrimeNumber.isPrimeNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //Read from number and to number
        int number1 = KeyboardUtils.getInt("Enter from number");
        int number2 = KeyboardUtils.getInt("Enter to number");
        //Call sumOfPrimes() to get sum of all prime numbers from number1 to number2
        int sum = sumOfPrimes(number1, number2);
        System.out.println("The sum of primes between " + number1 + " to " + number2 + " is " + sum);
    }
}

/*OUTPUT
Enter from number5
Enter to number20
The sum of primes between 5 to 20 is 72
 */
