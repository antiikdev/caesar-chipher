/**
 * Caesar cipher English alphabetic cryptography
 * decryption.
 */
package crypto;

/**
 * Decrypt with Caesar cipher
 * @author antiik.dev
 * @version 5 Jul 2022
 */
public class Decrypt {

    private StringBuilder text = new StringBuilder();
    // MODIFY DECRYPTION for fixed number of positions:
    // How many alphabets forward (positive integer) or backwards (negative):
    private final int rotationAdd = 3;
    
    
    /**
     * Initialize class
     */
    public Decrypt() {
        // Initialize class 
    }
    
    
    /**
     * Adds a String text to the class
     * StringBuilder attribute
     * @param t string message to be decrypted
     */
    public Decrypt(String t) {
        text.append(t);
    }
    
    
    
    /**
     * Caesar chipher forward counting encryption 
     */
    public void decryption() {
        for (int i = 0; i < text.length(); i++) {
            char letter = this.text.charAt(i);
            
            // Rotate alphabets:
            letter -= this.rotationAdd;

            // Test
            if ( this.rotationAdd > 0 && letter > 'z') {
                int difference = letter - 'z'; // difference in ascii
                letter = 'a'; // start counting from letter 'a'
                letter += difference-1; // count from orig letter (-1)
            }
            if ( this.rotationAdd < 0 && letter < 'a') {
                int difference = 'a' - letter; // difference in ascii
                letter = 'z'; //start counting from letter 'a'
                letter -= difference-1; // count from orig letter (-1)
            }
            this.text.setCharAt(i, letter);
        }
    }
    
    
    /**
     * Prints String of substitution cipher direction and count
     */
    public void decryptionMethod() {
        System.out.print("Decrpytion completed with ");
        if ( this.rotationAdd > 0) {
            System.out.println("left shift of " + this.rotationAdd);
        }
        else System.out.println("right shift of " + this.rotationAdd);
    }
    
    
    /**
     * Prints StringBuilder to String
     * @return String
     */
    @Override
    public String toString() {
        return this.text.toString();
    }

    
// ---------------------------------------------------------------
    /**
     * Main for testing
     * @param args not in use
     */
    public static void main(String[] args) {
        Decrypt secret = new Decrypt("vhfuhw");
        System.out.println("Crypted:  " + secret.toString());
        secret.decryption();
        System.out.println("Decrypted: " + secret.toString().toUpperCase());
        secret.decryptionMethod();
    }

}
