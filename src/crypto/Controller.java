/**
 * Caesar cipher English alphabetic cryptography with
 * encryption, decryption and encryption breaking.
 */
package crypto;

import java.util.Scanner;

/**
 * @author antiik.dev
 * @version 6 Jul 2022
 */
public class Controller {
    
    
    /**
     * Encrypt a user message
     */
    public static void encrypt() {
        return;
    }
    
    
    /**
     * Decrypt a user message
     */
    public static void decrypt() {
        return;
    }
    
    
    /**
     * Crack a Caesar chipser code
     */
    public static void crack() {
        return;
    }
    
    
    /**
     * Clear command line screen (Java)
     * Method from Youtube channel "Ubuntu Tricks", Stackoverflow "J. Bosboom"
     */
    public static void cls() {
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
            System.out.println("Error:" + ex);
        }
    }

    
    /**
     * Start menu user interface
     * @return false if user chooses to quit, otherwise true to continue
     */
    private static boolean menu() {
        // Note: Clear console works in command line, not in Eclipse
        cls();
        
        // Read user input with Scanner class
        Scanner scan = new Scanner(System.in);
        
        // User Interface:
        System.out.println("Select a number and press enter "
                + "to choose a menu option");
        System.out.println("1. Encrypt message");
        System.out.println("2. Decrypt message");
        System.out.println("3. Crack the encryption");
        System.out.println("4. Exit ");
        System.out.print("Selection >");
        int selection = scan.nextInt();
        
        // Menu options selection:
        switch (selection) {
        case 1:  { // Encrypt
            System.out.println("Function not yet available.");
            encrypt();
            break;
        }
        case 2:  { // Decrypt
            System.out.println("Function not yet available.");
            decrypt();
            break;
        }
        case 3:  { // Crack the encryption
            System.out.println("Function not yet available.");
            crack();
            break;
        }
        case 4:  { // Exit menu
            System.out.println("Thank you and bye!");
            return false;
        }
        default:
            throw new IllegalArgumentException("Unexpected value: " + selection);
        }
        return true;
    }
   
    
// --------------------------------------------------
    /**
     * Main for testing
     * @param args not in use
     */
    public static void main(String[] args) {
        boolean start = true;
        
        while (start == true) {
            start = menu();
        }
    }

}
