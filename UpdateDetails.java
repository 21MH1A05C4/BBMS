package BBM;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class UpdateDetails extends JFrame implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JButton b1,b2,b3,b4;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
    JTextArea ta1;
    UpdateDetails()
    {
        f=new JFrame("Update Details");
        f.setBackground(Color.WHITE);
        f.setBounds(0, 0, 800, 600);
        f.setLayout(null);
        
        l1=new JLabel();
        l1.setBounds(0, 0, 700, 500);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("BBM/all page background image.png"));
        Image i1=img.getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH);
        ImageIcon img2=new ImageIcon(i1);
        l1.setIcon(img2);
        f.add(l1);
        
        l2=new JLabel("Update Donor Details");
        l2.setBounds(190, -30, 400, 100);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        l1.add(l2);
                
        l3=new JLabel("Donor Id");
        l3.setBounds(160, 80, 150, 20);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l3);
        
        tf8=new JTextField();
        tf8.setBounds(250, 80, 150, 25);
        tf8.setFont(new Font("Arial",Font.BOLD,15));
        tf8.setForeground(Color.BLACK);
        tf8.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(tf8);
        
        ImageIcon icon4=new ImageIcon("C:\\Users\\KRISHNA\\Desktop\\Internship\\BloodBankManagementSystem(2)\\src\\search1.png");
        b4=new JButton("Search",icon4);
        b4.setBackground(Color.white);
        b4.setForeground(Color.black);
        b4.setBounds(420, 80, 90, 26);
        b4.setFont(new Font("Arial",Font.BOLD,15));
        b4.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(b4);
        
        l4=new JLabel("Full Name");
        l4.setBounds(20, 140, 150, 20);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l4);
        
        tf1=new JTextField();
        tf1.setBounds(150, 140, 190, 25);
        tf1.setFont(new Font("Arial",Font.BOLD,15));
        tf1.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(tf1);
        
        l5=new JLabel("Date Of Birth");
        l5.setBounds(20, 200, 150, 20);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l5);
        
        tf2=new JTextField();
        tf2.setBounds(150, 200, 190, 25);
        tf2.setFont(new Font("Arial",Font.BOLD,15));
        tf2.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(tf2);
        
        l6=new JLabel("Gender");
        l6.setBounds(20, 270, 150, 20);
        l6.setForeground(Color.BLACK);
        l6.setBackground(Color.WHITE);
        l6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l6);
        
        tf3=new JTextField();
        tf3.setBounds(150, 270, 190, 25);
        tf3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        tf3.setBorder(BorderFactory.createLineBorder(Color.black));
        tf3.setBackground(Color.WHITE);
        l1.add(tf3);
        
        l7=new JLabel("Mobile No.");
        l7.setBounds(20, 340, 150, 20);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l7);
        
        tf4=new JTextField();
        tf4.setBounds(150, 340, 190, 25);
        tf4.setFont(new Font("Arial",Font.BOLD,15));
        tf4.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(tf4);
        
        l8=new JLabel("Email");
        l8.setBounds(370, 140, 150, 20);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l8);
        
        tf5=new JTextField();
        tf5.setBounds(480, 140, 190, 25);
        tf5.setFont(new Font("Arial",Font.BOLD,15));
        tf5.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(tf5);
        
        l9=new JLabel("Blood Group");
        l9.setBounds(370, 200, 150, 20);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l9);
        
        tf6=new JTextField();
        tf6.setBounds(480, 200, 190, 25);
        tf6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        tf6.setBorder(BorderFactory.createLineBorder(Color.black));
        tf6.setBackground(Color.WHITE);
        l1.add(tf6);
        
        l10=new JLabel("City");
        l10.setBounds(370, 270, 150, 20);
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l10);
        
        tf7=new JTextField();
        tf7.setBounds(480, 270, 190, 25);
        tf7.setFont(new Font("Arial",Font.BOLD,15));
        tf7.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(tf7);
        
        l11=new JLabel("Address");
        l11.setBounds(370, 340, 150, 20);
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l11);
        
        ta1=new JTextArea();
        ta1.setBounds(480, 340, 190, 70);
        ta1.setFont(new Font("Arial",Font.BOLD,15));
        ta1.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(ta1);
        
        ImageIcon icon1=new ImageIcon("C:\\Users\\KRISHNA\\Desktop\\Internship\\BloodBankManagementSystem(2)\\src\\save.png");
        b1=new JButton("Save",icon1);
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.setBounds(20, 437, 90, 30);
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(b1);
        
        ImageIcon icon2=new ImageIcon("C:\\Users\\KRISHNA\\Desktop\\Internship\\BloodBankManagementSystem(2)\\src\\Update details.png");
        b2=new JButton("Reset",icon2);
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.setBounds(305, 437, 90, 30);
        b2.setFont(new Font("Arial",Font.BOLD,15));
        b2.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(b2);
        
        ImageIcon icon3=new ImageIcon("C:\\Users\\KRISHNA\\Desktop\\Internship\\BloodBankManagementSystem(2)\\src\\Exit application.png");
        b3=new JButton("Close",icon3);
        b3.setBackground(Color.white);
        b3.setForeground(Color.black);
        b3.setBounds(580, 437, 90, 30);
        b3.setFont(new Font("Arial",Font.BOLD,15));
        b3.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(b3);
        
        f.setSize(710, 530);
        f.setLocation(300, 100);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String DonorId=tf8.getText();
            String Name=tf1.getText();
            String DOB=tf2.getText();
            String Gender=tf3.getText();
            String MobileNo=tf4.getText();
            String Email=tf5.getText();
            String BloodGroup=tf6.getText();
            String City=tf7.getText();
            String Address=ta1.getText();
            try
            {
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("update Donor set Name='"+Name+"',DOB='"+DOB+"',Gender='"+Gender+"',MobileNo='"+MobileNo+"',Email='"+Email+"',BloodGroup='"+BloodGroup+"',City='"+City+"',Address='"+Address+"' where DonorId='"+DonorId+"'");
                JOptionPane.showMessageDialog(null, "Updated Succesfully...!");
                f.setVisible(false);
                new UpdateDetails();
            }
            catch(Exception evt)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(e.getSource()==b2)
        {
            f.setVisible(false);
            new UpdateDetails();
        }
        if(e.getSource()==b3)
        {
            int a=JOptionPane.showConfirmDialog(null,"Do you really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
            if(a==0)
            {
                f.setVisible(false);
                new Home();
            }
        }
        if(e.getSource()==b4)
        {
            String DonorId=tf8.getText();
            try
            {
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from Donor where DonorId='"+DonorId+"'");
                if(rs.next())
                {
                    tf1.setText(rs.getString(2));
                    tf2.setText(rs.getString(3));
                    tf3.setText(rs.getString(4));
                    tf4.setText(rs.getString(5));
                    tf5.setText(rs.getString(6));
                    tf6.setText(rs.getString(7));
                    tf7.setText(rs.getString(8));
                    ta1.setText(rs.getString(9));
                    tf8.setEditable(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "DonorId doesn't Exist..!");
                }
            }
            catch(Exception evt)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    public static void main(String args[])
    {
        new UpdateDetails();
    }
}
