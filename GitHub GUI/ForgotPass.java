import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ForgotPass {

	JFrame frame;
	private JTextField txtEmailOrUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPass window = new ForgotPass();
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
	public ForgotPass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(9, 9, 9));
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblEmailOrUsername = new JLabel("Email Address");
		lblEmailOrUsername.setFont(new Font("Fira Code", Font.BOLD, 12));
		lblEmailOrUsername.setForeground(Color.WHITE);
		lblEmailOrUsername.setBounds(29, 72, 126, 14);
		frame.getContentPane().add(lblEmailOrUsername);
		
		
		JLabel lblForgotPass = new JLabel("Forgot Password");
		lblForgotPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPass.setForeground(Color.WHITE);
		lblForgotPass.setFont(new Font("Fira Code", Font.BOLD, 15));
		lblForgotPass.setBounds(29, 11, 414, 26);
		frame.getContentPane().add(lblForgotPass);
		
		txtEmailOrUsername = new JTextField();
		txtEmailOrUsername.setFont(new Font("Fira Code", Font.PLAIN, 12));
		txtEmailOrUsername.setBounds(165, 70, 234, 20);
		frame.getContentPane().add(txtEmailOrUsername);
		txtEmailOrUsername.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Fira Code", Font.PLAIN, 12));
		btnSubmit.setBounds(165, 125, 89, 23);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String emailOrUsername = txtEmailOrUsername.getText();
				// Implementing forgot password functionality
				JOptionPane.showMessageDialog(frame, "Password reset link sent to " + emailOrUsername);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Fira Code", Font.PLAIN, 12));
		btnCancel.setBounds(310, 125, 89, 23);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnCancel);
		
		frame.setBounds(100, 100, 502, 225);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		Image img = new ImageIcon(this.getClass().getResource("SMALLGITHUB.jpg")).getImage();
	}
}
