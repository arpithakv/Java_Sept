package co.arpitha.training.Utils;

import java.util.Scanner;

public class KeyboardUtils {

    public static int getInt(String message){
        System.out.printf(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String getLine(String message){
        System.out.printf(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
