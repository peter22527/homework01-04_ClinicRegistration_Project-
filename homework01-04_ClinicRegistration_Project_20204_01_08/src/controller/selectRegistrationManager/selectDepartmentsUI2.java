package controller.selectRegistrationManager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.departmentDao;
import dao.impl.departmentDaoimpl;
import dao.impl.patientDaoimpl;
import model.departments;
import model.patient;
import util.Date;
import util.buttonUI;
import util.DataInMysql;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class selectDepartmentsUI2 extends JFrame {
	
	private departments registrationData;//
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String selectedDepartment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectDepartmentsUI2 frame = new selectDepartmentsUI2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				}});}
	
	

	/**
	 * Create the frame.
	 */
	public selectDepartmentsUI2() {
		
		 
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 820, 661);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("歡迎使用大城小醫診所 網路掛號系統");
		lblNewLabel_2.setBounds(194, 62, 397, 30);
		lblNewLabel_2.setForeground(new Color(95, 158, 160));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_2.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("2. 請選擇科別");
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(323, 104, 134, 50);
		contentPane.add(lblNewLabel);
		
		JRadioButton cc = new JRadioButton("   耳鼻喉科");
		buttonGroup.add(cc);
		cc.setForeground(new Color(128, 128, 128));
		cc.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		cc.setBackground(new Color(255, 255, 255));
		cc.setBounds(548, 213, 141, 23);
		contentPane.add(cc);
		
		JRadioButton dd = new JRadioButton("   皮膚科");
		buttonGroup.add(dd);
		dd.setForeground(Color.GRAY);
		dd.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		dd.setBackground(Color.WHITE);
		dd.setBounds(94, 294, 141, 23);
		contentPane.add(dd);
		
		JRadioButton ff = new JRadioButton("   肝膽腸胃科");
		buttonGroup.add(ff);
		ff.setForeground(Color.GRAY);
		ff.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		ff.setBackground(Color.WHITE);
		ff.setBounds(548, 294, 141, 23);
		contentPane.add(ff);
		
		JRadioButton bb = new JRadioButton("   一般外科");
		buttonGroup.add(bb);
		bb.setForeground(Color.GRAY);
		bb.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		bb.setBackground(Color.WHITE);
		bb.setBounds(319, 213, 141, 23);
		contentPane.add(bb);
		
		JRadioButton aa = new JRadioButton("   一般內科");
		aa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 selectedDepartment="一般內科";
			}
		});
		buttonGroup.add(aa);
		aa.setForeground(Color.GRAY);
		aa.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		aa.setBackground(Color.WHITE);
		aa.setBounds(94, 213, 141, 23);
		contentPane.add(aa);
		
		JRadioButton ee = new JRadioButton("   骨科");
		buttonGroup.add(ee);
		ee.setForeground(Color.GRAY);
		ee.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		ee.setBackground(Color.WHITE);
		ee.setBounds(319, 294, 141, 23);
		contentPane.add(ee);
		
		JButton btnNewButton_1_1 = new JButton("確認");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
 
			
		    @Override
		    public void mouseClicked(MouseEvent e) {
                if (aa.isSelected()) {  
                	DataInMysql.setSelectedData(DataInMysql.selectedId_card,"一般內科", null, null,null,null);
                    buttonUI.addInternalMedicineDepartmentUI1();
                    dispose();
		           
		        } else if (bb.isSelected()) {
		        	DataInMysql.setSelectedData(DataInMysql.selectedId_card,"一般外科", null, null,null,null);
		            buttonUI.addSurgicalDepartmentUI2();
		            dispose();
		            
		        } else if (cc.isSelected()) {
		        	DataInMysql.setSelectedData(DataInMysql.selectedId_card,"耳鼻喉科", null, null,null,null);	 
		            buttonUI.addOtorhinolaryngologyClinicUI3();
		            dispose();
		            
		        } else if (dd.isSelected()) {
		        	DataInMysql.setSelectedData(DataInMysql.selectedId_card,"皮膚科", null, null,null,null);
		            buttonUI.addDrematologyDepartemntUI4();
		            dispose();
		            
		        } else if (ee.isSelected()) {
		        	DataInMysql.setSelectedData(DataInMysql.selectedId_card,"骨科", null, null,null,null);
		            buttonUI.addOrthopedicsDepartmentUI5();
		            dispose();
		            
		        } else if (ff.isSelected()) {
		        	DataInMysql.setSelectedData(DataInMysql.selectedId_card,"肝膽腸胃科", null, null,null,null);
		            buttonUI.addGastroenterologyClinicUI6();
		            dispose();
		        }
		    }});

		btnNewButton_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(453, 500, 138, 40);
		contentPane.add(btnNewButton_1_1);
		
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
		btnNewButton_1_1_1.setBounds(157, 500, 188, 40);
		contentPane.add(btnNewButton_1_1_1);
		
		
		
		
	}
}
