package edu.neu.csye6200;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
				UserModeSelection userModeSelection = new UserModeSelection();
				userModeSelection.setVisible(true);
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

	private void initializeFlightData() {
		Flight localFlight1 = new Flight("BK001", "10:00-12:00", "20-12-2021", "Birmingham", "London", "30", "10", "2");
		Flight localFlight2 = new Flight("B002", "01:00-03:00", "20-12-2021", "London", "Manchester", "25", "07", "4");
		Flight localFlight3 = new Flight("B003", "10:00-01:00", "20-12-2021", "Leeds", "Birmingham", "22", "06", "3");
		Flight localFlight4 = new Flight("E004", "02:00-05:00", "20-12-2021", "Manchester", "Bristol", "18", "05", "3");
		Flight localFlight5 = new Flight("T005", "10:00-12:00", "20-12-2021", "Liverpool", "Leeds", "21", "09", "2");
		Flight localFlight6 = new Flight("A006", "10:00-12:00", "20-12-2021", "Bristol", "Manchester", "17", "08", "2");

		LocalFlightSchedule.flightList.add(localFlight1);
		LocalFlightSchedule.flightList.add(localFlight2);
		LocalFlightSchedule.flightList.add(localFlight3);
		LocalFlightSchedule.flightList.add(localFlight4);
		LocalFlightSchedule.flightList.add(localFlight5);
		LocalFlightSchedule.flightList.add(localFlight6);

		InternationalFlight internationalFlight1 = new InternationalFlight("PC001", "10:00-12:00", "20-12-2021", "Manchester", "Oslo", "30", "10", "2");
		InternationalFlight internationalFlight2 = new InternationalFlight("PA002", "01:00-03:00", "20-12-2021", "Brussels", "Washington", "25", "07", "4");
		InternationalFlight internationalFlight3 = new InternationalFlight("PI003", "10:00-01:00", "20-12-2021", "Boston", "Miami", "22", "02", "3");
		InternationalFlight internationalFlight4 = new InternationalFlight("PS004", "02:00-05:00", "20-12-2021", "Chicago", "Barcelona", "18", "00", "3");
		InternationalFlight internationalFlight5 = new InternationalFlight("PF005", "10:00-12:00", "20-12-2021", "Vegas", "Osaka", "21", "09", "2");
		InternationalFlight internationalFlight6 = new InternationalFlight("PT006", "10:00-12:00", "20-12-2021", "Los Angeles", "Toronto", "17", "01", "2");

		InternationalFlightSchedule.flightList2.add(internationalFlight1);
		InternationalFlightSchedule.flightList2.add(internationalFlight2);
		InternationalFlightSchedule.flightList2.add(internationalFlight3);
		InternationalFlightSchedule.flightList2.add(internationalFlight4);
		InternationalFlightSchedule.flightList2.add(internationalFlight5);
		InternationalFlightSchedule.flightList2.add(internationalFlight6);
	}
}

