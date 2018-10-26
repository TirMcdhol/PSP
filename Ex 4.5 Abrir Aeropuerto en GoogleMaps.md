### Al pinchar sobre uno de los aeropuertos se abrirá el navegador por defecto del usuario mostrándole la posición del aeropuerto en un mapa de GoogleMaps.

```
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MenuFrameAirports extends JFrame {

	private JPanel contentPane;
	private JTextField tfNombreAeropuerto;
	private JTextField tfAeropuertoEscogido;
	public static String latitud = "";
	public static String longitud = "";
	public static String nombreAeropuerto = "";
	
	//MÉTODO PARA DESCARGAR LA INFORMACIÓN DEL ARCHIVO CSV QUE ESTA EN LA RED y PODER ACCEDER A ELLA Y COMPARARLA CON LA ELECCION DEL USUARIO
	
	public void buscarAeropuerto(String nombre) throws IOException {
		
		latitud = "";
		longitud = "";
		nombreAeropuerto = "";
		
		  URL oracle = new URL("https://raw.githubusercontent.com/jpatokal/openflights/master/data/airports.dat");
	        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream())); 
	        String inputLine;
	        String[] datosAeropuerto;
	        		
	        while ((inputLine = in.readLine()) != null) {
	        		
	        	datosAeropuerto = inputLine.toLowerCase().split(",");
	        	
	        		//datosAeropuerto[1] es el nombre del aeropuerto y datosAropuerto[4] el codigo del mismo, si estos nombres contienen la elección del usuario 
	        		//se lo mostraremos.
	        	if(datosAeropuerto[1].contains(nombre.toLowerCase()) || datosAeropuerto[4].contains(nombre.toLowerCase())) {		
	        			nombreAeropuerto = datosAeropuerto[1];
	        			latitud = datosAeropuerto[6];
	        			longitud = datosAeropuerto[7];
	        			//Comprobacion en cosola de que el aeropuerto y sus datos estan bien
	        			System.out.println("Aeropuerto: "+nombreAeropuerto+" latitud: "+latitud+" Longitud: "+longitud);
	        		}	        	
	        	}
	        in.close();
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFrameAirports frame = new MenuFrameAirports();
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
	public MenuFrameAirports() {
		setTitle("\"Airport\" MenuFrame");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon("bin/ejercicio4Airports/airportMenu.jpg"));
		lblImagen.setBounds(0,0,600,250);
        getContentPane().add(lblImagen);  
		
        JButton btnMap = new JButton("SHOW YOUR AIRPORT GOOGLE MAP");
		btnMap.setForeground(Color.BLACK);
		btnMap.setBackground(Color.WHITE);
		btnMap.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnMap.setBounds(138, 316, 307, 44);
		contentPane.add(btnMap);
		
		JLabel lblIntroduce = new JLabel("INTRODUCE YOUR AIRPORT NAME OR CODE:");
		lblIntroduce.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntroduce.setBounds(10, 261, 249, 23);
		contentPane.add(lblIntroduce);
		
		JLabel lblExemple = new JLabel("Exemple: Valencia or VLC");
		lblExemple.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblExemple.setBounds(10, 282, 149, 23);
		contentPane.add(lblExemple);
		
		tfNombreAeropuerto = new JTextField();
		tfNombreAeropuerto.setBounds(269, 258, 315, 23);
		contentPane.add(tfNombreAeropuerto);
		tfNombreAeropuerto.setColumns(10);
		
		tfAeropuertoEscogido = new JTextField();
		tfAeropuertoEscogido.setFont(new Font("Tahoma", Font.ITALIC, 11));
		tfAeropuertoEscogido.setColumns(10);
		tfAeropuertoEscogido.setBounds(169, 282, 415, 23);
		contentPane.add(tfAeropuertoEscogido);
		tfAeropuertoEscogido.setVisible(false);
		
		btnMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					buscarAeropuerto(tfNombreAeropuerto.getText().toString());
				} catch (IOException e) {
					System.out.println("ERROR AL LEER AEROPUERTO");
				}
				//Si el metodo ha funcionado le mostraremos al usuario en un panel emergente el nombre del aeropuerto seleccionado junto a su latitud y longitud
				tfAeropuertoEscogido.setText(nombreAeropuerto+" LAT: "+latitud+" LON: "+longitud);
				tfAeropuertoEscogido.setVisible(true);
				
				try {
					Desktop.getDesktop().browse(new URI("https://www.google.com/maps/?q="+latitud+","+longitud));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"ERROR AL CARGAR LA WEB");
				}
			}
		});
	}
}


```
