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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class JavaApplicationTp3IHM {

    public static void main(String[] args) {
        JFrame f = new JFrame("hello rofaida");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // مهم لإغلاق البرنامج
        
        JTextField t = new JTextField("text");
        JTextField t1 = new JTextField("");
        JTextField t2 = new JTextField("");
        t.setBounds(30, 30, 300, 60);
        t1.setBounds(30, 100, 130, 40);
        t2.setBounds(200, 100, 130, 40);
        
        JCheckBox j = new JCheckBox("no");
        j.setBounds(30, 220, 50, 30);
        
        String c[] = {"add", "div", "sub"};
        JComboBox<String> co = new JComboBox<>(c); // تحديد النوع
        co.setBounds(190, 220, 50, 30);
        
        JButton b = new JButton("click1");
        JButton bb = new JButton("click2");
        b.setBounds(40, 160, 100, 30);
        bb.setBounds(210, 160, 100, 30);
        
        // إضافة جميع المكونات أولاً
        f.add(t);
        f.add(t1);
        f.add(t2);
        f.add(j);
        f.add(co);
        f.add(b);
        f.add(bb);
        
        f.setLayout(null);
        
        // الأحداث
        b.addActionListener((ActionEvent E) -> {
            t.setText("hello rofaida");
        });
        
        bb.addActionListener((ActionEvent g) -> {
            try {
                int x1 = Integer.parseInt(t1.getText());
                int x2 = Integer.parseInt(t2.getText());
                
                // استخدام الـ ComboBox لاختيار العملية
                String operation = (String) co.getSelectedItem();
                int result = 0;
                
                switch(operation) {
                    case "add":
                        result = x1 + x2;
                        break;
                    case "sub":
                        result = x1 - x2;
                        break;
                    case "div":
                        if(x2 != 0) {
                            result = x1 / x2;
                        } else {
                            JOptionPane.showMessageDialog(f, "لا يمكن القسمة على صفر!");
                            return;
                        }
                        break;
                }
                
                t.setText(Integer.toString(result));
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(f, "الرجاء إدخال أرقام صحيحة فقط!");
            }
        });
        
        f.setVisible(true);
    }
}
