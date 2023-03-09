import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoginPage {

	JFrame frame;
	private JTextField txtUsernameOrEmail;
	private JLabel lblTitleTextGIT;
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
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(9, 9, 9));
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblTitleTextGIT = new JLabel("Sign in to GitHub");
		lblTitleTextGIT.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleTextGIT.setBounds(186, 110, 200, 43);
		lblTitleTextGIT.setForeground(new Color(255, 255, 255));
		lblTitleTextGIT.setFont(new Font("Monospaced", Font.BOLD, 18));
		frame.getContentPane().add(lblTitleTextGIT);

	
		
		JLabel lblEmailorPhone = new JLabel("Username or Email");
		lblEmailorPhone.setBounds(184, 164, 202, 14);
		lblEmailorPhone.setForeground(new Color(255, 255, 255));
		lblEmailorPhone.setFont(new Font("Monospaced", Font.BOLD, 13));
		frame.getContentPane().add(lblEmailorPhone);
		
		txtUsernameOrEmail = new JTextField();
		txtUsernameOrEmail.setFont(new Font("Monospaced", Font.BOLD,12));
		txtUsernameOrEmail.setBounds(184, 179, 200, 20);
		txtUsernameOrEmail.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(txtUsernameOrEmail);
		txtUsernameOrEmail.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(184, 210, 200, 14);
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Monospaced", Font.BOLD, 12));
		frame.getContentPane().add(lblPassword);

		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Monospaced", Font.BOLD, 12));
		pwdPassword.setBounds(184, 226, 182, 20);
		pwdPassword.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(pwdPassword);
		
		
		JLabel lblNew2Git = new JLabel("New to GitHub?");
		lblNew2Git.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblNew2Git.setBounds(186, 372, 109, 20);
		lblNew2Git.setHorizontalAlignment(SwingConstants.LEFT);
		lblNew2Git.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(lblNew2Git);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnSignUp.setBounds(295, 372, 91, 20);
		btnSignUp.setBackground(new Color(192, 192, 192));
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUp window = new SignUp();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnSignUp);
		
	
		
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
		chckbxNewCheckBox.setVerticalAlignment(SwingConstants.TOP);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox.setFont(new Font("Monospaced", Font.BOLD, 13));
		chckbxNewCheckBox.setBackground(new Color(9, 9, 9));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(186, 248, 198, 20);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		
		JButton btnForgotPass = new JButton("Forgot Password?");
		btnForgotPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgotPass window = new ForgotPass();
				window.frame.setVisible(true);
			}
		});
		btnForgotPass.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnForgotPass.setForeground(new Color(255, 255, 255));
		btnForgotPass.setBorder(null);
		btnForgotPass.setBackground(new Color(9, 9, 9));
		btnForgotPass.setBounds(186, 330, 200, 25);
		frame.getContentPane().add(btnForgotPass);
		
		JButton btnLoginBTN = new JButton("Login");
		btnLoginBTN.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnLoginBTN.setForeground(new Color(255, 255, 255));
		btnLoginBTN.setBackground(new Color(0, 166, 0));
		btnLoginBTN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if user inputs are correct
				if(txtUsernameOrEmail.getText().equals("DhanAngelo") && pwdPassword.getText().equals("BasilioTamparong123")) {
					
					JOptionPane.showMessageDialog(null, "Login Successful! \nWelcome to GitHub");
	
					HomeScreenGitHub window2 = new HomeScreenGitHub();
					window2.frame.setVisible(true);
					frame.dispose();
				}
				//checks if the user didn't fill all fields
				else if (txtUsernameOrEmail.getText().equals("") || pwdPassword.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Please input all requirements!");
				} else {
					JOptionPane.showMessageDialog(null,"Username and Password didn't match!");
				}
			}
		});
		btnLoginBTN.setBounds(188, 291, 200, 28);
		frame.getContentPane().add(btnLoginBTN);

	}
}
