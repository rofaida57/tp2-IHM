/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.tp3.ihm;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

public class JavaApplicationTp3IHM {

    public static void main(String[] args) {
        JFrame f = new JFrame("hello rofaida");
        f.setSize(400,300);
        f.setVisible(true);
        
        JTextField t = new JTextField("text");
        JTextField t1 = new JTextField("");
        JTextField t2 = new JTextField("");
        t.setBounds(30, 30, 300, 60);
        t1.setBounds(30, 100, 130, 40);
        t2.setBounds(200, 100, 130, 40);
        f.add(t);
        f.add(t1);
        f.add(t2);
        

        
        JButton b = new JButton("click1");
        JButton bb = new JButton("click2");
        b.setBounds(40, 160, 100, 30);
        bb.setBounds(210, 160, 100, 30);
        f.add(b);
        f.add(bb);
        
        b.addActionListener((ActionEvent E) ->{
        t.setText("hello rofaida");
        });
        
        bb.addActionListener((ActionEvent g) ->{
           int x1 =Integer.parseInt(t1.getText());
           int x2 =Integer.parseInt(t2.getText());
           int x3 =x1+x2;
           t.setText(Integer.toString(x3));
            
    });
        
        f.setLayout(null);
        f.setVisible(true);
    }

    

    
    
}
