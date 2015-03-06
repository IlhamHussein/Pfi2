import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class HumansandDogs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Human human;
	private JPanel contentPane;
	private JTextField textFieldHuman;
	private JTextField textFieldDog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumansandDogs frame = new HumansandDogs();
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
	public HumansandDogs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 223, 427, 52);
		contentPane.add(scrollPane);

		JTextArea textAreaInfo = new JTextArea();
		textAreaInfo.setEditable(false);
		scrollPane.setViewportView(textAreaInfo);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(22, 322, 427, 52);
		contentPane.add(scrollPane_1);

		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		textArea.setEditable(false);

		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				human = new Human(textFieldHuman.getText());
			}
		});
		btnNewButton.setBounds(110, 99, 109, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (human.getName() != null) {
					human.buyDog(new Dog(textFieldDog.getText()));
			}

		}});
		btnNewButton_1.setBounds(110, 147, 109, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Get Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (human == null) {
					textArea.setText("No existing human");
				} else {
					if (human.getShortName() == null) {
						textAreaInfo.setText(human.getInfo());
					}

					else {
						textArea.setText(human.getShortName());

					}

				}
			}
		});
		btnNewButton_2.setBounds(338, 287, 109, 23);
		contentPane.add(btnNewButton_2);

		textFieldHuman = new JTextField();
		textFieldHuman.setBounds(12, 100, 86, 20);
		contentPane.add(textFieldHuman);
		textFieldHuman.setColumns(10);

		textFieldDog = new JTextField();
		textFieldDog.setBounds(12, 148, 86, 20);
		contentPane.add(textFieldDog);
		textFieldDog.setColumns(10);

		JLabel lblInfo = DefaultComponentFactory.getInstance().createTitle(
				"Info");
		lblInfo.setBounds(22, 203, 88, 14);
		contentPane.add(lblInfo);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HumansandDogs.class
				.getResource("/bilder/lo.gif")));
		lblNewLabel.setBounds(246, 72, 220, 139);
		contentPane.add(lblNewLabel);

		JLabel label = DefaultComponentFactory.getInstance().createTitle("");
		label.setBounds(22, 301, 105, 16);
		contentPane.add(label);

		JLabel lblErrormessage = DefaultComponentFactory.getInstance()
				.createTitle("ErrorMessage");
		lblErrormessage.setBounds(22, 301, 105, 16);
		contentPane.add(lblErrormessage);

		JLabel lblHumansAndDogs = DefaultComponentFactory.getInstance()
				.createTitle("Humans And Dogs");
		lblHumansAndDogs.setFont(new Font("Georgia", Font.BOLD, 18));
		lblHumansAndDogs.setBounds(133, 12, 182, 40);
		contentPane.add(lblHumansAndDogs);
		}
}
