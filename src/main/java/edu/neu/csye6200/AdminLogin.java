package edu.neu.csye6200;


import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AdminLogin extends JFrame {

    //Content pane for organizing components
    private JPanel contentPane;

    //Text field for entering the username
    private JTextField usernameField;
    //Password field for entering the password
    private JPasswordField passwordField;
    private static ArrayList<Admin> adminList = new ArrayList<>();  //List to store admin objects

    public static void main(String[] args) {
        // Use EventQueue to ensure GUI-related tasks run on the event-dispatching thread
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminLogin frame = new AdminLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
