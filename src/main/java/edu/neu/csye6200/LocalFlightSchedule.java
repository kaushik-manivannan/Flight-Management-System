package edu.neu.csye6200;

import edu.neu.csye6200.utils.DomesticFlight;

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
import java.util.ArrayList;
import java.util.List;

public class LocalFlightSchedule extends JFrame {

    private JPanel contentPane;
    static JTable table;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnEdit;
    private JLabel lblLocalFlightSchedule;
    private JButton btnBack;
    static List<DomesticFlight> domesticFlightList = new ArrayList<>();

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
        String[] columns = {"DomesticFlight ID", "Time", "Date", "Departure Destination",
                "Land Destination", "Economy Seats", "Business Seats", "Time Duration"};

        DefaultTableModel obj = new DefaultTableModel(columns, 0);

        for (DomesticFlight domesticFlight : LocalFlightSchedule.domesticFlightList) {
            Object[] update = {domesticFlight.getFlightID(), domesticFlight.getDepartTime(), domesticFlight.getLandTime(),
                    domesticFlight.getDepartDestination(), domesticFlight.getLandDestination(),
                    domesticFlight.getEconomySeats(), domesticFlight.getBusinessSeats(), domesticFlight.getDistance()};

            obj.addRow(update);
        }


        table = new JTable(obj);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 39, 764, 200);
        contentPane.add(scrollPane);
    }
































