/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        String palindrome = JOptionPane.showInputDialog("Enter a word to check");
        char[] arr = new char[palindrome.length()];
        for(int i = 0; i < palindrome.length(); i++){
            arr[i] = palindrome.charAt(i);
        }
        String newString = "";
        for(int i = 0; i < palindrome.length(); i++){
            newString = arr[i] + newString;
        }
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
