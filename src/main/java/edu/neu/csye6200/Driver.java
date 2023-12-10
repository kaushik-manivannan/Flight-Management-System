package edu.neu.csye6200;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Driver extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver frame = new Driver();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Driver() {
		setMainFrameProperties();
		createContentPane();
		addWelcomeLabel();
		addLoginTypeButton();
		addExitButton();
		initializeFlightData();
	}

	private void setMainFrameProperties() {
//		setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 451);
	}

	private void createContentPane() {
		contentPane = new JPanel();
//		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	private void addWelcomeLabel() {
		JLabel welcomeLabel = new JLabel("Welcome to Airline Flight Management System ");

		welcomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
		welcomeLabel.setBounds(81, 11, 414, 28);
		contentPane.add(welcomeLabel);
	}

	private void addLoginTypeButton() {
		JButton loginTypeButton = new JButton("Click here to select your login type");
		loginTypeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModeSelection modeSelection = new ModeSelection();
				modeSelection.setVisible(true);
			}
		});
		loginTypeButton.setBounds(158, 129, 249, 23);
		contentPane.add(loginTypeButton);
	}

	private void addExitButton() {
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setBounds(552, 277, 89, 23);
		contentPane.add(exitButton);
	}