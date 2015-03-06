package se.mah.k3lara.skaneAPI.xmlparser;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextArea;

import se.mah.k3lara.skaneAPI.model.Station;
import javax.swing.JScrollPane;


public class GUI extends JFrame {

	/**
	 * 
	 */
	GUI g = this;
	private Parser p = new Parser();
	Thread t = new SkaneThread(p, this);
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextArea Linje = new JTextArea();
	public JTextArea Destination = new JTextArea();
	public JTextArea Avgår = new JTextArea();
	public JTextArea Försening = new JTextArea();
//	public ArrayList<Station> searchStations = new ArrayList<Station>();
//	public ArrayList<Station> fromArray = new ArrayList<Station>();
//	public ArrayList<Station> toArray = new ArrayList<Station>();
	private final JLabel lblFrseningar = new JLabel("F\u00F6rsening");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JScrollPane scrollPane_1 = new JScrollPane();
	private final JScrollPane scrollPane_2 = new JScrollPane();
	private final JScrollPane scrollPane_3 = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		Thread t = new SkaneThread(p, g);
		t.start();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 374);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLinje = new JLabel("Linje");
		lblLinje.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblLinje.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinje.setForeground(Color.WHITE);
		lblLinje.setBounds(29, 24, 92, 33);
		contentPane.add(lblLinje);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setHorizontalAlignment(SwingConstants.CENTER);
		lblDestination.setForeground(Color.WHITE);
		lblDestination.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblDestination.setBounds(164, 24, 154, 33);
		contentPane.add(lblDestination);
		
		JLabel lblAvgng = new JLabel("Avg\u00E5r");
		lblAvgng.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvgng.setForeground(Color.WHITE);
		lblAvgng.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblAvgng.setBounds(365, 24, 92, 33);
		contentPane.add(lblAvgng);
		scrollPane.setBounds(122, 68, 250, 247);
		
		contentPane.add(scrollPane);
		scrollPane.setViewportView(Destination);
		
		Destination.setFont(new Font("Myanmar Text", Font.PLAIN, 14));
		Destination.setEditable(false);
		Destination.setBackground(new Color(248, 248, 255));
		scrollPane_2.setBounds(382, 68, 64, 247);
		
		contentPane.add(scrollPane_2);
		scrollPane_2.setViewportView(Avgår);
		
		Avgår.setFont(new Font("Myanmar Text", Font.PLAIN, 14));
		Avgår.setEditable(false);
		Avgår.setBackground(new Color(248, 248, 255));
		scrollPane_3.setBounds(456, 68, 137, 247);
		
		contentPane.add(scrollPane_3);
		scrollPane_3.setViewportView(Försening);
		
		Försening.setFont(new Font("Myanmar Text", Font.PLAIN, 14));
		Försening.setEditable(false);
		Försening.setBackground(new Color(248, 248, 255));
		scrollPane_1.setBounds(38, 68, 74, 247);
		
		contentPane.add(scrollPane_1);
		scrollPane_1.setViewportView(Linje);
		Linje.setFont(new Font("Myanmar Text", Font.PLAIN, 14));
		Linje.setBackground(new Color(248, 248, 255));
		Linje.setEditable(false);
		lblFrseningar.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrseningar.setForeground(Color.WHITE);
		lblFrseningar.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblFrseningar.setBounds(467, 24, 116, 33);
		
		contentPane.add(lblFrseningar);
	

}	
 }
	

