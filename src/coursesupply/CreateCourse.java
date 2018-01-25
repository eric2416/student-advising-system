package coursesupply;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CreateCourse {

	private JFrame frame;
	private JTextField fldCourse;
	private JTextField fldNumber;
	private JTextField fldSection;
	private JTextField fldTime;
	private JTextField fldLocation;
	private JTextField fldTeacher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateCourse window = new CreateCourse();
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
	public CreateCourse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(338, 40, 69, 20);
		frame.getContentPane().add(lblCourse);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(338, 107, 69, 20);
		frame.getContentPane().add(lblNumber);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setBounds(338, 184, 69, 20);
		frame.getContentPane().add(lblSection);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(338, 250, 69, 20);
		frame.getContentPane().add(lblTime);
		
		JLabel lblRoom = new JLabel("Location");
		lblRoom.setBounds(338, 323, 69, 20);
		frame.getContentPane().add(lblRoom);
		
		JLabel lblTeacher = new JLabel("Teacher");
		lblTeacher.setBounds(338, 394, 69, 20);
		frame.getContentPane().add(lblTeacher);
		
		fldCourse = new JTextField();
		fldCourse.setHorizontalAlignment(SwingConstants.CENTER);
		fldCourse.setBounds(272, 61, 200, 30);
		frame.getContentPane().add(fldCourse);
		fldCourse.setColumns(10);
		
		fldNumber = new JTextField();
		fldNumber.setHorizontalAlignment(SwingConstants.CENTER);
		fldNumber.setBounds(272, 132, 200, 30);
		frame.getContentPane().add(fldNumber);
		fldNumber.setColumns(10);
		
		fldSection = new JTextField();
		fldSection.setHorizontalAlignment(SwingConstants.CENTER);
		fldSection.setBounds(272, 204, 200, 30);
		frame.getContentPane().add(fldSection);
		fldSection.setColumns(10);
		
		fldTime = new JTextField();
		fldTime.setHorizontalAlignment(SwingConstants.CENTER);
		fldTime.setBounds(272, 276, 200, 30);
		frame.getContentPane().add(fldTime);
		fldTime.setColumns(10);
		
		fldLocation = new JTextField();
		fldLocation.setHorizontalAlignment(SwingConstants.CENTER);
		fldLocation.setBounds(272, 348, 200, 30);
		frame.getContentPane().add(fldLocation);
		fldLocation.setColumns(10);
		
		fldTeacher = new JTextField();
		fldTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		fldTeacher.setBounds(272, 420, 200, 30);
		frame.getContentPane().add(fldTeacher);
		fldTeacher.setColumns(10);
	}

}
