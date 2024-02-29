package controller.queryRegistration;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import dao.impl.RegistrationDaoimpl;
import dao.impl.departmentDaoimpl;
import model.Registration;
import model.departments;
import util.buttonUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class CancelRegistrationUI extends JFrame {

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
					CancelRegistrationUI frame = new CancelRegistrationUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}});}

	/**
	 * Create the frame.
	 */
	public CancelRegistrationUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 820, 793);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("取消掛號");
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
		
		JTextArea output = new JTextArea();
		output.setForeground(Color.GRAY);
		output.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		output.setBounds(150, 362, 515, 218);
		contentPane.add(output);
		
		JButton btnNewButton_1_1_1 = new JButton("取消掛號");
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new departmentDaoimpl().delete(id_card.getText());	
			}
		});
		btnNewButton_1_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setBounds(335, 277, 138, 40);
		contentPane.add(btnNewButton_1_1_1);
		
		id_card = new JTextField();
		id_card.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		id_card.setForeground(Color.GRAY);
		id_card.setColumns(10);
		id_card.setBounds(295, 217, 226, 30);
		contentPane.add(id_card);
		
		JButton btnNewButton_1_1_1_1 = new JButton("返回");
		btnNewButton_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.addregistrationSuccessUI();
				dispose();
			}
		});
		btnNewButton_1_1_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1.setBounds(527, 277, 138, 40);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("查詢掛號");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
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
			}});
		btnNewButton_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(142, 277, 138, 40);
		contentPane.add(btnNewButton_1_1);
		
	}

}
