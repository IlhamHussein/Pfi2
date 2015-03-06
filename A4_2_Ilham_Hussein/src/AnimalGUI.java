import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;


public class AnimalGUI extends JFrame {

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
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		
		ArrayList<Animal> lista = new ArrayList<Animal> (); //Skapar arrayList
		lista.add(new Dog("Canis familiaris", 61, false));
		lista.add(new Cat("Felis silvestris lybica", 64, 4));
		lista.add(new Snake("Eunectes murinus", false));
		lista.add(new Snake ("Bitis peringuey", true));
		lista.add(new Dog("Canis familiaris", 57, true, "Kalle"));
		lista.add(new Snake("Naja naja sputatrix", true));
	
		setType(Type.POPUP);
		setTitle("My Animals");
		setResizable(false);
		setBackground(new Color(238, 238, 238));
		setBounds(100, 100, 502, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 158, 472, 96);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 12));
		scrollPane.setViewportView(textArea);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AnimalGUI.class.getResource("/Bilder/noof.gif")));
		label.setBounds(34, 12, 428, 134);
		contentPane.add(label);
		
		for (int i = 0; i<lista.size(); i++) {	
			textArea.append(lista.get(i).getInfo() + "\n");
		}
		

	}
}
