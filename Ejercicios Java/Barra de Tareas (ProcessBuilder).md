### EJERCICIOS CON PROCESSBUILDER (BARRA DE TAREAS)

## Barra de Tareas usando Java Swing y ProcessBuilder que muestra los botones con nuestras aplicaciones favoritas y que al pulsar en ellas se ejecutan.

```
package processBuilderComoFunciona;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ProcessBuilderTareasFavoritas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcessBuilderTareasFavoritas frame = new ProcessBuilderTareasFavoritas();
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
	public ProcessBuilderTareasFavoritas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1069, 732);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGoogle = new JButton("");
		btnGoogle.setIcon(new ImageIcon(ProcessBuilderTareasFavoritas.class.getResource("/processBuilderComoFunciona/chrome.png")));
		btnGoogle.setBackground(new Color(128, 0, 0));
		btnGoogle.setForeground(new Color(128, 0, 0));
		btnGoogle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ProcessBuilder pb = new ProcessBuilder("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"","");
					pb.start();
					
				}catch(Exception e) {
					System.out.println("Exception: "+e);
				}
			}
		});
		btnGoogle.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		btnGoogle.setBounds(41, 24, 230, 226);
		contentPane.add(btnGoogle);
		
		JButton btnEclipse = new JButton("");
		btnEclipse.setIcon(new ImageIcon(ProcessBuilderTareasFavoritas.class.getResource("/processBuilderComoFunciona/android.jpg")));
		btnEclipse.setBackground(new Color(128, 0, 0));
		btnEclipse.setForeground(new Color(128, 0, 0));
		btnEclipse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ProcessBuilder pb = new ProcessBuilder("\"C:\\Users\\DAM 2\\eclipse\\java-photon\\eclipse\\eclipse.exe\"","");
					pb.start();
					
				}catch(Exception i) {
					System.out.println("Exception: "+i);
				}
			}
		});
		btnEclipse.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		btnEclipse.setBounds(41, 456, 230, 226);
		contentPane.add(btnEclipse);
		
		JButton btnVisualStudio = new JButton("");
		btnVisualStudio.setIcon(new ImageIcon(ProcessBuilderTareasFavoritas.class.getResource("/processBuilderComoFunciona/Visual_Studio_2013_Logo.svg.png")));
		btnVisualStudio.setBackground(new Color(128, 0, 0));
		btnVisualStudio.setForeground(new Color(128, 0, 0));
		btnVisualStudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ProcessBuilder pb = new ProcessBuilder("\"C:\\Program Files (x86)\\Microsoft Visual Studio\\2017\\Community\\Common7\\IDE\\devenv.exe\"","");
					pb.start();
					
				}catch(Exception o) {
					System.out.println("Exception: "+o);
				}
			}
		});
		btnVisualStudio.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		btnVisualStudio.setBounds(281, 161, 479, 434);
		contentPane.add(btnVisualStudio);
		
		JButton btnAndroidStudio = new JButton("");
		btnAndroidStudio.setIcon(new ImageIcon(ProcessBuilderTareasFavoritas.class.getResource("/processBuilderComoFunciona/eclipsepng.png")));
		btnAndroidStudio.setBackground(new Color(128, 0, 0));
		btnAndroidStudio.setForeground(new Color(128, 0, 0));
		btnAndroidStudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ProcessBuilder pb = new ProcessBuilder("\"C:\\Program Files\\Android\\Android Studio\\bin\\studio64.exe\"","");
					pb.start();
					
				}catch(Exception u) {
					System.out.println("Exception: "+u);
				}
			}
		});
		btnAndroidStudio.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		btnAndroidStudio.setBounds(770, 233, 273, 281);
		contentPane.add(btnAndroidStudio);
	}
}

```
