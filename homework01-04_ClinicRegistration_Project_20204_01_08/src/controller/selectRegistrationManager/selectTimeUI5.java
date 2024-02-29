package controller.selectRegistrationManager;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import dao.impl.departmentDaoimpl;
import model.departments;
import util.DataInMysql;
import util.Date;
import util.buttonUI;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class selectTimeUI5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private String  selectedDepartment;
    private String selectedDoctor;
    private String selectedDate;
    private String selectedTime;
    private String selectedNumber;
	private JPanel contentPane;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectTimeUI5 frame = new selectTimeUI5();
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
	public selectTimeUI5() {
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
		
		JLabel lblNewLabel = new JLabel("5 請選擇時間");
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
		
		
		
		JRadioButton morning = new JRadioButton("上午時段 0800-1200");
		buttonGroup.add(morning);
		morning.setForeground(Color.GRAY);
		morning.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		morning.setBackground(Color.WHITE);
		morning.setBounds(270, 194, 238, 23);
		contentPane.add(morning);
		
		JRadioButton afternoon = new JRadioButton("下午時段 1500-1800");
		buttonGroup.add(afternoon);
		afternoon.setForeground(Color.GRAY);
		afternoon.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		afternoon.setBackground(Color.WHITE);
		afternoon.setBounds(270, 246, 238, 23);
		contentPane.add(afternoon);
		
		JRadioButton evening = new JRadioButton("晚上時段 1900-2200");
		buttonGroup.add(evening);
		evening.setForeground(Color.GRAY);
		evening.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		evening.setBackground(Color.WHITE);
		evening.setBounds(270, 299, 238, 23);
		contentPane.add(evening);
		
		 
		JButton btnNewButton_1_1_1_1 = new JButton("確認掛號");
		btnNewButton_1_1_1_1.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        if      (morning.isSelected())   {DataInMysql.selectedTime = morning.getText();} 
		        else if (afternoon.isSelected()) {DataInMysql.selectedTime = afternoon.getText();} 
		        else if (evening.isSelected())   {DataInMysql.selectedTime = evening.getText();}
		        
		        //執行registration生成掛號號碼
		        DataInMysql data = new DataInMysql();
		        data.registration();

		        selectSuccessUI6 successUI = new selectSuccessUI6();
		        successUI.setOutputText("掛號成功\n\n" +
		                "科別：" + DataInMysql.selectedDepartment + "\n" +
		                "醫師：" + DataInMysql.selectedDoctor + "\n" +
		                "日期：" + DataInMysql.selectedDate + "\n" +
		                "時間：" + DataInMysql.selectedTime + "\n" +
		                "號碼：" + DataInMysql.selectedNumber);

		        // 跳轉到下一頁
		        successUI.setVisible(true);
		        dispose();}});

		btnNewButton_1_1_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1.setBounds(469, 609, 188, 40);
		contentPane.add(btnNewButton_1_1_1_1);}
		

	
	
}
