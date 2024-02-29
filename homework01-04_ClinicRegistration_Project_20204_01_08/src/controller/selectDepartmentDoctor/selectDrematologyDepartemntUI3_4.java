


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

public class selectDrematologyDepartemntUI3_4 extends JFrame {

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
					selectDrematologyDepartemntUI3_4 frame = new selectDrematologyDepartemntUI3_4();
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
	public selectDrematologyDepartemntUI3_4() {
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
		
		JLabel lblNewLabel = new JLabel("3. 請選擇皮膚科醫師");
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(299, 104, 177, 50);
		contentPane.add(lblNewLabel);
		
		JRadioButton dd_2 = new JRadioButton("   陳姿珊醫師");
		buttonGroup.add(dd_2);
		dd_2.setForeground(new Color(95, 158, 160));
		dd_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		dd_2.setBackground(Color.WHITE);
		dd_2.setBounds(502, 419, 168, 23);
		contentPane.add(dd_2);
		
		JRadioButton dd_1 = new JRadioButton("   陳君文醫師");
		buttonGroup.add(dd_1);
		dd_1.setForeground(new Color(95, 158, 160));
		dd_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		dd_1.setBackground(Color.WHITE);
		dd_1.setBounds(124, 419, 168, 23);
		contentPane.add(dd_1);
		
		JButton btnNewButton_1_1 = new JButton("確認");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (dd_1.isSelected()) {
					DataInMysql.setSelectedData(DataInMysql.selectedId_card,"皮膚科", "陳君文醫師", null,null,null);
		        } else if (dd_2.isSelected()) {
		        	DataInMysql.setSelectedData(DataInMysql.selectedId_card,"皮膚科", "陳姿珊醫師", null,null,null);  	  
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
        pic01.setIcon(new ImageIcon(selectDrematologyDepartemntUI3_4.class.getResource("/images/07.png")));
        pic01.setBackground(Color.WHITE);
        pic01.setBounds(113, 191, 200,200 );
        contentPane.add(pic01);
        
        JLabel pic01_1 = new JLabel("");
        pic01_1.setBackground(Color.WHITE);
        pic01_1.setIcon(new ImageIcon(selectDrematologyDepartemntUI3_4.class.getResource("/images/08.png")));
        pic01_1.setBounds(486, 191, 200, 200);
        contentPane.add(pic01_1);
        
        JTextArea txtrBc = new JTextArea();
        txtrBc.setRows(1);
        txtrBc.setForeground(Color.GRAY);
        txtrBc.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        txtrBc.setLineWrap(true); 
        txtrBc.setWrapStyleWord(true); 
        txtrBc.setText("專長：\n\nCO2 雷射對各種腫瘤之治療研究、皮膚雷射、肉毒桿菌注射除皺、 玻尿酸除皺整形、黑斑、乾癬、一般皮膚病症。");
        txtrBc.setBounds(124, 484, 222, 122);
        contentPane.add(txtrBc);
        
        JTextArea txtrBc_1 = new JTextArea();
        txtrBc_1.setWrapStyleWord(true);
        txtrBc_1.setText("專長：\n\n一般皮膚病症、果酸換膚、雷射除斑除痣除毛除疤、痘疤治療、飛梭雷射、柔膚雷射、脈衝光美白、肉毒桿菌除皺、玻尿酸注射、電波拉皮、 音波拉提、 皮秒雷射。");
        txtrBc_1.setRows(1);
        txtrBc_1.setLineWrap(true);
        txtrBc_1.setForeground(Color.GRAY);
        txtrBc_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        txtrBc_1.setBounds(502, 484, 222, 160);
        contentPane.add(txtrBc_1);
		
		
	}

}
