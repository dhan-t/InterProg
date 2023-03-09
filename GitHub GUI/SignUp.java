import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignUp{

	JFrame frame;
	private JTextField textUsernameField;
	private JTextField textEmailSignUp;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public SignUp() {
		initialize();
	}

//To be used for checkbox checking later if user wants to show password or not.	
private	boolean passwordVisible = false;

	private void initialize() {
			
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(9, 9, 9));
		frame.getContentPane().setLayout(null);
		
		JLabel lblIUserNameLabel = new JLabel("Username");
		lblIUserNameLabel.setFont(new Font("Fira Code", Font.BOLD, 14));
		lblIUserNameLabel.setForeground(new Color(255, 255, 255));
		lblIUserNameLabel.setBounds(184, 155, 109, 14);
		frame.getContentPane().add(lblIUserNameLabel);
		
		textUsernameField = new JTextField();
		textUsernameField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textUsernameField.getText().equals("Username")) {
					textUsernameField.setText("");
				} else {
					textUsernameField.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textUsernameField.getText().equals(""))
					textUsernameField.setText("Username");
			}
		});
		textUsernameField.setBounds(184, 172, 206, 20);
		frame.getContentPane().add(textUsernameField);
		textUsernameField.setColumns(10);
		
		JLabel lblEmailSignUp = new JLabel("Email");
		
		lblEmailSignUp.setForeground(Color.WHITE);
		lblEmailSignUp.setFont(new Font("Fira Code", Font.BOLD, 14));
		lblEmailSignUp.setBounds(184, 203, 109, 14);
		frame.getContentPane().add(lblEmailSignUp);
		
		textEmailSignUp = new JTextField();
		textEmailSignUp.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textEmailSignUp.getText().equals("Email")) {
					textEmailSignUp.setText("");
				} else {
					textEmailSignUp.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textEmailSignUp.getText().equals(""))
					textEmailSignUp.setText("Email");
			}
		});
		textEmailSignUp.setColumns(10);
		textEmailSignUp.setBounds(184, 220, 206, 20);
		frame.getContentPane().add(textEmailSignUp);
		
		JLabel lblPasswordSignUp = new JLabel("Password");
		lblPasswordSignUp.setForeground(Color.WHITE);
		lblPasswordSignUp.setFont(new Font("Fira Code", Font.BOLD, 14));
		lblPasswordSignUp.setBounds(184, 251, 109, 14);
		frame.getContentPane().add(lblPasswordSignUp);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if user inputs are correct
				if(textEmailSignUp.getText().isEmpty() ||  passwordField.getText().isEmpty() || textUsernameField.getText().isEmpty() ){
					JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
				}else {
					JOptionPane.showMessageDialog(null, "Registration Successfull! \nWelcome to GitHub");
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
					frame.dispose();
				}}
			});
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setFont(new Font("Fira Code", Font.BOLD, 12));
		btnSignUp.setBackground(new Color(0, 166, 0));
		btnSignUp.setBounds(184, 324, 206, 23);
		frame.getContentPane().add(btnSignUp);
		
	
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setFont(new Font("Fira Code", Font.BOLD, 12));
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginPage window = new LoginPage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSignIn.setBackground(new Color(192, 192, 192));
		btnSignIn.setBounds(317, 358, 85, 23);
		frame.getContentPane().add(btnSignIn);
		
		JLabel lblWithAccount = new JLabel("Already have an Account?");
		lblWithAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithAccount.setForeground(new Color(255, 255, 255));
		lblWithAccount.setFont(new Font("Fira Code", Font.BOLD, 12));
		lblWithAccount.setBounds(149, 362, 171, 14);
		frame.getContentPane().add(lblWithAccount);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(	passwordField.getText().equals("Password")) {
					passwordField.setEchoChar('\u2022');
					passwordField.setText("");
				} else {
					passwordField.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(passwordField.getText().equals(""))
					passwordField.setText("Password");
					passwordField.setEchoChar((char)0);
			}
		});
		passwordField.setBounds(184, 268, 188, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblSignUp = new JLabel("Welcome to GitHub!");
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setForeground(Color.WHITE);
		lblSignUp.setFont(new Font("Fira Code", Font.BOLD, 15));
		lblSignUp.setBounds(184, 124, 206, 20);
		frame.getContentPane().add(lblSignUp);
		
		JRadioButton rdbtnShowPass = new JRadioButton("");
		rdbtnShowPass.setBackground(new Color(255, 255, 255));
		rdbtnShowPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				        passwordVisible = !passwordVisible;
				        passwordField.setEchoChar(passwordVisible ? '\u0000' : '\u2022');
				    }
				});
		rdbtnShowPass.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnShowPass.setBounds(370, 268, 20, 20);
		frame.getContentPane().add(rdbtnShowPass);
		JLabel lblNewLabel = new JLabel("Please Input all Fields!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(184, 299, 206, 14);
		frame.getContentPane().add(lblNewLabel);

		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
