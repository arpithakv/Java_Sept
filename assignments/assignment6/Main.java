package co.arpitha.training.assignments.assignment6;

import co.arpitha.training.Utils.KeyboardUtils;

public class Main {
    public static void printPattern(int numberOfRows) {
        //loops till numberOfRows and prints "*" equal to the row number
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return;
    }

    public static void main(String[] args) {
        //Read the numberOfRows of the pattern to be printed
        int numberOfRows = KeyboardUtils.getInt("Enter the number of rows : ");
        //Call the printPattern() to print the output
        printPattern(numberOfRows);
        return;
    }
}
/*OUTPUT
Enter the number of rows : 5
*
**
***
****
*****
------------
Enter the number of rows : 3
*
**
***
------------
 */