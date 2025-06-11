package BBM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.*;

public class Decrease extends JFrame implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JComboBox cb1;
    JTextField tf1;
    JButton b1,b2,b3;
    JTable t;
    Decrease()
    {
        f=new JFrame("Location");
        f.setBackground(Color.WHITE);
        f.setBounds(0, 0, 800, 600);
        f.setLayout(null);
        
        l1=new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("BBM/all page background image.png"));
        Image i1=img.getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH);
        ImageIcon img2=new ImageIcon(i1);
        l1.setIcon(img2);
        f.add(l1);
        
        l2=new JLabel("Stock Decrease");
        l2.setBounds(230, -30, 450, 100);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        l1.add(l2);
        
        l3=new JLabel("Donor Id");
        l3.setBounds(50, 60, 150, 20);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l3);
        
        cb1=new JComboBox();
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---", "A+","B+","AB+","O+","A-","B-","AB-","O-"}));
        cb1.setBounds(150, 60, 130, 25);
        cb1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        cb1.setBackground(Color.WHITE);
        l1.add(cb1);
        
        l4=new JLabel("No.of Units:");
        l4.setBounds(300, 62, 150, 20);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l4);
        
        tf1=new JTextField();
        tf1.setBounds(400, 60, 120, 25);
        tf1.setFont(new Font("Arial",Font.BOLD,15));
        tf1.setForeground(Color.BLACK);
        tf1.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(tf1);
        
        ImageIcon icon4=new ImageIcon("C:\\Users\\KRISHNA\\Desktop\\Internship\\BloodBankManagementSystem(2)\\src\\Dec.png");
        b3=new JButton("Update",icon4);
        b3.setBackground(Color.white);
        b3.setForeground(Color.black);
        b3.setBounds(550, 60, 90, 26);
        b3.setFont(new Font("Arial",Font.BOLD,15));
        b3.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(b3);
        
        DefaultTableModel model=new DefaultTableModel();
        t=new JTable(model);
        t.setFont(new Font("Arial",Font.PLAIN,15));
        t.setRowHeight(20);
        JTableHeader header = t.getTableHeader();
        header.setFont(new Font("Arial",Font.BOLD,15));
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Stock");
            ResultSetMetaData md=rs.getMetaData();
            int columnCount=md.getColumnCount();
            for(int i=1;i<=columnCount;i++)
            {
                model.addColumn(md.getColumnName(i));
            }
            while(rs.next())
            {
                Object[] row=new Object[columnCount];
                for(int i=1;i<=columnCount;i++)
                {
                    row[i-1]=rs.getObject(i);
                }
                model.addRow(row);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        JScrollPane sp=new JScrollPane(t);
        sp.setBounds(100,150,500,200);
        l1.add(sp);
        
        ImageIcon icon1=new ImageIcon("C:\\Users\\KRISHNA\\Desktop\\Internship\\BloodBankManagementSystem(2)\\src\\print.png");
        b1=new JButton("Print",icon1);
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.setBounds(100, 437, 90, 30);
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(b1);
        
        ImageIcon icon3=new ImageIcon("C:\\Users\\KRISHNA\\Desktop\\Internship\\BloodBankManagementSystem(2)\\src\\Exit application.png");
        b2=new JButton("Close",icon3);
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.setBounds(500, 437, 90, 30);
        b2.setFont(new Font("Arial",Font.BOLD,15));
        b2.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(b2);
        
        f.setSize(710, 530);
        f.setLocation(300, 100);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
        {
            try{
                t.print(JTable.PrintMode.NORMAL);
            }
            catch(Exception evt){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(e.getSource()==b2)
        {
            int a=JOptionPane.showConfirmDialog(null,"Do you really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
            if(a==0)
            {
                f.setVisible(false);
                new Home();
            }
        }
        if(e.getSource()==b3)
        {
            String BloodGroup=(String)cb1.getSelectedItem();
            String Units=tf1.getText();
            int unit1=Integer.parseInt(Units);
            try
            {
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("update stock set Units=Units-'"+unit1+"' where BloodGroup='"+BloodGroup+"'");
                JOptionPane.showMessageDialog(null, "Updated Succesfully");
                f.setVisible(false);
                new Decrease();
            }
            catch(Exception evt)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }
    public static void main(String args[])
    {
        new Decrease();
    }
}
