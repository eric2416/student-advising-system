package coursesupply;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentCourseCatalog extends JFrame {

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
					StudentCourseCatalog frame = new StudentCourseCatalog();
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
	public StudentCourseCatalog() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(244, 688, 69, 20);
		contentPane.add(lblCourse);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(482, 688, 69, 20);
		contentPane.add(lblNumber);
		
		fldCourse = new JTextField();
		fldCourse.setBounds(307, 685, 140, 30);
		contentPane.add(fldCourse);
		fldCourse.setColumns(10);
		
		fldNumber = new JTextField();
		fldNumber.setBounds(566, 687, 140, 30);
		contentPane.add(fldNumber);
		fldNumber.setColumns(10);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(15, 683, 140, 30);
		contentPane.add(btnReturn);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(863, 683, 140, 30);
		contentPane.add(btnSearch);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(992, 0, 26, 667);
		contentPane.add(scrollBar);
	}

}
