/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.tp3.ihm;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JavaApplicationTp3IHM {

    public static void main(String[] args) {
        JFrame f =new JFrame("TP3");
        f.setSize(450, 300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        
        JLabel first = new JLabel("First Name:");
        JTextField firstField = new JTextField();

        JLabel last = new JLabel("Last Name:");
        JTextField lastField = new JTextField();

        JLabel age = new JLabel("Age:");
        JTextField ageField = new JTextField();

        first.setBounds(30, 50, 100, 25);
        firstField.setBounds(130, 50, 120, 25);

        last.setBounds(30, 80, 100, 25);
        lastField.setBounds(130, 80, 120, 25);

        age.setBounds(30, 110, 100, 25);
        ageField.setBounds(130, 110, 120, 25);

    f.add(first);
    f.add(firstField);
    f.add(last);
    f.add(lastField);
    f.add(age);
    f.add(ageField);

    JCheckBox student = new JCheckBox("Are you a student?");
    student.setBounds(260, 50, 150, 25);

    JCheckBox javaLover = new JCheckBox("Do you like Java?");
    javaLover.setBounds(260, 80, 150, 25);

    f.add(student);
    f.add(javaLover);

    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");
    JButton help = new JButton("Help");

    ok.setBounds(60, 200, 80, 30);
    cancel.setBounds(160, 200, 80, 30);
    help.setBounds(260, 200, 80, 30);

    f.add(ok);
    f.add(cancel);
    f.add(help);

        f.setVisible(true);
    }
}
