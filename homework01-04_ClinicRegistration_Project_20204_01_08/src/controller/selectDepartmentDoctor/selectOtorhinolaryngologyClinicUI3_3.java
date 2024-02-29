package controller.selectDepartmentDoctor;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import dao.impl.departmentDaoimpl;
import util.buttonUI;
import util.DataInMysql;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class selectOtorhinolaryngologyClinicUI3_3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectOtorhinolaryngologyClinicUI3_3 frame = new selectOtorhinolaryngologyClinicUI3_3();
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
	public selectOtorhinolaryngologyClinicUI3_3() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 820, 793);
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
		
		JLabel lblNewLabel = new JLabel("3. 請選擇耳鼻喉科醫師");
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(289, 105, 188, 50);
		contentPane.add(lblNewLabel);
		
		JRadioButton cc_2 = new JRadioButton("   陳育儒醫師");
		buttonGroup.add(cc_2);
		cc_2.setForeground(new Color(95, 158, 160));
		cc_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		cc_2.setBackground(Color.WHITE);
		cc_2.setBounds(498, 419, 168, 23);
		contentPane.add(cc_2);
		
		JRadioButton cc_1 = new JRadioButton("   吳文欣醫師");
		buttonGroup.add(cc_1);
		cc_1.setForeground(new Color(95, 158, 160));
		cc_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		cc_1.setBackground(Color.WHITE);
		cc_1.setBounds(124, 419, 168, 23);
		contentPane.add(cc_1);
		
		JButton btnNewButton_1_1 = new JButton("確認");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (cc_1.isSelected()) {
					DataInMysql.setSelectedData(DataInMysql.selectedId_card,"耳鼻喉科", "吳文欣醫師", null,null,null);
      
		        } else if (cc_2.isSelected()) {    
		        	DataInMysql.setSelectedData(DataInMysql.selectedId_card,"耳鼻喉科", "陳育儒醫師", null,null,null);	        	    
		        }
				buttonUI.addregistrationDate();
	            dispose();
		}
	});
		btnNewButton_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(453, 680, 138, 40);
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
		btnNewButton_1_1_1.setBounds(157, 680, 188, 40);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel pic01 = new JLabel("");
        pic01.setIcon(new ImageIcon(selectOtorhinolaryngologyClinicUI3_3.class.getResource("/images/05.png")));
        pic01.setBackground(Color.WHITE);
        pic01.setBounds(113, 191, 200,200 );
        contentPane.add(pic01);
        
        JLabel pic01_1 = new JLabel("");
        pic01_1.setBackground(Color.WHITE);
        pic01_1.setIcon(new ImageIcon(selectOtorhinolaryngologyClinicUI3_3.class.getResource("/images/06.png")));
        pic01_1.setBounds(486, 191, 200, 200);
        contentPane.add(pic01_1);
        
        JTextArea txtrBc = new JTextArea();
        txtrBc.setRows(1);
        txtrBc.setForeground(Color.GRAY);
        txtrBc.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        txtrBc.setLineWrap(true); 
        txtrBc.setWrapStyleWord(true); 
        txtrBc.setText("專長：\n\n一般耳鼻喉科、鼻過敏、兒童耳鼻喉疾病、嗅覺障礙及復發性鼻竇炎、鼻竇內視鏡。");
        txtrBc.setBounds(123, 484, 222, 130);
        contentPane.add(txtrBc);
        
        JTextArea txtrBc_1 = new JTextArea();
        txtrBc_1.setWrapStyleWord(true);
        txtrBc_1.setText("專長：\n\n鼻過敏、嗅覺障礙及復發性鼻竇炎、鼻竇內視鏡、鼻整型、鼻因性頭痛。");
        txtrBc_1.setRows(1);
        txtrBc_1.setLineWrap(true);
        txtrBc_1.setForeground(Color.GRAY);
        txtrBc_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        txtrBc_1.setBounds(502, 484, 222, 130);
        contentPane.add(txtrBc_1);
		
		
	}

}
