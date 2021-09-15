package co.arpitha.training.assignments.assignment10;

import co.arpitha.training.Utils.KeyboardUtils;

public class Main {
    public static String reverseByWords(String sentence) {
        //Split the sentence into words
        String[] words = sentence.split(" ");
        //Create out String
        String out = "";
        //Loop the words from end and add to the out String
        for (int i = words.length - 1; i >= 0; i--) {
            out += words[i];
            out += " ";
        }
        return out;
    }

    public static void main(String[] args) {
        //Read a setence from user
        String sentence = KeyboardUtils.getLine("Enter Sentence to be reversed: ");
        //Call reverByWords() and print the result obtained
        String out = reverseByWords(sentence);
        System.out.println("Reversed sentence is: " + out);
        return;
    }
}
/*OUTPUT
Enter Sentence to be reversed: I am learning Java
Reversed sentence is: Java learning am I
******
Enter Sentence to be reversed: Hey I got your back
Reversed sentence is: back your got I Hey
 */