package BBM;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JMenuBar MenuBar;
    JMenuItem AddNewDonor,UpdateDetails,AllDonorDetails,Location,BloodGroup,Increase,Decrease,Details,DeleteDonor,LogOut,ExitApplication;
    Home()
    {
        f=new JFrame("Home Page");
        f.setBackground(Color.WHITE);
        f.setBounds(0, 0, 700, 500);
        f.setLayout(null);
        
        l1=new JLabel();
        l2=new JLabel();
        l1.setBounds(0, 0, 1366, 768);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("BBM/home.PNG"));
        Image i1=img.getImage().getScaledInstance(1400, 768, Image.SCALE_SMOOTH);
        ImageIcon img2=new ImageIcon(i1);
        //Inserting Image to Label1
        l1.setIcon(img2);
        f.add(l1);
        
        MenuBar=new JMenuBar();
        MenuBar.setBounds(0, 0, 100, 30);
        l2.add(MenuBar);
        l2.setBounds(0, 0, 300, 20);
        
        JMenu Donor=new JMenu();
        Donor.setText("Donor");
        Donor.setFont(new Font("Arial",Font.BOLD,15));
        Donor.setBounds(-50, 0, 300, 20);
        Donor.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Donor.png"));
        JMenu Search_Blood_Group=new JMenu();
        Search_Blood_Group.setText("Search Blood Group");
        Search_Blood_Group.setFont(new Font("Arial",Font.BOLD,15));
        Search_Blood_Group.setIcon(new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\search user.png"));
        JMenu Stock=new JMenu("Stock");
        Stock.setFont(new Font("Arial",Font.BOLD,15));
        Stock.setIcon(new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\stock.png"));
        JMenu Delete_Donor=new JMenu("Delete Donor");
        Delete_Donor.setFont(new Font("Arial",Font.BOLD,15));
        Delete_Donor.setIcon(new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\delete donor.png"));
        JMenu Exit=new JMenu("Exit");
        Exit.setFont(new Font("Arial",Font.BOLD,15));
        Exit.setIcon(new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\exit.png"));
        
        f.setJMenuBar(MenuBar);
        MenuBar.add(Donor);
        MenuBar.add(Search_Blood_Group);
        MenuBar.add(Stock);
        MenuBar.add(Delete_Donor);
        MenuBar.add(Exit);
        //MenuBar.setFont(new Font("Arial",Font.BOLD,20));
        
        AddNewDonor=new JMenuItem("Add New Donor",new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Add new.png"));
        UpdateDetails=new JMenuItem("Update Details",new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Update details.png"));
        AllDonorDetails=new JMenuItem("All Donor Details",new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Details.png"));
        Location=new JMenuItem("Location",new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Address.png"));
        BloodGroup=new JMenuItem("Blood Group",new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Blood group.png"));
        Increase=new JMenuItem("Increase",new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Inc.png"));
        Decrease=new JMenuItem("Decrease",new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Dec.png"));
        Details=new JMenuItem("Details",new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Details.png"));
        DeleteDonor=new JMenuItem("Delete Donor",new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\delete.png"));
        LogOut=new JMenuItem("LogOut",new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Logout.png"));
        ExitApplication=new JMenuItem("Exit Application",new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Exit application.png"));
        AddNewDonor.setFont(new Font("Arial",Font.BOLD,13));
        UpdateDetails.setFont(new Font("Arial",Font.BOLD,13));
        Location.setFont(new Font("Arial",Font.BOLD,13));
        BloodGroup.setFont(new Font("Arial",Font.BOLD,13));
        Increase.setFont(new Font("Arial",Font.BOLD,13));
        Decrease.setFont(new Font("Arial",Font.BOLD,13));
        DeleteDonor.setFont(new Font("Arial",Font.BOLD,13));
        LogOut.setFont(new Font("Arial",Font.BOLD,13));
        ExitApplication.setFont(new Font("Arial",Font.BOLD,13));
        AllDonorDetails.setFont(new Font("Arial",Font.BOLD,13));
        Details.setFont(new Font("Arial",Font.BOLD,13));
        
        
        Donor.add(AddNewDonor);
        Donor.addSeparator();
        Donor.add(UpdateDetails);
        Donor.addSeparator();
        Donor.add(AllDonorDetails);
        Search_Blood_Group.add(Location);
        Search_Blood_Group.addSeparator();
        Search_Blood_Group.add(BloodGroup);
        Stock.add(Increase);
        Stock.addSeparator();
        Stock.add(Decrease);
        Stock.addSeparator();
        Stock.add(Details);
        Delete_Donor.add(DeleteDonor);
        Exit.add(LogOut);
        Exit.addSeparator();
        Exit.add(ExitApplication);
        
        f.setVisible(true);
        f.setSize(1366, 863);
        f.setLocation(300, 100);
        ExitApplication.addActionListener(this);
        LogOut.addActionListener(this);
        AddNewDonor.addActionListener(this);
        UpdateDetails.addActionListener(this);
        AllDonorDetails.addActionListener(this);
        Location.addActionListener(this);
        BloodGroup.addActionListener(this);
        Increase.addActionListener(this);
        Decrease.addActionListener(this);
        Details.addActionListener(this);
        DeleteDonor.addActionListener(this);
    }
    
    //@Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==ExitApplication)
        {
            int a=JOptionPane.showConfirmDialog(null, "Do you really want to Exit Application", "Select", JOptionPane.YES_NO_OPTION);
            if(a==0)
            {
                System.exit(0);
            }
        }
        if(e.getSource()==LogOut)
        {
            int a=JOptionPane.showConfirmDialog(null,"Do you really want to Logout","Select",JOptionPane.YES_NO_OPTION);
            if(a==0)
            {
                f.setVisible(false);
                new Login();
            }
        }
        if(e.getSource()==AddNewDonor)
        {
            f.setVisible(false);
            new AddNewDonor();
        }
        if(e.getSource()==UpdateDetails)
        {
            f.setVisible(false);
            new UpdateDetails();
        }
        if(e.getSource()==AllDonorDetails)
        {
            f.setVisible(false);
            new AllDonorDetails();
        }
        if(e.getSource()==Location)
        {
            f.setVisible(false);
            new Location();
        }
        if(e.getSource()==BloodGroup)
        {
            f.setVisible(false);
            new BloodGroup();
        }
        if(e.getSource()==Increase)
        {
            f.setVisible(false);
            new Increase();
        }
        if(e.getSource()==Decrease)
        {
            f.setVisible(false);
            new Decrease();
        }
        if(e.getSource()==Details)
        {
            f.setVisible(false);
            new Details();
        }
        if(e.getSource()==DeleteDonor)
        {
            f.setVisible(false);
            new DeleteDonor();
        }
    }
    public static void main(String args[])
    {
        new Home();
    }
}
