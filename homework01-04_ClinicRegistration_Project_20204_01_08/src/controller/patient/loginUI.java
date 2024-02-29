package controller.patient;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.patient;
import util.DataInMysql;
import util.buttonUI;
import dao.impl.patientDaoimpl;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField id_card;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginUI frame = new loginUI();
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
	public loginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 758, 674);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 371, 646);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(loginUI.class.getResource("/images/login.png")));
		lblNewLabel_3.setBounds(0, 0, 371, 646);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("身分證字號");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(407, 174, 134, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("出生日期");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(95, 158, 160));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(407, 276, 134, 50);
		contentPane.add(lblNewLabel_1);
		
		
		
		JButton btnNewButton_1 = new JButton("初診填寫資料");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.addaddPatientUI();
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton_1.setBounds(403, 505, 138, 40);
		contentPane.add(btnNewButton_1);
		
		id_card = new JPasswordField();
		id_card.setToolTipText("請輸入身分證");
		id_card.setForeground(Color.GRAY);
		id_card.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		id_card.setBounds(407, 221, 305, 40);
		contentPane.add(id_card);
		
		JFormattedTextField date_of_birth = new JFormattedTextField();
		date_of_birth.setToolTipText("請輸入出生日期");
		date_of_birth.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		date_of_birth.setForeground(Color.GRAY);
		date_of_birth.setBounds(407, 322, 305, 40);
		contentPane.add(date_of_birth);
		
		JLabel lblNewLabel_2 = new JLabel("大城小醫診所 網路掛號系統");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(95, 158, 160));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(407, 56, 317, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("範例：19990101");
		lblNewLabel_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(497, 276, 184, 50);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("複診登入");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String addId_card = id_card.getText(); //獲取身分證字號資訊（帳號）
				String addDate_of_birth=date_of_birth.getText(); //獲取出生年月日資訊（密碼）
				
				patient p=new patientDaoimpl().queryPatient(addId_card, addDate_of_birth);
				
				if(p!=null) 
				{
					DataInMysql.selectedLoginId_card = addId_card; // 保存登入時的身分證
			        DataInMysql.selectedId_card = addId_card; // 保存輸入的身分證，以供後續使用
			        
					buttonUI.addregistrationManagerUI();
					dispose();
				}
				else 
				{
					buttonUI.addloginErrorUI();
					dispose();  
				}
          }});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(UIManager.getColor("Button.select"));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton.setBounds(574, 505, 138, 40);
		contentPane.add(btnNewButton);
		
		
	}
}
