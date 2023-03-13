package longExam3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

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
		String[] predefinedAdmin = {"Admin-Java", "AdminJava123"};
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	boolean passwordVisible = false;
	private JLabel lblLoginMessage = new JLabel("");
	
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
		frame.getContentPane().setBackground(new Color(9, 9, 9));
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmailorPhone = new JLabel("Username");
		lblEmailorPhone.setBounds(184, 164, 182, 14);
		lblEmailorPhone.setForeground(new Color(255, 255, 255));
		lblEmailorPhone.setFont(new Font("Fira Code", Font.BOLD, 12));
		frame.getContentPane().add(lblEmailorPhone);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(184, 210, 67, 14);
		lblPassword.setForeground(new Color(255, 255, 255));
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
		txtUsername.setBounds(184, 179, 200, 20);
		txtUsername.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		lblNewLabel = new JLabel("Grading  System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(186, 110, 200, 43);
		lblNewLabel.setForeground(new Color(255, 255, 255));
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
		pwdPassword.setBounds(184, 226, 182, 20);
		pwdPassword.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(pwdPassword);
		
		
		JButton btnSingUP = new JButton("Sign Up");
		btnSingUP.setFont(new Font("Fira Code", Font.PLAIN, 12));
		btnSingUP.setBounds(294, 395, 90, 23);
		btnSingUP.setBackground(new Color(192, 192, 192));
		btnSingUP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		frame.getContentPane().add(btnSingUP);
		
		JLabel lblNewLabel_1 = new JLabel("New  t ");
		lblNewLabel_1.setFont(new Font("Fira Code", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(184, 398, 119, 17);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(lblNewLabel_1);
	
		
		JRadioButton rdbtnShowPass = new JRadioButton("");
		rdbtnShowPass.setBackground(new Color(255, 255, 255));
		rdbtnShowPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				        passwordVisible = !passwordVisible;
				        pwdPassword.setEchoChar(passwordVisible ? '\u0000' : '\u2022');
				    }
				});
		rdbtnShowPass.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnShowPass.setBounds(364, 226, 20, 20);
		frame.getContentPane().add(rdbtnShowPass);
		
		lblLoginMessage.setForeground(Color.WHITE);
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLoginMessage.setBounds(119, 278, 318, 14);
		frame.getContentPane().add(lblLoginMessage);
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				//if user inputs are correct
				if(txtUsername.getText().equals(adminU) && pwdPassword.getText().equals(adminP)) {
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN");
					
					HomeScreenGitHub window2 = new HomeScreenGitHub();
					window2.frame.setVisible(true);
					frame.dispose();
					
				}
				//checks if the user didn't fill all fields
				else if (txtUsername.getText().equals("") || txtUsername.getText().equals("Username")) {
					lblLoginMessage.setText("INCORECT STUDENT USERNAME");
				} else if (pwdPassword.getText().equals("") || pwdPassword.getText().equals("Password")) {
					lblLoginMessage.setText("INCORRECT PASSWORD");
				} else if (!(txtUsername.getText().equals(adminU)) || (!(pwdPassword.getText().equals(adminP)))) {
					lblLoginMessage.setText("INCORRECT USERNAME AND PASSWORD");
				}
			}
			});
		pnlBtnLogin.setBackground(new Color(0, 166, 0));
		pnlBtnLogin.setBounds(184, 300, 200, 28);
		frame.getContentPane().add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lblSignIn = new JLabel("Sign in");
		lblSignIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignIn.setFont(new Font("Fira Code", Font.BOLD, 12));
		lblSignIn.setForeground(new Color(255, 255, 255));
		lblSignIn.setBounds(0, 0, 200, 28);
		pnlBtnLogin.add(lblSignIn);
		
		JButton btnNewButton = new JButton("Forgot Password?");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Fira Code", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(9, 9, 9));
		btnNewButton.setBounds(225, 328, 119, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
