package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class label extends JFrame {
    private  JLabel label;
    private JTextField Textfield;
    private JPasswordField Password;


    public label(){
        super("LABEL");
        setLayout(new FlowLayout());
        label = new JLabel("ENTER PHONE NUMBER:");
        add(label);

        Textfield = new JTextField(10);
        add(Textfield);

       label = new JLabel("ENTER YOUR PASSWORD");
       add(label);
        Password = new JPasswordField("denno");
        add(Password);

        thehandle handler = new thehandle();
        Textfield.addActionListener(handler);
        Password.addActionListener(handler);




    }
    private class thehandle implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            String string = "";

            if (e.getSource()==Textfield){
                string = String.format("Field 1: %s",e.getActionCommand());
            }
            else if (e.getSource()==Password){
                string = String.format("Password field: %s",e.getActionCommand());

            }
            JOptionPane.showMessageDialog(null,string);
        }
    }






}
