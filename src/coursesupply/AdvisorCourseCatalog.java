package coursesupply;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

public class AdvisorCourseCatalog extends JFrame {

	private JPanel contentPane;
	private JTextField fldCourse;
	private JTextField fldNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvisorCourseCatalog frame = new AdvisorCourseCatalog();
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
	public AdvisorCourseCatalog() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(15, 682, 140, 30);
		contentPane.add(btnReturn);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(708, 682, 140, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(230, 687, 69, 20);
		contentPane.add(lblCourse);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(461, 687, 69, 20);
		contentPane.add(lblNumber);
		
		fldCourse = new JTextField();
		fldCourse.setBounds(306, 682, 140, 30);
		contentPane.add(fldCourse);
		fldCourse.setColumns(10);
		
		fldNumber = new JTextField();
		fldNumber.setBounds(532, 682, 140, 30);
		contentPane.add(fldNumber);
		fldNumber.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(992, 0, 26, 666);
		contentPane.add(scrollBar);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(863, 682, 140, 30);
		contentPane.add(btnCreate);
	}

}
