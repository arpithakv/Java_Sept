package co.arpitha.training.assignments.assignment2;

public class IsPrimeNumber {
    //Checks if a Number is Prime.
    // If it is Prime returns true else returns false.
    public static boolean isPrimeNumber(int num) {
        //if number is 2 return true.
        if(num == 2){
            return true;
        }
        //If number is divisible by another return false.
        for(int i =2 ; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        //If number is not divisible by another return true.
        return true;
    }
}

