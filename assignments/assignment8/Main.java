package co.arpitha.training.assignments.assignment8;

import co.arpitha.training.Utils.KeyboardUtils;

public class Main {
    public static void printCalendar(int mm, int yy) {
        int d = 2;
        int m = 1;
        int y = 1;
        int dy = 1;

        // Storing days and months in array
        String[] day = {"SUN  ", "MON  ", "TUE  ", "WED  ",
                "THU  ", "FRI  ", "SAT  "};
        String[] month
                = {"JANUARY", "FEBRUARY", "MARCH",
                "APRIL", "MAY", "JUNE",
                "JULY", "AUGUST", "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER"};

        // Custom array as input
        int[] ar = {31, 29, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};

        // Till condition holds true
        while (d != 1 || m != mm || y != yy) {

            if (y % 4 == 0 || y % 100 == 0) {
                ar[1] = 29;
            } else {
                ar[1] = 28;
            }
            dy++;
            d++;
            if (d > ar[m - 1]) {
                m++;
                d = 1;
            }
            if (m > 12) {
                m = 1;
                y++;
            }
            if (dy == 7) {
                dy = 0;
            }
        }
        //Check for leap year: If leap year then ar[1] = 29 else ar[1] = 28
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            ar[1] = 29;
        } else {
            ar[1] = 28;
        }

        // Print the desired month and year of input year : MONTH: SEPTEMBER			YEAR: 2021
        System.out.println("MONTH: " + month[mm - 1] + "\t\t\t" + "YEAR: " + yy);

        //Print the days in first row : SUN   MON   TUE   WED   THU   FRI   SAT
        for (int k = 0; k < 7; k++) {
            System.out.print(" " + day[k]);
        }

        System.out.println();

        for (int j = 1; j <= (ar[mm - 1] + dy); j++) {
            if (j > 6) {
                dy = dy % 6;
            }
        }

        int spaces = dy;
        if (spaces < 0)
            spaces = 6;

        // Printing the calendar
        for (int i = 0; i < spaces; i++)
            System.out.print("      ");
        for (int i = 1; i <= ar[mm - 1]; i++) {
            System.out.printf(" %4d ", i);

            if (((i + spaces) % 7 == 0)
                    || (i == ar[mm - 1]))
                System.out.println();
        }
    }

    public static void main(String[] args) {
        //Take input for month and year
        int month = KeyboardUtils.getInt("Enter month(mm): ");
        int year = KeyboardUtils.getInt("Enter year(yyyy): ");
        //Call printCalendar to print the calendar of a particular month in a year
        printCalendar(month, year);

    }

}

/*OUTPUT
Enter month(mm): 09
Enter year(yyyy): 2021
MONTH: SEPTEMBER			YEAR: 2021
 SUN   MON   TUE   WED   THU   FRI   SAT
                      1     2     3     4
    5     6     7     8     9    10    11
   12    13    14    15    16    17    18
   19    20    21    22    23    24    25
   26    27    28    29    30
*********
Enter month(mm): 10
Enter year(yyyy): 2019
MONTH: OCTOBER			YEAR: 2019
 SUN   MON   TUE   WED   THU   FRI   SAT
                1     2     3     4     5
    6     7     8     9    10    11    12
   13    14    15    16    17    18    19
   20    21    22    23    24    25    26
   27    28    29    30    31
 */
