package BBM;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;

public class AddNewDonor extends JFrame implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JButton b1,b2,b3;
    JTextField tf1,tf2,tf3,tf4,tf5;
    JTextArea ta1;
    JDateChooser dc;
    JComboBox cb1,cb2;
    AddNewDonor()
    {
        f=new JFrame("Add New Donor Page");
        f.setBackground(Color.WHITE);
        f.setBounds(0, 0, 700, 500);
        f.setLayout(null);
        
        l1=new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("BBM/all page background image.png"));
        Image i1=img.getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH);
        ImageIcon img2=new ImageIcon(i1);
        l1.setIcon(img2);
        f.add(l1);
        
        l2=new JLabel("Add New Donor");
        l2.setBounds(230, -30, 400, 100);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        l1.add(l2);
                
        l3=new JLabel("New Donor Id");
        l3.setBounds(20, 90, 150, 20);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l3);
        
        l12=new JLabel();
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select max(DonorId) from Donor");
            if(!rs.next())
            {
                l12.setText("1");
            }
            else
            {
                int id=rs.getInt(1);
                id=id+1;
                l12.setText(Integer.toString(id));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        //l12.setEditable(false);
        l12.setBounds(140, 87, 190, 25);
        l12.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        l12.setForeground(Color.RED);
        l1.add(l12);
        
        l4=new JLabel("Full Name");
        l4.setBounds(20, 160, 150, 20);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l4);
        
        tf1=new JTextField();
        tf1.setBounds(140, 160, 190, 25);
        tf1.setFont(new Font("Arial",Font.BOLD,15));
        tf1.setBorder(BorderFactory.createLineBorder(Color.black));
        tf1.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(tf1);
        
        l5=new JLabel("Date Of Birth");
        l5.setBounds(20, 235, 150, 20);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l5);
        
        dc=new JDateChooser();
        dc.setBounds(140, 235, 190, 25);
        dc.setForeground(Color.BLACK);
        dc.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(dc);
        
        l6=new JLabel("Gender");
        l6.setBounds(20, 310, 150, 20);
        l6.setForeground(Color.BLACK);
        l6.setBackground(Color.WHITE);
        l6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l6);
        
        cb1=new JComboBox();
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "Male", "Female", "Others" }));
        cb1.setBounds(140, 310, 190, 25);
        cb1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        cb1.setBackground(Color.WHITE);
        l1.add(cb1);
        
        l7=new JLabel("Mobile No.");
        l7.setBounds(20, 385, 150, 20);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l7);
        
        tf2=new JTextField();
        tf2.setBounds(140, 385, 190, 25);
        tf2.setFont(new Font("Arial",Font.BOLD,15));
        tf2.setBorder(BorderFactory.createLineBorder(Color.black));
        tf2.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(tf2);
        
        l8=new JLabel("Email");
        l8.setBounds(370, 90, 150, 20);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l8);
        
        tf3=new JTextField();
        tf3.setBounds(480, 90, 190, 25);
        tf3.setFont(new Font("Arial",Font.BOLD,15));
        tf3.setBorder(BorderFactory.createLineBorder(Color.black));
        tf3.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(tf3);
        
        l9=new JLabel("Blood Group");
        l9.setBounds(370, 160, 150, 20);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l9);
        
        cb2=new JComboBox();
        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "A+","B+","AB+","O+","A-","B-","AB-","O-"}));
        cb2.setBounds(480, 160, 190, 25);
        cb2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        cb2.setBackground(Color.WHITE);
        l1.add(cb2);
        
        l10=new JLabel("City");
        l10.setBounds(370, 235, 150, 20);
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l10);
        
        tf4=new JTextField();
        tf4.setBounds(480, 235, 190, 25);
        tf4.setFont(new Font("Arial",Font.BOLD,15));
        tf4.setBorder(BorderFactory.createLineBorder(Color.black));
        tf4.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(tf4);
        
        l11=new JLabel("Address");
        l11.setBounds(370, 310, 150, 20);
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        l1.add(l11);
        
        ta1=new JTextArea();
        ta1.setBounds(480, 310, 190, 100);
        ta1.setFont(new Font("Arial",Font.BOLD,15));
        ta1.setBorder(BorderFactory.createLineBorder(Color.black));
        ta1.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(ta1);
        
        ImageIcon icon1=new ImageIcon("C:\\Users\\KRISHNA\\Desktop\\Internship\\BloodBankManagementSystem(2)\\src\\save.png");
        b1=new JButton("Save",icon1);
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.setBounds(25, 437, 90, 30);
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setBorder(BorderFactory.createLineBorder(Color.black));
        l1.add(b1);
        
        ImageIcon icon2=new ImageIcon("C:\\Users\\KRISHNA\\Desktop\\Internship\\BloodBankManagementSystem(2)\\src\\Update details.png");
        b2=new JButton("Reset",icon2);
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.setBounds(315, 437, 90, 30);
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
        b3.addActionListener(this);
        b2.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String DonorId=l12.getText();
            String Name=tf1.getText();
            SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
            String DOB=df.format(dc.getDate());
            String Gender=(String)cb1.getSelectedItem();
            String MobileNo=tf2.getText();
            String Email=tf3.getText();
            String BloodGroup=(String)cb2.getSelectedItem();
            String City=tf4.getText();
            String Address=ta1.getText();
            try
            {
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("insert into Donor values('"+DonorId+"','"+Name+"','"+DOB+"','"+Gender+"','"+MobileNo+"','"+Email+"','"+BloodGroup+"','"+City+"','"+Address+"')");
                f.setVisible(false);
                new AddNewDonor();
            }
            catch(Exception evt)
            {
                JOptionPane.showMessageDialog(null, e);
            }
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
        if(e.getSource()==b2)
        {
            f.setVisible(false);
            new AddNewDonor();
        }
    }
    public static void main(String args[])
    {
        new AddNewDonor();
    }
}