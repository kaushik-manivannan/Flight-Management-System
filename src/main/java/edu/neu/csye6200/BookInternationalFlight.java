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

public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
        try {
            BookInternationalFlight frame = new BookInternationalFlight();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    });
}

    /**
     * Constructor for the BookInternationalFlight class.
     * Initializes the GUI components and sets up the flight schedule table.
     */
    public BookInternationalFlight() {
        // Setting up the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 872, 433);
        setTitle("Book International DomesticFlight");
        // Creating the content pane
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


