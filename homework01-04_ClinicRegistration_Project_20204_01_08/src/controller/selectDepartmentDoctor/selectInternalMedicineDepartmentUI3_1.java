package controller.selectDepartmentDoctor;

import java.awt.EventQueue;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.departmentDaoimpl;
import model.departments;
import util.Date;
import util.buttonUI;
import util.DataInMysql;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.Insets;





public class selectInternalMedicineDepartmentUI3_1 extends JFrame {

    private departments registrationData;

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JRadioButton aa2;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private final ButtonGroup buttonGroup_1 = new ButtonGroup();
    private String selectedDepartment;
    private String selectedDoctor;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    selectInternalMedicineDepartmentUI3_1 frame = new selectInternalMedicineDepartmentUI3_1();
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
    public selectInternalMedicineDepartmentUI3_1() {
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

        JLabel lblNewLabel = new JLabel("3. 請選擇一般內科醫師");
        lblNewLabel.setForeground(new Color(95, 158, 160));
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        lblNewLabel.setBackground(Color.WHITE);
        lblNewLabel.setBounds(289, 105, 222, 50);
        contentPane.add(lblNewLabel);

        JRadioButton aa_1 = new JRadioButton("   蕭政霖醫師");
        buttonGroup_1.add(aa_1);
        aa_1.setForeground(new Color(95, 158, 160));
        aa_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        aa_1.setBackground(Color.WHITE);
        aa_1.setBounds(124, 419, 168, 23);
        contentPane.add(aa_1);

        JRadioButton aa_2 = new JRadioButton("   任佑松醫師");
        buttonGroup_1.add(aa_2);
        aa_2.setForeground(new Color(95, 158, 160));
        aa_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        aa_2.setBackground(Color.WHITE);
        aa_2.setBounds(502, 419, 168, 23);
        contentPane.add(aa_2);

        JButton btnNewButton_1_1 = new JButton("確認");
        btnNewButton_1_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (aa_1.isSelected()) { DataInMysql.setSelectedData(DataInMysql.selectedId_card,"一般內科", "蕭政霖醫師", null,null,null);} 
                else if (aa_2.isSelected()) {DataInMysql.setSelectedData(DataInMysql.selectedId_card,"一般內科", "任佑松醫師", null,null,null);}
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
        pic01.setIcon(new ImageIcon(selectInternalMedicineDepartmentUI3_1.class.getResource("/images/01.png")));
        pic01.setBackground(Color.WHITE);
        pic01.setBounds(113, 191, 200,200 );
        contentPane.add(pic01);
        
        JLabel pic01_1 = new JLabel("");
        pic01_1.setBackground(Color.WHITE);
        pic01_1.setIcon(new ImageIcon(selectInternalMedicineDepartmentUI3_1.class.getResource("/images/02.png")));
        pic01_1.setBounds(486, 191, 200, 200);
        contentPane.add(pic01_1);
        
        JTextArea txtrBc = new JTextArea();
        txtrBc.setRows(1);
        txtrBc.setForeground(Color.GRAY);
        txtrBc.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        txtrBc.setLineWrap(true); 
        txtrBc.setWrapStyleWord(true); 
        txtrBc.setText("專長：\n\nB型及C型肝炎最新治療、肝癌最新治療、消化道潰瘍、胃食道逆流、一般常見內科疾病。");
        txtrBc.setBounds(123, 484, 222, 130);
        contentPane.add(txtrBc);
        
        JTextArea txtrBc_1 = new JTextArea();
        txtrBc_1.setWrapStyleWord(true);
        txtrBc_1.setText("專長：\n\n一般內科學、三高治療、心律不整、冠狀動脈疾病、心臟超音波、心導管介入性治療。");
        txtrBc_1.setRows(1);
        txtrBc_1.setLineWrap(true);
        txtrBc_1.setForeground(Color.GRAY);
        txtrBc_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        txtrBc_1.setBounds(502, 484, 222, 130);
        contentPane.add(txtrBc_1);

    }
}
