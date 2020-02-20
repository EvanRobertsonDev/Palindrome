/*
 * Evan Robertson
 * February 20 2020
 * Palindrome.java
 * This program revesres a word to see if it is the same
 */

package palindrome;
import javax.swing.*;


/**
 *
 * @author evrob0095
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Get input
        String palindrome = JOptionPane.showInputDialog("Enter a word to check");
        //make array to get all characters of string
        char[] arr = new char[palindrome.length()];
        //Turn string into array
        for(int i = 0; i < palindrome.length(); i++){
            arr[i] = palindrome.charAt(i);
        }
        //Rewrite backwards
        String newString = "";
        for(int i = 0; i < palindrome.length(); i++){
            newString = arr[i] + newString;
        }
        //
        if (palindrome.equals(newString)) {
            JOptionPane.showMessageDialog(null, "Your word: " + palindrome + ", "
                    + "is the same when reversed and is therefore a palindrome");
        }
        else {
            JOptionPane.showMessageDialog(null, "Your word: " + palindrome + ", "
                    + "is not the same when reversed and is therefore is not a palindrome");
        }
    }
    
}
