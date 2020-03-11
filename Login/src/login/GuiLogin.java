package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class GuiLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField_UserName;
	private JPasswordField passwordField_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiLogin frame = new GuiLogin();
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
	public GuiLogin() {
		setTitle("Chase");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_Banner = new JLabel("Please Login");
		lblNewLabel_Banner.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_Banner.setBounds(154, 13, 128, 34);
		contentPane.add(lblNewLabel_Banner);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(64, 79, 77, 29);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(64, 137, 77, 29);
		contentPane.add(lblPassword);
		
		textField_UserName = new JTextField();
		textField_UserName.setBounds(154, 83, 195, 22);
		contentPane.add(textField_UserName);
		textField_UserName.setColumns(10);
		
		passwordField_Password = new JPasswordField();
		passwordField_Password.setBounds(154, 141, 195, 22);
		contentPane.add(passwordField_Password);
		
		JButton btnNewButton_Login = new JButton("Login");
		btnNewButton_Login.setBounds(170, 192, 112, 34);
		contentPane.add(btnNewButton_Login);
	}
}
