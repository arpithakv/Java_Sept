package co.arpitha.training.assignments.assignment11;

import co.arpitha.training.Utils.KeyboardUtils;

public class Main {
    private static final String[] units = {"zero", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine"};
    private static final String[] teens = {" ten", " eleven", " twelve", "thirteen", "fourteen", " fifteen", "sixteen", "seventeen", "eighteen,", "nineteen"};
    private static final String[] tens = {"twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};

    public static String inWords(int num) {
        String[] words = new String[5];

        if (num != 0) {
            words[0] = getWords(num % 100);

        } else {
            words[0] = "zero";
        }
        num = num / 100;
        if (num != 0) {
            int hundredsDigit = num % 10;
            words[1] = units[hundredsDigit];
        } else {
            words[1] = "zero";
        }
        num = num / 10;
        if (num != 0) {
            words[2] = getWords(num % 100);

        } else {
            words[2] = "zero";
        }
        num = num / 100;
        if (num != 0) {
            words[3] = getWords(num % 100);
        } else {
            words[3] = "zero";
        }
        num = num / 100;
        if (num != 0) {
            words[4] = getWords(num % 100);
        } else {
            words[4] = "zero";
        }
        String numInWords = "";
        String[] places = {" ", " hundreds ", " thousands ", " lakhs ", " crores "};
        for (int i = 0; i <= 4; i++) {
            if (words[i] != "zero") {
                numInWords = words[i] + places[i] + numInWords;
            }
        }
        if (numInWords == "") {
            return "zero";
        }
        return numInWords;
    }

    public static String getWords(int digits) {
        if (digits / 10 == 0) {
            return units[digits % 10];
        } else if (digits / 10 == 1) {
            return teens[digits % 10];
        } else {
            if (digits % 10 == 0) {
                return tens[(digits / 10) - 2];
            } else {
                return tens[(digits / 10) - 2] + units[digits % 10];
            }
        }
    }

    public static void main(String[] args) {
        //Read the number
        int number = KeyboardUtils.getInt("Enter the number : ");
        //Call inWords() and print the numberInWords
        String numberInWords = inWords(number);
        System.out.println("Number in words is: " + numberInWords);
    }
}
/*OUTPUT
Enter the number : 101
Number in words is:  one hundreds  one
********
Enter the number : 997000611
Number in words is:  ninety nine crores  seventy lakhs  six hundreds  eleven
********
Enter the number : 543001
Number in words is:  five lakhs  forty three thousands  one
 */