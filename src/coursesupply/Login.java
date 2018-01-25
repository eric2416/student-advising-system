package coursesupply;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField fldUsername;
	private JPasswordField fldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 750, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 25));
		lblUsername.setBounds(151, 117, 120, 20);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 25));
		lblPassword.setBounds(151, 147, 120, 20);
		frame.getContentPane().add(lblPassword);
		
		fldUsername = new JTextField();
		fldUsername.setFont(new Font("Arial", Font.PLAIN, 25));
		fldUsername.setBounds(276, 117, 250, 26);
		frame.getContentPane().add(fldUsername);
		fldUsername.setColumns(10);
		
		fldPassword = new JPasswordField();
		fldPassword.setBounds(276, 147, 250, 26);
		frame.getContentPane().add(fldPassword);
		
		JButton btnNewButton = new JButton("Login\r\n");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(302, 200, 140, 30);
		frame.getContentPane().add(btnNewButton);
	}
}
