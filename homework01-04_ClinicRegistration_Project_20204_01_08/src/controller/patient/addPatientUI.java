package controller.patient;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.patientDaoimpl;
import model.patient;
import util.buttonUI;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class addPatientUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField id_card;
	private JTextField date_of_birth;
	private JTextField gender;
	private JTextField age;
	private JTextField mobile;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addPatientUI frame = new addPatientUI();
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
	public addPatientUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 820, 661);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("姓名");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(83, 144, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("身分證字號");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(83, 184, 100, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("出生日期（ex:19990101）");
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_2.setForeground(Color.GRAY);
		lblNewLabel_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_2.setBounds(83, 234, 223, 16);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("性別");
		lblNewLabel_1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_3.setForeground(Color.GRAY);
		lblNewLabel_1_3.setBackground(Color.WHITE);
		lblNewLabel_1_3.setBounds(83, 282, 61, 16);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("年齡");
		lblNewLabel_1_4.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_4.setForeground(Color.GRAY);
		lblNewLabel_1_4.setBackground(Color.WHITE);
		lblNewLabel_1_4.setBounds(83, 332, 61, 16);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("電話");
		lblNewLabel_1_5.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_5.setForeground(Color.GRAY);
		lblNewLabel_1_5.setBackground(Color.WHITE);
		lblNewLabel_1_5.setBounds(83, 377, 61, 16);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("地址");
		lblNewLabel_1_6.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_6.setForeground(Color.GRAY);
		lblNewLabel_1_6.setBackground(Color.WHITE);
		lblNewLabel_1_6.setBounds(83, 425, 61, 16);
		contentPane.add(lblNewLabel_1_6);
		
		name = new JTextField();
		name.setForeground(Color.GRAY);
		name.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		name.setColumns(10);
		name.setBounds(333, 136, 256, 32);
		contentPane.add(name);
		
		id_card = new JTextField();
		id_card.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		id_card.setForeground(Color.GRAY);
		id_card.setColumns(10);
		id_card.setBounds(333, 180, 256, 29);
		contentPane.add(id_card);
		
		date_of_birth = new JTextField();
		date_of_birth.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		date_of_birth.setForeground(Color.GRAY);
		date_of_birth.setColumns(10);
		date_of_birth.setBounds(333, 229, 256, 26);
		contentPane.add(date_of_birth);
		
		gender = new JTextField();
		gender.setForeground(Color.GRAY);
		gender.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		gender.setColumns(10);
		gender.setBounds(333, 272, 256, 26);
		contentPane.add(gender);
		
		age = new JTextField();
		age.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		age.setForeground(Color.GRAY);
		age.setColumns(10);
		age.setBounds(333, 327, 256, 26);
		contentPane.add(age);
		
		mobile = new JTextField();
		mobile.setForeground(Color.GRAY);
		mobile.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		mobile.setColumns(10);
		mobile.setBounds(333, 372, 256, 26);
		contentPane.add(mobile);
		
		address = new JTextField();
		address.setForeground(Color.GRAY);
		address.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		address.setColumns(10);
		address.setBounds(333, 420, 256, 26);
		contentPane.add(address);
		
		JLabel lblNewLabel = new JLabel("初診資料填寫");
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(146, 49, 165, 66);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("返回登入頁面");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.addLoginUI();
				dispose();
			}
		});
		btnNewButton_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(149, 506, 138, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("確認");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    String Id_card=id_card.getText();
			    //檢查帳號，如果檢查失敗，跳轉到添加初診資料失敗頁面;
			    if(new patientDaoimpl().queryPatient(Id_card))
			    {
			    	buttonUI.addaddPatientErrorUI();
			    	dispose();
			    } 
			    else 
			    {
			    	String Name=name.getText();
			    	//String Id_card=id_card.getText(); 錯誤，if這邊已經使用了Id_card
			    	String Date_of_birth=date_of_birth.getText();
			    	String Gender=gender.getText();
			    	Integer Age=Integer.parseInt(age.getText());
			    	String Mobile=mobile.getText();
			    	String Address=address.getText();
			    	
			    	//創建新會員
			    	patient p=new patient(Name,Id_card,Date_of_birth,Gender,Age,Mobile,Address);
			    	
			    	//將新會員添加到資料庫中
			    	new patientDaoimpl().add(p);
			    	
			    	//顯示添加會員成功頁面
			    	buttonUI.addaddPatientSuccessUI();
			    	dispose();
			    	
			    }
			    
			   
			    	
			    	
			    	
			    }
			
		});
		btnNewButton_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(485, 506, 138, 40);
		contentPane.add(btnNewButton_1_1);
		
		
	}
}
