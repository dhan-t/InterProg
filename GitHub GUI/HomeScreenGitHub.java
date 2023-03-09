import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class HomeScreenGitHub {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreenGitHub window = new HomeScreenGitHub();
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
	public HomeScreenGitHub() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(9, 9, 9));
		frame.getContentPane().setLayout(null);
		
		JPanel panelRepoLinks = new JPanel();
		panelRepoLinks.setBounds(0, 64, 128, 497);
		panelRepoLinks.setBackground(new Color(56, 56, 56));
		frame.getContentPane().add(panelRepoLinks);
		panelRepoLinks.setLayout(null);
		
		JLabel lblRepos = new JLabel("Repositories:");
		lblRepos.setFont(new Font("Fira Code", Font.BOLD, 14));
		lblRepos.setForeground(new Color(255, 255, 255));
		lblRepos.setBounds(10, 23, 108, 14);
		panelRepoLinks.add(lblRepos);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-336, -156, 464, 668);
		panelRepoLinks.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dhant\\Desktop\\SMALLGITHUB.png"));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(68, 25, 128, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblPullRequest = new JLabel("Pulls");
		lblPullRequest.setForeground(Color.WHITE);
		lblPullRequest.setFont(new Font("Fira Code", Font.BOLD, 13));
		lblPullRequest.setBounds(206, 28, 51, 14);
		frame.getContentPane().add(lblPullRequest);
		
		JLabel lblIssues = new JLabel("Issues");
		lblIssues.setForeground(Color.WHITE);
		lblIssues.setFont(new Font("Fira Code", Font.BOLD, 13));
		lblIssues.setBounds(267, 28, 51, 14);
		frame.getContentPane().add(lblIssues);
		
		JLabel lblCodespaces = new JLabel("Codespaces");
		lblCodespaces.setForeground(Color.WHITE);
		lblCodespaces.setFont(new Font("Fira Code", Font.BOLD, 13));
		lblCodespaces.setBounds(328, 28, 91, 14);
		frame.getContentPane().add(lblCodespaces);
		
		JLabel lblMarketplace = new JLabel("Marketplace");
		lblMarketplace.setForeground(Color.WHITE);
		lblMarketplace.setFont(new Font("Fira Code", Font.BOLD, 13));
		lblMarketplace.setBounds(416, 28, 91, 14);
		frame.getContentPane().add(lblMarketplace);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 64, 584, 65);
		frame.getContentPane().add(separator);
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
