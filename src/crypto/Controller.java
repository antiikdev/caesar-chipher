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
    private static void encrypt() {
        cls(); // clear screen
        // User input
        Scanner scn = new Scanner(System.in); 
        System.out.print("Write a message to encrypt> ");
        String message = scn.next();
        
        // Encryption
        Encrypt encrypted = new Encrypt(message);
        System.out.println("Original:  " + encrypted.toString());
        encrypted.encryption();
        System.out.println("Encrypted: " + encrypted.toString().toUpperCase());
        encrypted.encryptionMethod();
        pressEnterToContinue();
    }
    
    
    /**
     * Decrypt a user message
     */
    private static void decrypt() {
        cls(); // clear screen
        // User input
        Scanner scn = new Scanner(System.in); 
        System.out.print("Write a message to decrypt> ");
        String message = scn.next();
        
        // Encryption
        Decrypt encrypted = new Decrypt(message);
        System.out.println("Original:  " + encrypted.toString());
        encrypted.decryption();
        System.out.println("Decrypted: " + encrypted.toString().toUpperCase());
        encrypted.decryptionMethod();
        pressEnterToContinue();
    }
    
    
    /**
     * Crack a Caesar chipser code
     */
    private static void crack() {
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
     * Press Enter key to continue method
     * Waits user to press Enter key before continuing.
     * Source: Stackoverflow user E235
     */
    private static void pressEnterToContinue()
    { 
           System.out.println("Press Enter key to continue...");
           try
           {
               System.in.read();
           }  
           catch(Exception e)
           { 
               // empty
           }  
    }
    
    /**
     * About the program
     */
    private static void about() {
        System.out.println("Caesar cipher English alphabetic cryptography with\r\n"
                + " * encryption, decryption and encryption breaking.");
        System.out.println("(c) Antiik.dev (MIT license)");
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
        System.out.println("4. Setup caesar encryption rotation number");
        System.out.println("5. About");
        System.out.println("6. Exit ");
        System.out.print("Selection > ");
        int selection = scan.nextInt();
        
        // Menu options selection:
        switch (selection) {
        case 1:  { // Encrypt
            encrypt();
            break;
        }
        case 2:  { // Decrypt
            decrypt();
            break;
        }
        case 3:  { // Crack the encryption
            System.out.println("Function not yet available.");
            crack();
            break;
        }
        case 4:  { // Setup caesar encyption rotation number
            // setup();
            break;
        }
        case 5:  { // About
            about();
            break;
        }
        case 6:  { // Exit menu
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
