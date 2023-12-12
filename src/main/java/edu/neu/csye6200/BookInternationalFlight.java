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

        // Adding GUI components such as labels, buttons, and table
        JLabel lblNewLabel = new JLabel("International DomesticFlight Schedule");
        lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 11, 764, 23);
        contentPane.add(lblNewLabel);

        String[] columns = {"DomesticFlight ID", "Time", "Date", "Daparture",
                "Arrival" , "Economy class Seats" , "Business class Seats" , "Time Duration"};

        DefaultTableModel obj=new DefaultTableModel(columns,0);

        for (int i = 0; i< InternationalFlightSchedule.flightList2.size() ; i++)
        {

            Object[] update= {InternationalFlightSchedule.flightList2.get(i).getFlightID() , InternationalFlightSchedule.flightList2.get(i).getDepartTime() , InternationalFlightSchedule.flightList2.get(i).getLandTime()
                    , InternationalFlightSchedule.flightList2.get(i).getDepartDestination() , InternationalFlightSchedule.flightList2.get(i).getLandDestination() ,
                    InternationalFlightSchedule.flightList2.get(i).getEconomySeats() , InternationalFlightSchedule.flightList2.get(i).getBusinessSeats() , InternationalFlightSchedule.flightList2.get(i).getDistance()};

            obj.addRow(update);
        }



