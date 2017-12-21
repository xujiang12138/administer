package com.staff.myframe;

import com.staff.Factory.InforServiceFactory;
import com.staff.model.Information;
import com.staff.panel.MyDialog;
import com.staff.panel.Style;
import com.staff.service.InforService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

/**
 * Created by asus on 2017/12/19.
 */
public class InfroPanel extends JPanel {
    private JLabel titleLabel ;
    private JLabel accountLabel ;
    private JTextField accountField ;
    private JLabel nameLabel ;
    private JTextField nameField ;
    private JLabel deparLabel ;
    private JTextField daprtField ;
    private JLabel educationLabel;
    private JComboBox educationBox;
    private JLabel genderLabel ;
    private JTextField genderField ;
    private JLabel birLabel ;
    private JTextField birField ;
    private JLabel workAge ;
    private JTextField workAgeField;
    private JLabel phoneLabel;
    private JTextField phoneField ;
    private JLabel addressLabel ;
    private JTextField addressField ;
    private JLabel entryLabel ;
    private JTextField entryField;
    private JLabel pictureLabel ;
    private JButton editButton ;
    private JButton savaButton ;
    private Information information;

    private InforService inforService = InforServiceFactory.getInforServiceInstance() ;
    private JPanel[] jPanels;
    private JPanel upPanel , centerPanel,mainPanel,rightPanel ;

    public InfroPanel(){
         information =inforService.getInfor("1602753130");
        setLayout(new BorderLayout(0,0));
        titleLabel = new JLabel();
        titleLabel.setText("        个人信息查询界面               ");
        titleLabel.setFont(new Font("楷体",Font.BOLD,30));
        JButton bjButton = new JButton("编辑");
        JButton jButton = new JButton("保存");
        Style.setButtonStyle(bjButton);
        Style.setButtonStyle(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inforService.changeInfor(information,phoneField.getText(), String.valueOf(educationBox.getSelectedItem()));
                phoneField.setEnabled(false);
                educationBox.setEnabled(false);
                new MyDialog("保存成功");
            }
        });
        bjButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                phoneField.setEnabled(true);
                educationBox.setEnabled(true);
            }
        });
        upPanel = new JPanel();
        upPanel.add(titleLabel);
        upPanel.add(bjButton);
        upPanel.add(jButton);
        upPanel.setBackground(Color.white);
        rightPanel = new JPanel();
        pictureLabel = new JLabel(new ImageIcon(information.getAvatar()));
        rightPanel.add(pictureLabel);
        rightPanel.setBackground(Color.WHITE);
        add(upPanel,BorderLayout.NORTH);
        add(getCenterPanel(),BorderLayout.CENTER);
        add(rightPanel,BorderLayout.EAST);

    }


    public JPanel getCenterPanel(){
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(5,1));
        jPanels = new JPanel[5];
        for(int i = 0;i<5;i++){
            jPanels[i] = new JPanel();
            jPanels[i].setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
            jPanels[i].setBackground(Color.white);
            centerPanel.add(jPanels[i]);
        }
        information = inforService.getInfor("1602753130");
        accountLabel = new JLabel();
        Style.setLabelStyle(accountLabel);
        accountLabel.setText("工号");
        accountField = new JTextField();
        Style.setFieldStyle(accountField);
        accountField.setText(information.getAccount());
        accountField.setEnabled(false);

        nameLabel = new JLabel();
        Style.setLabelStyle(nameLabel);
        nameLabel.setText("姓名");
        nameField = new JTextField();
        Style.setFieldStyle(nameField);
        nameField.setText(information.getName());
        nameField.setEnabled(false);
        pictureLabel = new JLabel();
        pictureLabel.setIcon(new ImageIcon(information.getAvatar()));
        jPanels[0].add(accountLabel);
        jPanels[0].add(accountField);
        jPanels[0].add(nameLabel);
        jPanels[0].add(nameField);


        deparLabel = new JLabel();
        Style.setLabelStyle(deparLabel);
        deparLabel.setText("部门");
        daprtField = new JTextField();
        Style.setFieldStyle(daprtField);
        if(information.getDepartmentID() == 1){
            daprtField.setText("人事部");
            daprtField.setEnabled(false);
        }else{
            daprtField.setText("财务部");
            daprtField.setEnabled(false);
        }
        educationLabel = new JLabel();
        Style.setLabelStyle(educationLabel);
        educationLabel.setText("学历");
        String str1[]={"初中","高中","大专","大学","博士"};
        educationBox = new JComboBox(str1);
        Style.setFieldStyle(educationBox);
        educationBox.setSelectedItem(information.getEducation());

        educationBox.setEnabled(false);

        jPanels[1].add(deparLabel);
        jPanels[1].add(daprtField);
        jPanels[1].add(educationLabel);
        jPanels[1].add(educationBox);

        genderLabel = new JLabel();
        Style.setLabelStyle(genderLabel);
        genderLabel.setText("性别");
        genderField = new JTextField();
        Style.setFieldStyle(genderField);
        genderField.setText(information.getGender());
        genderField.setEnabled(false);
        birLabel = new JLabel();
        Style.setLabelStyle(birLabel);
        birLabel.setText("出生日期");
        birField = new JTextField();
        Style.setFieldStyle(birField);
        birField.setText(String.valueOf(information.getBirthday()));
        birField.setEnabled(false);
        jPanels[2].add(genderLabel);
        jPanels[2].add(genderField);
        jPanels[2].add(birLabel);
        jPanels[2].add(birField);

        workAge = new JLabel();
        Style.setLabelStyle(workAge);
        workAge.setText("工龄");
        workAgeField = new JTextField();
        Style.setFieldStyle(workAgeField);
        int n = 0 ;
        LocalDate localDate = LocalDate.now();
        n =  (localDate.getYear()) -information.getEntryTime().getYear()-1900;
        workAgeField.setText(String.valueOf(n));
        workAgeField.setEnabled(false);
        phoneLabel = new JLabel();
        Style.setLabelStyle(phoneLabel);
        phoneLabel.setText("电话号码");
        phoneField = new JTextField();
        Style.setFieldStyle(phoneField);
        phoneField.setText(information.getTelephone());
        phoneField.setEnabled(false);
        jPanels[3].add(workAge);
        jPanels[3].add(workAgeField);
        jPanels[3].add(phoneLabel);
        jPanels[3].add(phoneField);

        entryLabel = new JLabel();
        Style.setLabelStyle(entryLabel);
        entryLabel.setText("入部时间");
        entryField = new JTextField();
        Style.setFieldStyle(entryField);
        entryField.setText(String.valueOf(information.getEntryTime()));
        entryField.setEnabled(false);
        addressField = new JTextField();
        Style.setFieldStyle(addressField);
        addressField.setText(information.getAddress());
        addressLabel = new JLabel();
        addressField.setEnabled(false);
        addressLabel = new JLabel();
        Style.setLabelStyle(addressLabel);
        addressLabel.setText("籍贯");
        jPanels[4].add(entryLabel);
        jPanels[4].add(entryField);
        jPanels[4].add(addressLabel);
        jPanels[4].add(addressField);

        return centerPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("测试窗体");
        frame.setSize(890, 600);
        frame.setLocationRelativeTo(null);
        frame.add(new InfroPanel());

        frame.setVisible(true);
    }
}
