package coursesupply;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnsuccessfulEnrollmet {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnsuccessfulEnrollmet window = new UnsuccessfulEnrollmet();
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
	public UnsuccessfulEnrollmet() {
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
		
		JLabel lblYourEnrollmentWas = new JLabel("Your enrollment attempt was unsuccessful");
		lblYourEnrollmentWas.setBounds(125, 112, 299, 20);
		frame.getContentPane().add(lblYourEnrollmentWas);
	}

}
