package co.arpitha.training.assignments.assignment1;

import co.arpitha.training.Utils.KeyboardUtils;

public class Main {
    static boolean isValidDate(int year, int month, int day) {

        //Check if month is valid
        if (month <= 0 && month > 12) {
            return false;
        } //check if day is between 1-31 for months Jan, March, May, July, August, October, December
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return (day > 0 && day <= 31);
        }
        //check if day is between 1-30 for months April, June, September, November
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return (day > 0 && day <= 30);
        }
        //For month Feb
        else if (month == 2) {
            //Check if its a leap year and if leap year check if day is between 1-29
            if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
                return (day > 0 && day <= 29);
            }
            //If not a leap year check if date is between 1-28
            else {
                return (day > 0 && day <= 28);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Take input for year(yyyy), month(mm), day(dd)
        int year = KeyboardUtils.getInt("Enter year");
        int month = KeyboardUtils.getInt("Enter month");
        int day = KeyboardUtils.getInt("Enter day");
        //Call isValidDate function and check if date is Valid or Not.
        boolean isValid = isValidDate(year, month, day);
        if (isValid) {
            System.out.printf("Yes, the given date %d/%d/%d is a valid date.", day, month, year);
        } else {
            System.out.printf("No, the given date %d/%d/%d is not a valid date.", day, month, year);
        }

    }
}

/*  OUTPUT
Enter year 2018
Enter month 02
Enter day29
No, the given date 29/2/2018 is not a valid date.
******
Enter year2018
Enter month2
Enter day14
Yes, the given date 14/2/2018 is a valid date.
 */
