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































