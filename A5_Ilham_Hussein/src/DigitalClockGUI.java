import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Toolkit;

public class DigitalClockGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ClockLogic clockLogic;

	public JTextArea textAreaM; // Set minute
	public JTextArea textAreaH; // Set hour
	//public JLabel lblAlarmtid; // Alarm tiden
	//public JLabel lblKlocka; // 
	public boolean alarm = false;
	private JLabel lblKlocka = new JLabel("");
	private JLabel lblAlarmtid = new JLabel("Alarm time");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DigitalClockGUI.class.getResource("/bilder/icon-157349_640.png")));	
		clockLogic = new ClockLogic(this);
		setTitle("Wake me up!");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 417);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setForeground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnSetHour = new JButton("Set Alarm");
		btnSetHour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hOnTxtArea = Integer.parseInt(textAreaH.getText());
				int mOnTxtArea = Integer.parseInt(textAreaM.getText());
				

			String s = "";
			String s1= "";
			
			if(hOnTxtArea <10){
				s = "0";
			}
			if(mOnTxtArea <10){
				s1 = "0";
				
			}
			lblAlarmtid.setText("     " + s+ hOnTxtArea + ":" + s1+  mOnTxtArea);
			clockLogic.setAlarm(hOnTxtArea, mOnTxtArea);
			}
		});
		btnSetHour.setBounds(149, 252, 108, 26);
		contentPane.add(btnSetHour);

		JButton btnSetMinutes = new JButton("Clear Alarm");
		btnSetMinutes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaH.setText("");
				textAreaM.setText("");
				lblAlarmtid.setText("");
				clockLogic.clearAlarm();

			}
		});
		btnSetMinutes.setBounds(301, 252, 108, 26);
		contentPane.add(btnSetMinutes);

		textAreaH = new JTextArea();
		textAreaH.setFont(new Font("Dialog", Font.PLAIN, 57));
		textAreaH.setBounds(161, 120, 90, 92);
		contentPane.add(textAreaH);

		textAreaM = new JTextArea();
		textAreaM.setFont(new Font("Dialog", Font.PLAIN, 57));
		textAreaM.setBounds(311, 120, 90, 92);
		contentPane.add(textAreaM);

		JLabel lblHours = new JLabel("Hours");
		lblHours.setBounds(184, 224, 55, 16);
		contentPane.add(lblHours);

		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setBounds(331, 224, 55, 16);
		contentPane.add(lblMinutes);

		JLabel label = new JLabel(":");
		label.setFont(new Font("Dialog", Font.BOLD, 49));
		label.setBounds(270, 134, 55, 63);
		contentPane.add(label);

		
		lblKlocka.setFont(new Font("Dialog", Font.BOLD, 62));
		lblKlocka.setBounds(151, 16, 320, 92);
		contentPane.add(lblKlocka);

		
		lblAlarmtid.setFont(new Font("Dialog", Font.BOLD, 38));
		lblAlarmtid.setBounds(177, 290, 270, 55);
		contentPane.add(lblAlarmtid);
	}

	

	public void setTimeOnLabel(String time) {
		lblKlocka.setText(time);

	}

	public void alarm(boolean activate) {
		if (activate) {
			alarm = true;
			while(alarm == true){
				contentPane.setBackground(Color.WHITE);
				contentPane.setBackground(Color.BLACK);
			}}else{
				alarm = false;
			}
	
	
	}
}