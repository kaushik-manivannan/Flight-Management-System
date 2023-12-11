package edu.neu.csye6200;

import java.awt.EventQueue;//it is an independent thread
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.Arrays;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
            try {
                Login frame = new Login();
				frame.setTitle("Login Page");
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
	}

	public Login() {
		setMainFrameProperties();
		createContentPane();
		addWelcomeLabel();
		addUsernameLabel();
		addPasswordLabel();
		addUsernameTextField();
		addLoginButton();
		addSignUpButton();
		addNewLabel();
		addPasswordField();
		addBackButton();
	}

	private void setMainFrameProperties() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 401);
	}

	private void createContentPane() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	private void addWelcomeLabel() {
		JLabel welcomeLabel = new JLabel("Welcome to Airline Flight Management System ");
		welcomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setBounds(41, 11, 414, 24);
		contentPane.add(welcomeLabel);
	}

	private void addUsernameLabel() {
		JLabel label1 = new JLabel("Username");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label1.setBounds(10, 46, 83, 17);
		contentPane.add(label1);
	}

	private void addPasswordLabel() {
		JLabel label2 = new JLabel("Password");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label2.setBounds(10, 71, 83, 17);
		contentPane.add(label2);
	}

	private void addUsernameTextField() {
		username = new JTextField();
		username.setBounds(103, 43, 121, 20);
		contentPane.add(username);
		username.setColumns(10);
	}


	private void addLoginButton() {
		JButton loginbtn = new JButton("Login");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleLogin();
			}
		});
		loginbtn.setBounds(103, 99, 89, 23);
		contentPane.add(loginbtn);
	}

	private void addSignUpButton() {
		JButton signupbtn = new JButton("Sign Up");
		signupbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSignUp();
			}
		});
		signupbtn.setBounds(103, 133, 89, 23);
		contentPane.add(signupbtn);
	}

	private void addNewLabel() {
		JLabel label3 = new JLabel("New User?");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label3.setBounds(10, 137, 83, 19);
		contentPane.add(label3);
	}

	private void addPasswordField() {
		password = new JPasswordField();
		password.setBounds(103, 71, 121, 20);
		contentPane.add(password);
	}

	private void addBackButton() {
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(419, 137, 89, 23);
		contentPane.add(btnNewButton);
	}

	private void handleLogin() {
		String name = username.getName().trim();//1 19:32
		String pass = Arrays.toString(password.getPassword()); //2
		if (user.length() == 0 || pass.length() == 0) //3
		{
			JOptionPane.showMessageDialog(null,"Enter all the fields","Warning",JOptionPane.WARNING_MESSAGE);
		}


		for (Passengers x : SignUP.PassengerList) {
			if (username.getText().equals(x.getUsername()) && password.getText().equals(x.getPassword())) {
				BookingMenu obj = new BookingMenu();
				obj.setVisible(true);
				dispose();
			} else if (username.getText().equals(x.getUsername())) {
				JOptionPane.showMessageDialog(null,"Incorrect Password","Warning",JOptionPane.WARNING_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,"You are not a registered user","Warning",JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	private void handleSignUp() {
		dispose();
		SignUP obj = new SignUP();
		obj.setVisible(true);
	}
}

