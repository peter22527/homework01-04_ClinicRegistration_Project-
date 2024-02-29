

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

public class selectGastroenterologyClinicUI3_6 extends JFrame {

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
					selectGastroenterologyClinicUI3_6 frame = new selectGastroenterologyClinicUI3_6();
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
	public selectGastroenterologyClinicUI3_6() {
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
		
		JLabel lblNewLabel = new JLabel("3. 請選擇肝膽腸胃科醫師");
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(287, 106, 222, 50);
		contentPane.add(lblNewLabel);
		
		JRadioButton ff_2 = new JRadioButton("   陳治丹醫師");
		buttonGroup.add(ff_2);
		ff_2.setForeground(new Color(95, 158, 160));
		ff_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		ff_2.setBackground(Color.WHITE);
		ff_2.setBounds(502, 419, 168, 23);
		contentPane.add(ff_2);
		
		JRadioButton ff_1 = new JRadioButton("   劉怡婷醫師");
		buttonGroup.add(ff_1);
		ff_1.setForeground(new Color(95, 158, 160));
		ff_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		ff_1.setBackground(Color.WHITE);
		ff_1.setBounds(124, 419, 168, 23);
		contentPane.add(ff_1);
		
		JButton btnNewButton_1_1 = new JButton("確認");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ff_1.isSelected()) {
		            DataInMysql.setSelectedData(DataInMysql.selectedId_card,"肝膽腸胃科", "劉怡婷醫師", null,null,null);

		        } else if (ff_2.isSelected()) {
		        	DataInMysql.setSelectedData(DataInMysql.selectedId_card,"肝膽腸胃科", "陳治丹醫師", null,null,null);	 
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
        pic01.setIcon(new ImageIcon(selectGastroenterologyClinicUI3_6.class.getResource("/images/11.png")));
        pic01.setBackground(Color.WHITE);
        pic01.setBounds(113, 191, 200,200 );
        contentPane.add(pic01);
        
        JLabel pic01_1 = new JLabel("");
        pic01_1.setBackground(Color.WHITE);
        pic01_1.setIcon(new ImageIcon(selectGastroenterologyClinicUI3_6.class.getResource("/images/12.png")));
        pic01_1.setBounds(486, 191, 200, 200);
        contentPane.add(pic01_1);
        
        JTextArea txtrBc = new JTextArea();
        txtrBc.setRows(1);
        txtrBc.setForeground(Color.GRAY);
        txtrBc.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        txtrBc.setLineWrap(true); 
        txtrBc.setWrapStyleWord(true); 
        txtrBc.setText("專長：\n\nB 型及 D 型肝炎之基礎研究、內視鏡超音波及相關、內視鏡超音波、食道及胃腸道腫瘤之黏膜切除術、胰臟疾病研究。");
        txtrBc.setBounds(123, 484, 222, 130);
        contentPane.add(txtrBc);
        
        JTextArea txtrBc_1 = new JTextArea();
        txtrBc_1.setWrapStyleWord(true);
        txtrBc_1.setText("專長：\n\n小腸疾病治療及雙氣囊小腸鏡檢、內視鏡逆行性膽道及胰臟治療術、治療性內視鏡、一般胃腸及肝膽疾病。");
        txtrBc_1.setRows(1);
        txtrBc_1.setLineWrap(true);
        txtrBc_1.setForeground(Color.GRAY);
        txtrBc_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        txtrBc_1.setBounds(502, 484, 222, 130);
        contentPane.add(txtrBc_1);
		
	}

}
