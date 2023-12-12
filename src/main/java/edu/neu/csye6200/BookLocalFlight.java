
package edu.neu.csye6200;
import edu.neu.csye6200.utils.CSVReader;
import edu.neu.csye6200.utils.Passengers;
import edu.neu.csye6200.utils.StringRes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class  BookLocalFlight extends JFrame {

    private JPanel contentPane;
    private JTable flightTable;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                BookLocalFlight frame = new BookLocalFlight();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

/**
 * Create the frame.
 */
public BookLocalFlight() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 843, 419);
    setTitle("Book Local DomesticFlight");
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblNewLabel = new JLabel("Local DomesticFlight Schedule");
    lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setBounds(28, 0, 679, 28);
    contentPane.add(lblNewLabel);

    String[] columns = {"DomesticFlight ID", "Time", "Date", "Daparture",
            "Arrival" , "Economy class Seats" , "Business class Seats" , "Time Duration"};

    DefaultTableModel obj=new DefaultTableModel(columns,0);

    for (int i = 0; i< LocalFlightSchedule.domesticFlightList.size() ; i++)
    {

        Object[] update= {LocalFlightSchedule.domesticFlightList.get(i).getFlightID() , LocalFlightSchedule.domesticFlightList.get(i).getDepartTime() , LocalFlightSchedule.domesticFlightList.get(i).getLandTime()
                , LocalFlightSchedule.domesticFlightList.get(i).getDepartDestination() , LocalFlightSchedule.domesticFlightList.get(i).getLandDestination() ,
                LocalFlightSchedule.domesticFlightList.get(i).getEconomySeats() , LocalFlightSchedule.domesticFlightList.get(i).getBusinessSeats() , LocalFlightSchedule.domesticFlightList.get(i).getDistance()};

        obj.addRow(update);
    }

    flightTable = new JTable(obj);
    JScrollPane scrollPane = new JScrollPane(flightTable);
    scrollPane.setBounds(10, 39, 764, 200);
    contentPane.add(scrollPane);

    JButton btnNewButton = new JButton("Cancel DomesticFlight");
    btnNewButton.addActionListener(e -> {

        for (Passengers x: SignUP.PassengerList)
        {
            if (x.getUsername().equals(SignUP.username.getText()))
            {
                if (x.getBooked()==true)
                {
                    double hour=Integer.valueOf((String) flightTable.getModel().getValueAt(flightTable.getSelectedRow(), 7));

                    double price=(hour*10000)+((hour*10000)*5/100);
                    JOptionPane.showMessageDialog(null, "Your flight has been cancelled successfully with a penalty of "+ (price*25/100));
                    SignUP.PassengerList.get(0).setBooked(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please book your flight first.");
                }
            }
        }
    });