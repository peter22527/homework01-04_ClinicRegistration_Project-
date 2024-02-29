package controller.patient;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import util.buttonUI;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class registrationManagerUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationManagerUI frame = new registrationManagerUI();
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
	public registrationManagerUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 820, 793);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1_1 = new JButton("查詢掛號");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.addQueryRegistrationUI1();
				dispose();
			}
		});
		btnNewButton_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(212, 246, 138, 40);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("取消掛號");
		btnNewButton_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.addCancelRegistration();
				dispose();
			}
		});
		btnNewButton_1_1_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1.setBounds(212, 341, 138, 40);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("歡迎使用大城小醫診所 網路掛號系統");
		lblNewLabel_2_1.setForeground(new Color(95, 158, 160));
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(212, 30, 397, 30);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1_1_2 = new JButton("網路掛號");
		btnNewButton_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.addselectId_cardUI();
				dispose();
			}
		});
		btnNewButton_1_1_2.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1_2.setBackground(Color.WHITE);
		btnNewButton_1_1_2.setBounds(212, 156, 137, 40);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_2 = new JButton("回登入頁面");
		btnNewButton_1_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.addLoginUI();
				dispose();
			}
		});
		btnNewButton_1_1_1_2.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1_1_2.setBackground(Color.WHITE);
		btnNewButton_1_1_1_2.setBounds(209, 429, 138, 40);
		contentPane.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_1_1_1_2_1_1 = new JButton("修改個人資料");
		btnNewButton_1_1_1_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.addupdatePatientUI2();
				dispose();
			}
		});
		btnNewButton_1_1_1_2_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1_1_2_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1_1_2_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_2_1_1.setBounds(436, 245, 150, 40);
		contentPane.add(btnNewButton_1_1_1_2_1_1);
		
		JButton btnNewButton_1_1_1_2_1_1_1 = new JButton("查詢個人資料");
		btnNewButton_1_1_1_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.addqueryPatientUI1();
				dispose();
			}
		});
		btnNewButton_1_1_1_2_1_1_1.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1_1_2_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1_1_2_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_2_1_1_1.setBounds(439, 156, 150, 40);
		contentPane.add(btnNewButton_1_1_1_2_1_1_1);
		
		JButton btnNewButton_1_1_1_2_1_1_2 = new JButton("刪除個人資料");
		btnNewButton_1_1_1_2_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonUI.adddeletePatinetUI3();
				dispose();
			}
		});
		btnNewButton_1_1_1_2_1_1_2.setForeground(UIManager.getColor("Button.select"));
		btnNewButton_1_1_1_2_1_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton_1_1_1_2_1_1_2.setBackground(Color.WHITE);
		btnNewButton_1_1_1_2_1_1_2.setBounds(436, 341, 150, 40);
		contentPane.add(btnNewButton_1_1_1_2_1_1_2);
		
		
	}
}
