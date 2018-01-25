package coursesupply;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SuccessfulEnrollment {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuccessfulEnrollment window = new SuccessfulEnrollment();
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
	public SuccessfulEnrollment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYourEnrollmentAttempt = new JLabel("Your enrollment attempt was successful");
		lblYourEnrollmentAttempt.setBounds(133, 112, 281, 20);
		frame.getContentPane().add(lblYourEnrollmentAttempt);
	}

}
