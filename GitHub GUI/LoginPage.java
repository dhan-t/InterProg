import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoginPage {

	JFrame frame;
	private JTextField txtUsernameOrEmail;
	private JLabel lblNewLabel;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new SignUp();
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
	boolean passwordVisible = false;
	private JLabel lblLoginMessage = new JLabel("");
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(9, 9, 9));
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmailorPhone = new JLabel("Username or Email");
		lblEmailorPhone.setBounds(184, 164, 182, 14);
		lblEmailorPhone.setForeground(new Color(255, 255, 255));
		lblEmailorPhone.setFont(new Font("Fira Code", Font.BOLD, 12));
		frame.getContentPane().add(lblEmailorPhone);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(184, 210, 67, 14);
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Fira Code", Font.BOLD, 12));
		frame.getContentPane().add(lblPassword);
		
		txtUsernameOrEmail = new JTextField();
		txtUsernameOrEmail.setFont(new Font("Fira Code", Font.PLAIN, 12));
		txtUsernameOrEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtUsernameOrEmail.getText().equals("Username or Email")) {
					txtUsernameOrEmail.setText("");
				} else {
					txtUsernameOrEmail.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsernameOrEmail.getText().equals(""))
					txtUsernameOrEmail.setText("Username or Email");
			}
		});
		txtUsernameOrEmail.setText("Username or Email");
		txtUsernameOrEmail.setBounds(184, 179, 200, 20);
		txtUsernameOrEmail.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(txtUsernameOrEmail);
		txtUsernameOrEmail.setColumns(10);
		
		lblNewLabel = new JLabel("Sign in to GitHub");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(186, 110, 200, 43);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Fira Code", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Fira Code", Font.PLAIN, 12));
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {
					pwdPassword.setEchoChar('\u2022');
					pwdPassword.setText("");
				} else {
					pwdPassword.selectAll();
				}
			}
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
				SignUp window = new SignUp();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnSingUP);
		
		JLabel lblNewLabel_1 = new JLabel("New to GitHub?");
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
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember Me");
		chckbxNewCheckBox.setFont(new Font("Fira Code", Font.PLAIN, 12));
		chckbxNewCheckBox.setBackground(new Color(9, 9, 9));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(184, 248, 200, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		lblLoginMessage.setForeground(Color.WHITE);
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLoginMessage.setBounds(184, 278, 200, 14);
		frame.getContentPane().add(lblLoginMessage);
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if user inputs are correct
				if(txtUsernameOrEmail.getText().equals("DhanAngelo") && pwdPassword.getText().equals("BasilioTamparong123")) {
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "Login Successful! \nWelcome to GitHub");
	
					HomeScreenGitHub window2 = new HomeScreenGitHub();
					window2.frame.setVisible(true);
					frame.dispose();
				}
				//checks if the user didn't fill all fields
				else if (txtUsernameOrEmail.getText().equals("") || txtUsernameOrEmail.getText().equals("Username") ||
						pwdPassword.getText().equals("") || pwdPassword.getText().equals("Password")) {
					lblLoginMessage.setText("Please input all requirements!");
				} else {
					lblLoginMessage.setText("Username and Password didn't match!");		//checks if the user's input are incorrect.
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
				ForgotPass window = new ForgotPass();
				window.frame.setVisible(true);
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
