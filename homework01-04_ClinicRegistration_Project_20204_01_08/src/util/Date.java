package util;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.lang.*;

public class Date extends JDialog implements ActionListener {
    private JPanel mPanel1 = new JPanel();
    private JPanel mPanel2 = new JPanel();
    private JPanel mPanel3 = new JPanel();
    private JPanel mPanel4 = new JPanel();
    private JButton mNewButton;
    private JTextField mText;
    private int mDay;
    private int mMonth;
    private int mYear;
    private int mTheDate;
    private int i = 0;
    private int j = 0;
  
   

    
    	
    
    
    public Date(JTextField pText) {
        super(new JFrame(), "日期選擇", true);
        this.mText = pText;
        try {
            DatePopupInit();
            pack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 控件的初始化方法。
     */
    private void DatePopupInit() {
        // 設置主窗口佈局
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        mPanel1.setLayout(new BorderLayout());
        mPanel1.setBorder(new TitledBorder(BorderFactory.createLineBorder(Color.white, 1), "日期選擇"));

        Calendar nowCalendar = Calendar.getInstance();
        this.mTheDate = nowCalendar.get(Calendar.DAY_OF_WEEK);
        this.mDay = nowCalendar.get(Calendar.DAY_OF_MONTH);
        this.mMonth = nowCalendar.get(Calendar.MONTH);
        this.mYear = nowCalendar.get(Calendar.YEAR);

        // 設置mPanel2
        JComboBox<String> comboMonth = new JComboBox<>();
        comboMonth.setActionCommand("MonthSelect");
        for (i = 1; i <= 12; i++) {
            comboMonth.addItem(i + "月");
            if (i == (this.mMonth + 1)) {
                comboMonth.setSelectedItem(i + "月");
            }
        }
        comboMonth.addActionListener(this);

        JComboBox<String> comboYear = new JComboBox<>();
        comboYear.setActionCommand("YearSelect");
        for (i = 1900; i <= 2050; i++) {
            comboYear.addItem(i + "年");
            if (i == this.mYear) {
                comboYear.setSelectedItem(i + "年");
            }
        }
        comboYear.addActionListener(this);
        mPanel2.setLayout(new FlowLayout());
        mPanel2.add(comboMonth);
        mPanel2.add(comboYear);
        mPanel1.add(mPanel2, BorderLayout.NORTH);

        // 設置mPanel3
        mPanel3.setLayout(new GridLayout(7, 7));
        mPanel3.add(new JLabel("日", SwingConstants.CENTER));
        mPanel3.add(new JLabel("一", SwingConstants.CENTER));
        mPanel3.add(new JLabel("二", SwingConstants.CENTER));
        mPanel3.add(new JLabel("三", SwingConstants.CENTER));
        mPanel3.add(new JLabel("四", SwingConstants.CENTER));
        mPanel3.add(new JLabel("五", SwingConstants.CENTER));
        mPanel3.add(new JLabel("六", SwingConstants.CENTER));
        mPanel1.add(mPanel3, BorderLayout.CENTER);

        // 設置mPanel4
        JButton confirmButton = new JButton("確定");
        confirmButton.setActionCommand("confirm");
        confirmButton.addActionListener(this);
        JButton cancelButton = new JButton("取消");
        cancelButton.setActionCommand("cancel");
        cancelButton.addActionListener(this);
        mPanel4.setLayout(new FlowLayout());
        mPanel4.add(confirmButton);
        mPanel4.add(cancelButton);

        // 設置contentpane
        contentPane.add(mPanel1, BorderLayout.CENTER);
        contentPane.add(mPanel4, BorderLayout.SOUTH);

        // 初始化日期選擇
        updateCalendar();
    }

    /**
     * 監聽事件響應。
     */
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        Object obj = e.getSource();
        String temp = "";
        if (cmd.equals("MonthSelect")) {
            JComboBox<?> comMonth = (JComboBox<?>) obj;
            temp = comMonth.getSelectedItem().toString();
            temp = temp.substring(0, temp.length() - 1);
            int tempMonth = Integer.parseInt(temp);
            this.mMonth = tempMonth - 1;
            updateCalendar();
        } else if (cmd.equals("YearSelect")) {
            JComboBox<?> comYear = (JComboBox<?>) obj;
            temp = comYear.getSelectedItem().toString();
            temp = temp.substring(0, 4);
            int tempYear = Integer.parseInt(temp);
            this.mYear = tempYear;
            updateCalendar();
        } else if (cmd.equals("confirm")) {
            String pFinalDate = String.format("%04d-%02d-%02d", this.mYear, this.mMonth + 1, this.mDay);
            this.mText.setText(pFinalDate);
            this.dispose();
        } else if (cmd.equals("cancel")) {
            this.dispose();
        } else {
            int tempDay = Integer.parseInt(cmd);
            this.mDay = tempDay;
            updateCalendar();
        }
    }

    /**
     * 控件重新佈局方法。
     */
    private void updateCalendar() {
        this.invalidate();
        mPanel3.removeAll();
        mPanel3.setLayout(new GridLayout(7, 7));
        mPanel3.add(new JLabel("日", SwingConstants.CENTER));
        mPanel3.add(new JLabel("一", SwingConstants.CENTER));
        mPanel3.add(new JLabel("二", SwingConstants.CENTER));
        mPanel3.add(new JLabel("三", SwingConstants.CENTER));
        mPanel3.add(new JLabel("四", SwingConstants.CENTER));
        mPanel3.add(new JLabel("五", SwingConstants.CENTER));
        mPanel3.add(new JLabel("六", SwingConstants.CENTER));

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(this.mYear, this.mMonth + 1, 1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(this.mYear, this.mMonth, 1);
        int daysOfMonth;
        if (this.mMonth == 11) {
            daysOfMonth = 31;
        } else {
            daysOfMonth = calendar1.get(Calendar.DAY_OF_YEAR) - calendar2.get(Calendar.DAY_OF_YEAR);
        }
        int firstDay = calendar2.get(Calendar.DAY_OF_WEEK);
        j = 0;
        for (i = 1; i < 43; i++) {
            if (((i == firstDay) || (j != 0)) && (j < daysOfMonth)) {
                j++;
                mNewButton = new JButton((new String()).valueOf(j));
                if (!isSelectableDay(j)) {
                    mNewButton.setEnabled(false);
                    mNewButton.setBackground(Color.LIGHT_GRAY);
                } else {
                    mNewButton.addActionListener(this);
                }

                if (j == this.mDay) {
                    mNewButton.setSelected(true);
                    mNewButton.setBackground(new Color(84, 215, 4));
                }

                mPanel3.add(mNewButton);
            } else {
                mPanel3.add(new JLabel());
            }
        }

        mPanel1.add(mPanel3, BorderLayout.CENTER);
        this.validate();
    }

    /**
     * 判斷日期是否可選擇
     */
    private boolean isSelectableDay(int day) {
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);
        today.set(Calendar.MILLISECOND, 0);

        Calendar selectedDay = Calendar.getInstance();
        selectedDay.set(this.mYear, this.mMonth, day);
        selectedDay.set(Calendar.HOUR_OF_DAY, 0);
        selectedDay.set(Calendar.MINUTE, 0);
        selectedDay.set(Calendar.SECOND, 0);
        selectedDay.set(Calendar.MILLISECOND, 0);

        // 只能選擇今天往後加七天的日期，其他日期不能選擇
        Calendar lastSelectableDay = (Calendar) today.clone();
        lastSelectableDay.add(Calendar.DAY_OF_MONTH, 6);  //這裡修改今天+預留的天數

        if (selectedDay.before(today) || selectedDay.after(lastSelectableDay)) {
            return false;
        }

        return true;
    }

    /**
     * 顯示日期視窗
     */
    public void showDialog() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int) (screenSize.getWidth() - getWidth()) / 2, (int) (screenSize.getHeight() - getHeight()) / 2);
        setVisible(true);
    }
}
