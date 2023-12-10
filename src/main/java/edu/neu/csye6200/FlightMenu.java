package edu.neu.csye6200;

import edu.neu.csye6200.utils.StringRes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FlightMenu extends JFrame {

	private JPanel contentPane;


	/**
	 * Main method to launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				FlightMenu frame = new FlightMenu();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Constructor to create frame.
	 */
	public FlightMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 406);
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());

		JLabel titleLabel = new JLabel(StringRes.TITLE.getValue());
		titleLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(titleLabel, BorderLayout.NORTH);

		JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 0, 50));

		JButton localScheduleButton = createButton("Local Flight Schedule", e -> {
		});
		buttonPanel.add(localScheduleButton);

		JButton internationalFlightsButton = createButton("International Flights", e -> {

		});
		buttonPanel.add(internationalFlightsButton);

		JButton backButton = createButton(StringRes.BACK.getValue(), e -> {
			UserModeSelection obj = new UserModeSelection();
			obj.setVisible(true);
			dispose();
		});
		buttonPanel.add(backButton);

		contentPane.add(buttonPanel, BorderLayout.CENTER);
	}

	private JButton createButton(String label, ActionListener actionListener) {
		JButton button = new JButton(label);
		button.addActionListener(actionListener);
		return button;
	}
}