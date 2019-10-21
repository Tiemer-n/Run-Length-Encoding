/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runlengthencoding;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class RunLengthEncoding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a String to be Compressed: ");
        String text = input.next();
        String CompressedText = runLengthEncoding(text);
        System.out.println(CompressedText);
        System.out.println("you have saved "+(text.length()-CompressedText.length())+" Characters in space!");
    }
    public static String runLengthEncoding(String text) {
    String CompressedString = "";
    for (int i = 0, count = 1; i < text.length(); i++) {
        if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1))
            count++;
        else {
            CompressedString = CompressedString.concat(Integer.toString(count))
                    .concat(Character.toString(text.charAt(i)));
            count = 1;
        }
    }
    return CompressedString;
}
}


