package controller.selectRegistrationManager;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import dao.impl.departmentDaoimpl;
import model.departments;
import util.Date;
import util.buttonUI;
import util.DataInMysql;

import java.awt.Color;
import javax.swing.JTextField;

public class selectRegistrationDateUI4 extends JFrame {
	
	private departments registrationData;
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField date;
	private String  selectedDepartment;
    private String selectedDoctor;
    private String selectedDate;
    
    
    

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectRegistrationDateUI4 frame = new selectRegistrationDateUI4();
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
	public selectRegistrationDateUI4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 820, 793);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel lblNewLabel_2 = new JLabel("歡迎使用大城小醫診所 網路掛號系統");
		lblNewLabel_2.setBounds(194, 62, 397, 30);
		lblNewLabel_2.setForeground(new Color(95, 158, 160));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_2.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("4. 請選擇日期");
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(346, 104, 130, 50);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1_1_1 = new JButton("返回網路掛號系統");
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
		btnNewButton_1_1_1.setBounds(138, 609, 188, 40);
		contentPane.add(btnNewButton_1_1_1);
		
		
		 
		JButton btnNewButton_1_1_1_1 = new JButton("確認");
		btnNewButton_1_1_1_1.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        DataInMysql.selectedDate = date.getText();
		        departments dep = new departments(DataInMysql.selectedId_card,DataInMysql.selectedDepartment, DataInMysql.selectedDoctor, DataInMysql.selectedDate, null, null);
		        buttonUI.addselectTimeUI();
		        dispose();
		    }
		});


		btnNewButton_1_1_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1.setBounds(469, 609, 188, 40);
		contentPane.add(btnNewButton_1_1_1_1);
		
		
		date = new JTextField();
		date.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Date date1=new Date(date);
				date1.showDialog();
			}
		});
		
		date.setBounds(356, 174, 96, 33);
		contentPane.add(date);
		date.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("按一下開啟視窗");
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(355, 206, 105, 36);
		contentPane.add(lblNewLabel_1);
	
	}
	

		}



