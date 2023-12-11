package edu.neu.csye6200;
import edu.neu.csye6200.utils.Passengers;
import edu.neu.csye6200.utils.StringRes;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class BookInternationalFlight extends JFrame {

    private JPanel contentPane;
    private JTable flightTable;
    private String visaStatus="0";

/**
 * Launch the application.
 */

