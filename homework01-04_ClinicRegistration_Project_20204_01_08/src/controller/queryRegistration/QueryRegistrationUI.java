package controller.queryRegistration;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import dao.impl.RegistrationDaoimpl;
import model.Registration;
import util.buttonUI;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DropMode;

public class QueryRegistrationUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id_card;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QueryRegistrationUI frame = new QueryRegistrationUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}});}

	/**
	 * Create the frame.
	 */
	public QueryRegistrationUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 820, 793);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("查詢掛號");
		lblNewLabel_2.setBounds(360, 118, 96, 30);
		lblNewLabel_2.setForeground(new Color(95, 158, 160));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_2.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("身分證字號");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(150, 203, 134, 50);
		contentPane.add(lblNewLabel);
		
		id_card = new JTextField();
		id_card.setForeground(Color.GRAY);
		id_card.setBounds(273, 213, 226, 30);
		contentPane.add(id_card);
		id_card.setColumns(10);
		
		
		JTextArea output = new JTextArea();
		output.setWrapStyleWord(true);
		output.setRows(10);
		output.setTabSize(10);
		output.setForeground(Color.GRAY);
		output.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		output.setBackground(Color.WHITE);
		output.setBounds(142, 339, 357, 243);
		contentPane.add(output);
		
		JButton back = new JButton("返回");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.addregistrationSuccessUI();
				dispose();
			}
		});
		back.setForeground(UIManager.getColor("Button.select"));
		back.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		back.setBackground(Color.WHITE);
		back.setBounds(325, 272, 138, 40);
		contentPane.add(back);
		
		

		JButton queryRegistration = new JButton("查詢掛號");
		queryRegistration.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Id_card=id_card.getText();
				List<Registration> l=new RegistrationDaoimpl().QueryRegistration(Id_card);
				String show="";
				
				for(Registration r:l) 
				{
					show=show+"\n姓名："+r.getName()+
							  //"\n出生日期："+r.getDate_of_birth()+
							  //"\n年齡："+r.getAge()+	
							  //"\n身分證："+r.getId_card()+				  		
							  "\n科別："+r.getDepartment()+
							  "\n醫師："+r.getDoctor()+
							  "\n日期："+r.getDate()+
							  "\n時間："+r.getTime()+
							  "\n掛號號碼："+r.getNumber();
				}
				output.setText(show);
			}
		});
		queryRegistration.setForeground(UIManager.getColor("Button.select"));
		queryRegistration.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		queryRegistration.setBackground(Color.WHITE);
		queryRegistration.setBounds(132, 272, 138, 40);
		contentPane.add(queryRegistration);
		
	}
}
