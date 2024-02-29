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

public class selectOrthopedicsDepartmentUI3_5 extends JFrame {

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
					selectOrthopedicsDepartmentUI3_5 frame = new selectOrthopedicsDepartmentUI3_5();
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
	public selectOrthopedicsDepartmentUI3_5() {
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
		
		JLabel lblNewLabel = new JLabel("3. 請選擇骨科醫師");
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(299, 104, 177, 50);
		contentPane.add(lblNewLabel);
		
		JRadioButton ee_2 = new JRadioButton("   鄭駿松醫師");
		buttonGroup.add(ee_2);
		ee_2.setForeground(new Color(95, 158, 160));
		ee_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		ee_2.setBackground(Color.WHITE);
		ee_2.setBounds(502, 419, 168, 23);
		contentPane.add(ee_2);
		
		JRadioButton ee_1 = new JRadioButton("   劉哲維醫師");
		buttonGroup.add(ee_1);
		ee_1.setForeground(new Color(95, 158, 160));
		ee_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		ee_1.setBackground(Color.WHITE);
		ee_1.setBounds(124, 419, 168, 23);
		contentPane.add(ee_1);
		
		JButton btnNewButton_1_1 = new JButton("確認");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ee_1.isSelected()) {
					DataInMysql.setSelectedData(DataInMysql.selectedId_card,"骨科", "劉哲維醫師", null,null,null);  
		        } else if (ee_2.isSelected()) {	 
					DataInMysql.setSelectedData(DataInMysql.selectedId_card,"骨科", "鄭駿松醫師", null,null,null);
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
        pic01.setIcon(new ImageIcon(selectOrthopedicsDepartmentUI3_5.class.getResource("/images/09.png")));
        pic01.setBackground(Color.WHITE);
        pic01.setBounds(113, 191, 200,200 );
        contentPane.add(pic01);
        
        JLabel pic01_1 = new JLabel("");
        pic01_1.setBackground(Color.WHITE);
        pic01_1.setIcon(new ImageIcon(selectOrthopedicsDepartmentUI3_5.class.getResource("/images/10.png")));
        pic01_1.setBounds(486, 191, 200, 200);
        contentPane.add(pic01_1);
        
        JTextArea txtrBc = new JTextArea();
        txtrBc.setRows(1);
        txtrBc.setForeground(Color.GRAY);
        txtrBc.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        txtrBc.setLineWrap(true); 
        txtrBc.setWrapStyleWord(true); 
        txtrBc.setText("專長：\n\n肌肉及骨骼腫瘤學、人工關節置換及重建術、組織工程與生物材質、人工關節相關之研究。");
        txtrBc.setBounds(123, 484, 222, 130);
        contentPane.add(txtrBc);
        
        JTextArea txtrBc_1 = new JTextArea();
        txtrBc_1.setWrapStyleWord(true);
        txtrBc_1.setText("專長：\n\n足踝關節重建、大姆趾外翻、人工關節置換、腳部足踝運動傷害、糖尿病足、超音波骨折促癒治療、骨科低能量體外震波治療。");
        txtrBc_1.setRows(1);
        txtrBc_1.setLineWrap(true);
        txtrBc_1.setForeground(Color.GRAY);
        txtrBc_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        txtrBc_1.setBounds(502, 484, 222, 130);
        contentPane.add(txtrBc_1);
		
		
	}

}
