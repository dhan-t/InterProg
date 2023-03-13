package longExam3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HomeScreen extends ending{
	String firstname;
	String surname;
	double finalGrade;

	HomeScreen(String firstname, String surname, double finalGrade){
		this.firstname = firstname ;
		this.surname = surname;
		this.finalGrade = finalGrade;
	}
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	boolean checkboxCorrect = false;
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(9, 9, 9));
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 64, 584, 65);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("STUDENT RECOMMENDATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 11, 584, 49);
		frame.getContentPane().add(lblNewLabel);
		
		
		JCheckBox chckbxjohnYap = new JCheckBox("John Yap");
		chckbxjohnYap.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxjohnYap.setBounds(165, 136, 244, 23);
		frame.getContentPane().add(chckbxjohnYap);
		
		JCheckBox chckbxkrishaCruz = new JCheckBox("Krisha Cruz");
		chckbxkrishaCruz.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxkrishaCruz.setBounds(165, 162, 244, 23);
		frame.getContentPane().add(chckbxkrishaCruz);
		
		JCheckBox chckbxhenryGo = new JCheckBox("Henry Go");
		chckbxhenryGo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxhenryGo.setBounds(165, 188, 244, 23);
		frame.getContentPane().add(chckbxhenryGo);
		
		JCheckBox chckbxHaileyDaily = new JCheckBox("Hailey Daily");
		chckbxHaileyDaily.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxHaileyDaily.setBounds(165, 214, 244, 23);
		frame.getContentPane().add(chckbxHaileyDaily);
		
		JCheckBox chckbxAshtonDrake = new JCheckBox("Ashton Drake");
		chckbxAshtonDrake.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxAshtonDrake.setBounds(165, 240, 244, 23);
		frame.getContentPane().add(chckbxAshtonDrake);
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("RECOMMEND STUDENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxhenryGo.isSelected()||chckbxkrishaCruz.isSelected()||chckbxjohnYap.isSelected()) {
					JOptionPane.showMessageDialog(null, "PLEASE REVIEW THE RESULTS AGAIN");
			
				}else if (chckbxHaileyDaily.isSelected() && chckbxAshtonDrake.isSelected()){
					JOptionPane.showMessageDialog(null, "Here's the list of students who passed the subject Hailey Daily and Ashton Drake");
					ending window3 = new ending();
					window3.frame.setVisible(true);
					frame.dispose();
					
					
				}else {
					checkboxCorrect = false;
					
					ending window3 = new ending();
					window3.frame.setVisible(true);
					frame.dispose();
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(186, 505, 205, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JOptionPane.showMessageDialog(null, "WELCOME USER");
		
		
		
	}
}
