package edu.neu.csye6200;

import edu.neu.csye6200.utils.Flight;
import edu.neu.csye6200.utils.InternationalFlight;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
import java.util.List;

public class InternationalFlightSchedule extends JFrame {

	private JPanel contentPane;
	static JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel;
	private JButton btnNewButton_3;
	static List<InternationalFlight> internationalFlights =new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternationalFlightSchedule frame = new InternationalFlightSchedule();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InternationalFlightSchedule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		String[] columns = {"Flight ID", "Time", "Date", "Daparture Destination",
                "Land Destination" , "Economy Seats" , "Business Seats" , "Time Duration"};

		DefaultTableModel obj=new DefaultTableModel(columns,0);

        
	    for (int i = 0; i<InternationalFlightSchedule.internationalFlights.size() ; i++)
	    {
	    	
	        Object[] update= {InternationalFlightSchedule.internationalFlights.get(i).getFlightID() , InternationalFlightSchedule.internationalFlights.get(i).getDepartTime() , InternationalFlightSchedule.internationalFlights.get(i).getLandTime()
	        			, InternationalFlightSchedule.internationalFlights.get(i).getDepartDestination() , InternationalFlightSchedule.internationalFlights.get(i).getLandDestination() ,
	        			InternationalFlightSchedule.internationalFlights.get(i).getEconomySeats() , InternationalFlightSchedule.internationalFlights.get(i).getBusinessSeats() , InternationalFlightSchedule.internationalFlights.get(i).getDistance()};
	        
	    	obj.addRow(update);
	    }
	    
	     table = new JTable(obj);
	    JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 39, 764, 200);
		contentPane.add(scrollPane);
	//	scrollPane.setColumnHeaderView(table);
		
		btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(e -> {
            AddInternationalFlight obj13 =new AddInternationalFlight();
            obj13.setVisible(true);
            dispose();
        });
		btnNewButton.setBounds(161, 250, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(e -> {
            if (table.getSelectedRowCount()==1)
            {
                obj.removeRow(table.getSelectedRow());
                internationalFlights.remove(table.getSelectedRowCount()+1);
                JOptionPane.showMessageDialog(null, "Selected flight has been deleted.");
            }
            else if(table.getSelectedRowCount()==0)
            {
                JOptionPane.showMessageDialog(null, "Please select a row first.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please select one row at a time.");
            }
        });
		btnNewButton_1.setBounds(260, 250, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Edit");
		btnNewButton_2.addActionListener(e -> {
            if (table.getSelectedRowCount()==1)
            {
                EditInternationalFlight obj1 =new EditInternationalFlight();
                obj1.setVisible(true);
                dispose();
            }
            else if(table.getSelectedRowCount()==0)
            {
                JOptionPane.showMessageDialog(null, "Please select a row first");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please select one row at a time");
            }
        });
		btnNewButton_2.setBounds(359, 250, 89, 23);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel = new JLabel("International Flight Schedule");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 680, 28);
		contentPane.add(lblNewLabel);
		
		btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(e -> {
            FlightMenu obj12 =new FlightMenu();
            obj12.setVisible(true);
            dispose();
        });
		btnNewButton_3.setBounds(458, 250, 89, 23);
		contentPane.add(btnNewButton_3);
		
	}

}
