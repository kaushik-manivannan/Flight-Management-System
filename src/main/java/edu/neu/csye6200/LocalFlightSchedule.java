package edu.neu.csye6200;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class LocalFlightSchedule extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JButton btnAdd;
	private JButton btnDelete;
	private JButton btnEdit;
	private JLabel lblLocalFlightSchedule;
	private JButton btnBack;
	static ArrayList<Flight> flightList = new ArrayList<Flight>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalFlightSchedule frame = new LocalFlightSchedule();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LocalFlightSchedule() {
		setMainFrameProperties();
		createContentPane();
		initializeTable();
		addButtons();
		addLabels();
	}

	private void setMainFrameProperties() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 423);
	}

	private void createContentPane() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	private void initializeTable() {
		String[] columns = {"Flight ID", "Time", "Date", "Departure Destination",
				"Land Destination", "Economy Seats", "Business Seats", "Time Duration"};

		DefaultTableModel obj = new DefaultTableModel(columns, 0);

		for (Flight flight : LocalFlightSchedule.flightList) {
			Object[] update = {flight.getFlightID(), flight.getDepartTime(), flight.getLandTime(),
					flight.getDepartDestination(), flight.getLandDestination(),
					flight.getEconomySeats(), flight.getBusinessSeats(), flight.getDistance()};

			obj.addRow(update);
		}
