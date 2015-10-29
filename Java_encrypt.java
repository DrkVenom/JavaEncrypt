package java_encrypt;

/**
 * created by:      Tony Ranieri
 * creation date:   Oct 2015
 */

import javax.swing.JFrame;

public class Java_encrypt {

    public static void main(String[] args) {
        
        window primary = new window();
        primary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        primary.setVisible(true);
        primary.setLocation(550, 500);
        primary.setSize(850, 600);
        primary.setTitle("Portable Encryption");
    }
    
}
