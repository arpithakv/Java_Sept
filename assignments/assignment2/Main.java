package co.arpitha.training.assignments.assignment2;

import co.arpitha.training.Utils.KeyboardUtils;

public class Main {
    public static void main(String[] args) {

        //Read input number
        int number = KeyboardUtils.getInt("Enter number to check if prime : ");
        //Check if number is prime or not using isPrimeNumber()
        boolean isPrime = IsPrimeNumber.isPrimeNumber(number);
        if (isPrime) {
            System.out.println("Yes, the number " + number + " is a Prime Number.");
        } else {
            System.out.println("No, the number " + number + " is not a Prime Number.");
        }
    }
}

/* OUTPUT
Enter number to check if prime : 5
Yes, the number 5 is a Prime Number.
******
Enter number to check if prime : 15
No, the number 15 is not a Prime Number.
 */