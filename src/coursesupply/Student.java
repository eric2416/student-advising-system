package coursesupply;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Student extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Student() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCourseCatalog = new JButton("Course Catalog");
		btnCourseCatalog.setBounds(439, 283, 140, 30);
		contentPane.add(btnCourseCatalog);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.setBounds(439, 346, 140, 30);
		contentPane.add(btnSchedule);
		
		JButton btnAdvising = new JButton("Advising");
		btnAdvising.setBounds(439, 403, 140, 30);
		contentPane.add(btnAdvising);
	}

}
