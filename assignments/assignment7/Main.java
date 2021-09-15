package co.arpitha.training.assignments.assignment7;

import java.util.Scanner;

public class Main {
    public static double sine(double x, int precision) {
        //Convert the degree of angle to radian
        x = x * Math.PI / 180;

        double answer = x, power = x;
        int n = 2, factorial = 1;
        //Loop till n<=precision usually precision is 10
        while (n <= precision) {
            power = (power * x * x * -1);
            factorial = (factorial * (n + 1) * n);
            answer = answer + ((power / factorial));
            n = n + 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Read the degree of angle
        System.out.println("Enter the angle in degree: ");
        double angle = sc.nextDouble();
        //Call sine() to calculate the sine of the angle
        double answer = sine(angle, 10);
        System.out.println("Sine of angle " + angle + " is : " + answer);
        return;
    }
}
/*OUTPUT
Enter the angle in degree:
45
Sine of angle 45.0 is : 0.7071067811796194
*********
Enter the angle in degree:
90
Sine of angle 90.0 is : 0.999999943741051
 */
