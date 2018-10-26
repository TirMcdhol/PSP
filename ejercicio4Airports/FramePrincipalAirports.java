package ejercicio4Airports;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class FramePrincipalAirports extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipalAirports frame = new FramePrincipalAirports();
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
	public FramePrincipalAirports() {
		setTitle("\"Airport\" LaunchFrame");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 631, 426);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("/ejercicio4Airports/airportPortada.jpg")); 
		JLabel lblImagen = new JLabel();
		lblImagen.setIcon(imagen1);
		lblImagen.setBounds(10,0,590,386);
        getContentPane().add(lblImagen);  
		  
		JButton btnBuscar = new JButton("SEARCH AIRPORT");
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setBackground(Color.DARK_GRAY);
		btnBuscar.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		btnBuscar.setBounds(134, 306, 307, 44);
		contentPane.add(btnBuscar);
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuFrameAirports frame = new MenuFrameAirports();
				frame.setVisible(true);
				dispose();
			}
		});
		
		
	}

}
