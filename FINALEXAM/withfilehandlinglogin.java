package longExam3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import javax.swing.border.EtchedBorder;

public class LoginPage {

	JFrame frame;
	private JTextField txtUsername;
	private JLabel lblNewLabel;
	private JPasswordField pwdPassword;
	static ArrayList<String[]> adminList = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	String adminU = "Admin-Java";
	String adminP = "AdminJava123";
	boolean passwordVisible = false;
	private JLabel lblLoginMessage = new JLabel("");
	private JButton btnLOGIN;
	
	private void initialize() {
		try {
			adminList.clear();
			BufferedWriter writePredefinedAdmin = new BufferedWriter(new FileWriter("AdminCredentials.txt", true));
			BufferedReader readAdmin = new BufferedReader(new FileReader("AdminCredentials.txt"));
			String currentLine;
			
			if((currentLine = readAdmin.readLine()) == null) {
				writePredefinedAdmin.write("Admin-Java\nAdminJava123");		// predefined admin credentials
				writePredefinedAdmin.close();
			} else {
				adminList.add(currentLine.split("\n"));
			}
			while((currentLine = readAdmin.readLine()) != null) {
				adminList.add(currentLine.split("\n"));
			}
			readAdmin.close();
			
		} catch(IOException e1) {
			e1.printStackTrace();
		}
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmailorPhone = new JLabel("USERNAME:");
		lblEmailorPhone.setBounds(90, 164, 182, 14);
		lblEmailorPhone.setForeground(new Color(0, 0, 0));
		lblEmailorPhone.setFont(new Font("Fira Code", Font.BOLD, 12));
		frame.getContentPane().add(lblEmailorPhone);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(90, 229, 84, 14);
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Fira Code", Font.BOLD, 12));
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Fira Code", Font.PLAIN, 12));
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtUsername.getText().equals("Username or Email")) {
					txtUsername.setText("");
				} else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username or Email");
			}
		});
		txtUsername.setText("Username or Email");
		txtUsername.setBounds(184, 161, 202, 20);
		txtUsername.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		lblNewLabel = new JLabel("Grading  System");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(186, 110, 200, 43);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Fira Code", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Fira Code", Font.PLAIN, 12));
		pwdPassword.addFocusListener(new FocusAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {
					pwdPassword.setEchoChar('\u2022');
					pwdPassword.setText("");
				} else {
					pwdPassword.selectAll();
				}
			}
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPassword.getText().equals(""))
					pwdPassword.setText("Password");
					pwdPassword.setEchoChar((char)0);
			}
		});
		pwdPassword.setText("Password");
		pwdPassword.setEchoChar((char)0);
		pwdPassword.setBounds(184, 226, 202, 20);
		pwdPassword.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(pwdPassword);
	
		
		JRadioButton rdbtnShowPass = new JRadioButton("");
		rdbtnShowPass.setBackground(new Color(0, 0, 0));
		rdbtnShowPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				        passwordVisible = !passwordVisible;
				        pwdPassword.setEchoChar(passwordVisible ? '\u0000' : '\u2022');
				    }
				});
		rdbtnShowPass.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnShowPass.setBounds(383, 226, 20, 20);
		frame.getContentPane().add(rdbtnShowPass);
		lblLoginMessage.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLoginMessage.setBackground(new Color(255, 0, 0));
		lblLoginMessage.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblLoginMessage.setForeground(new Color(255, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.BOLD, 12));
		lblLoginMessage.setBounds(0, 257, 584, 14);
		frame.getContentPane().add(lblLoginMessage);
		
		btnLOGIN = new JButton("LOGIN");
		btnLOGIN.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				boolean isExisting = false;
				for(String[] adminCredentials: adminList) {
					if(txtUsername.getText().equals(adminCredentials[0])) {
						isExisting = true;
						if(pwdPassword.getText().equals(adminCredentials[1])) {
							
							HomeScreen window2 = new HomeScreen();
							window2.frame.setVisible(true);
							frame.dispose();
						} 				//checks if the user didn't fill all fields
						else if (txtUsername.getText().equals("") || txtUsername.getText().equals("Username")) {
							lblLoginMessage.setText("INCORECT STUDENT USERNAME");
						} else if (pwdPassword.getText().equals("") || pwdPassword.getText().equals("Password")) {
							lblLoginMessage.setText("INCORRECT PASSWORD");
						} else if (!(txtUsername.getText().equals(adminU)) || (!(pwdPassword.getText().equals(adminP)))) {
							lblLoginMessage.setText("INCORRECT USERNAME AND PASSWORD");
						}
					}
				}
			}});
		btnLOGIN.setBounds(232, 293, 89, 23);
		frame.getContentPane().add(btnLOGIN);
		
	}
}
