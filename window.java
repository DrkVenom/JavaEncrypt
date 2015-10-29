package java_encrypt;

/**
 * created by:      Tony Ranieri
 * creation date:   Oct 2015
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class window extends JFrame implements ActionListener{
    
    //Create text fields
    private JTextArea input, output;
    private JScrollPane inputPane, outputPane;
    private JButton encrypt, decrypt, copy; 
    private JLabel prikey, pubkey, gen; 
    private JSeparator horline;
    
    public window() {
        setLayout(null);
        
        prikey = new JLabel("private key");
        prikey.setFont(new Font("Courier New", Font.ITALIC, 12));
        prikey.setLocation(27, 20);
        add(prikey);
        
        input = new JTextArea();
        input.setLineWrap(true);
        input.setWrapStyleWord(true);
        inputPane = new JScrollPane(input);
        inputPane.setBounds(20,200,650,150);
        add(inputPane);
             
        output = new JTextArea();
        output.setLineWrap(true);
        output.setWrapStyleWord(true);
        outputPane = new JScrollPane(output);
        outputPane.setBounds(20,375,650,150);
        add(outputPane);
        
        encrypt = new JButton("Encrypt");
        encrypt.setBounds(690,200,100,20);
        encrypt.addActionListener(this);
        add(encrypt);
        
        decrypt = new JButton("Decrypt");
        decrypt.setBounds(690,240,100,20);
        decrypt.addActionListener(this);
        add(decrypt);
        
        copy = new JButton("Copy");
        copy.setBounds(690,375,100,20);
        copy.addActionListener(this);
        add(copy);
    } 
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== encrypt ) {
            output.setText(input.getText());
            }
        if(e.getSource()== decrypt ) {
            output.setText(input.getText());
            }
      }
    
}
