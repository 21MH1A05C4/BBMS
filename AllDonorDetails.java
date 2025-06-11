package BBM;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class AllDonorDetails extends JFrame implements ActionListener{
    JFrame f;
    JTable t;
    JLabel l1,l2;
    JButton b1,b2;
    AllDonorDetails()
    {
        f=new JFrame("All Donor Details");
        f.setBackground(Color.WHITE);
        f.setBounds(0, 0, 800, 600);
        f.setLayout(null);
        
        l1=new JLabel("All Donor Details");
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("BBM/all page background image.png"));
        Image i1=img.getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH);
        ImageIcon img2=new ImageIcon(i1);
        l1.setIcon(img2);
        f.add(l1);
        
        l2=new JLabel("All Donor Details");
        l2.setBounds(220, -30, 280, 100);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        l1.add(l2);
        
        DefaultTableModel model = new DefaultTableModel();
        t = new JTable(model);
        t.setFont(new Font("Arial",Font.PLAIN,15));
        t.setRowHeight(20);
        JTableHeader header = t.getTableHeader();
        header.setFont(new Font("Arial",Font.BOLD,15));

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Donor");

            // Get the metadata of the ResultSet to retrieve column names
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Add column names to the table model
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            // Add data to the table model
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        JScrollPane scrollPane = new JScrollPane(t);
        scrollPane.setBounds(0, 80, 700, 352);
        l1.add(scrollPane);
        
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
    }
    public void actionPerformed(ActionEvent e)
    {
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
    }
    public static void main(String args[])
    {
        new AllDonorDetails();
    }
}
