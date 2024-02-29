package editPatient;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;


import dao.impl.patientDaoimpl;
import model.patient;
import util.buttonUI;

public class updatePatientUI2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id_card;
	private JTextField name;
	private JTextField id_card2;
	private JTextField date_of_birth;
	private JTextField gender;
	private JTextField age;
	private JTextField mobile;
	private JTextField address;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_4;
	private JLabel lblNewLabel_1_5;
	private JLabel lblNewLabel_1_6;
	private JLabel lblNewLabel_1_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatePatientUI2 frame = new updatePatientUI2();
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
	public updatePatientUI2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 820, 793);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("修改個人資料");
		lblNewLabel_2.setBounds(310, 26, 151, 30);
		lblNewLabel_2.setForeground(new Color(95, 158, 160));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_2.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("身分證字號");
		lblNewLabel.setBounds(80, 86, 134, 50);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		JTextArea output = new JTextArea();
		output.setBounds(78, 402, 525, 180);
		output.setForeground(Color.GRAY);
		output.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		contentPane.add(output);
		
		JButton btnNewButton_1_1_1 = new JButton("返回");
		btnNewButton_1_1_1.setBounds(66, 605, 138, 40);
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			 buttonUI.addregistrationSuccessUI();
			 dispose();
			}
		});
		btnNewButton_1_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton ok = new JButton("確認修改資料");
		ok.setBounds(469, 605, 138, 40);
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name=name.getText();
				String Id_card2=id_card2.getText();
				String Date_of_birth=date_of_birth.getText();
				String Gender=gender.getText();
				Integer Age=Integer.parseInt(age.getText());
		    	String Mobile=mobile.getText();
		    	String Address=address.getText();
		    	
		    	patient p=new patientDaoimpl().queryPatientAndUpdate(Id_card2);
		    	p.setName(Name);
		    	p.setId_card(Id_card2);
		    	p.setDate_of_birth(Date_of_birth);
		    	p.setGender(Gender);
		    	p.setAge(Age);
		    	p.setMobile(Mobile);
		    	p.setAddress(Address);
		    	
		    	new patientDaoimpl().update(p);
			}
		});
		ok.setForeground(UIManager.getColor("Button.select"));
		ok.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		ok.setBackground(Color.WHITE);
		contentPane.add(ok);
		
		id_card = new JTextField();
		id_card.setBounds(182, 96, 226, 30);
		id_card.setForeground(Color.GRAY);
		id_card.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		id_card.setColumns(10);
		contentPane.add(id_card);
		

		JButton btnNewButton_1_1 = new JButton("查詢資料");
		btnNewButton_1_1.setBounds(420, 92, 138, 40);
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Id_card=id_card.getText();
				
				List<patient> l=new patientDaoimpl().queryId_card(Id_card);
				String show="";
				
				for(patient p:l) 
				{
					show=show+"\n姓名："+p.getName()+
							  "\n身分證："+p.getId_card()+	
							  "\n出生日期："+p.getDate_of_birth()+
							  "\n性別："+p.getGender()+	
							  "\n年齡："+p.getAge()+	  			  		
							  "\n電話："+p.getMobile()+
							  "\n地址："+p.getAddress();		  
				}
				output.setText(show);
			}});
		btnNewButton_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1.setBackground(Color.WHITE);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("修改資料");
		lblNewLabel_1.setBounds(80, 136, 90, 50);
		lblNewLabel_1.setForeground(new Color(95, 158, 160));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(182, 198, 134, 22);
		name.setForeground(Color.GRAY);
		name.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		name.setColumns(10);
		contentPane.add(name);
		
		id_card2 = new JTextField();
		id_card2.setBounds(469, 197, 134, 22);
		id_card2.setForeground(Color.GRAY);
		id_card2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		id_card2.setColumns(10);
		contentPane.add(id_card2);
		
		date_of_birth = new JTextField();
		date_of_birth.setBounds(182, 248, 134, 22);
		date_of_birth.setForeground(Color.GRAY);
		date_of_birth.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		date_of_birth.setColumns(10);
		contentPane.add(date_of_birth);
		
		gender = new JTextField();
		gender.setBounds(469, 245, 134, 22);
		gender.setForeground(Color.GRAY);
		gender.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		gender.setColumns(10);
		contentPane.add(gender);
		
		age = new JTextField();
		age.setBounds(182, 296, 134, 22);
		age.setForeground(Color.GRAY);
		age.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		age.setColumns(10);
		contentPane.add(age);
		
		mobile = new JTextField();
		mobile.setBounds(469, 293, 134, 22);
		mobile.setForeground(Color.GRAY);
		mobile.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		mobile.setColumns(10);
		contentPane.add(mobile);
		
		address = new JTextField();
		address.setBounds(182, 344, 421, 22);
		address.setForeground(Color.GRAY);
		address.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		address.setColumns(10);
		contentPane.add(address);
		
		JLabel lblNewLabel_1_1 = new JLabel("姓名");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(80, 183, 90, 50);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_1_2 = new JLabel("身分證");
		lblNewLabel_1_2.setForeground(Color.GRAY);
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_2.setBounds(367, 183, 90, 50);
		contentPane.add(lblNewLabel_1_2);
		
		lblNewLabel_1_3 = new JLabel("出生年月日");
		lblNewLabel_1_3.setForeground(Color.GRAY);
		lblNewLabel_1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_3.setBackground(Color.WHITE);
		lblNewLabel_1_3.setBounds(80, 232, 90, 50);
		contentPane.add(lblNewLabel_1_3);
		
		lblNewLabel_1_4 = new JLabel("性別");
		lblNewLabel_1_4.setForeground(Color.GRAY);
		lblNewLabel_1_4.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_4.setBackground(Color.WHITE);
		lblNewLabel_1_4.setBounds(367, 231, 90, 50);
		contentPane.add(lblNewLabel_1_4);
		
		lblNewLabel_1_5 = new JLabel("年齡");
		lblNewLabel_1_5.setForeground(Color.GRAY);
		lblNewLabel_1_5.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_5.setBackground(Color.WHITE);
		lblNewLabel_1_5.setBounds(80, 282, 90, 50);
		contentPane.add(lblNewLabel_1_5);
		
		lblNewLabel_1_6 = new JLabel("電話");
		lblNewLabel_1_6.setForeground(Color.GRAY);
		lblNewLabel_1_6.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_6.setBackground(Color.WHITE);
		lblNewLabel_1_6.setBounds(367, 279, 90, 50);
		contentPane.add(lblNewLabel_1_6);
		
		lblNewLabel_1_7 = new JLabel("地址");
		lblNewLabel_1_7.setForeground(Color.GRAY);
		lblNewLabel_1_7.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_7.setBackground(Color.WHITE);
		lblNewLabel_1_7.setBounds(80, 330, 90, 50);
		contentPane.add(lblNewLabel_1_7);
	}
}
