package BBM;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Function
public class Login extends JFrame implements ActionListener{
    //Declarations
    JLabel l1,l2,l3;
    JButton b1,b2;
    JTextField tf;
    JPasswordField pf;
    JFrame f;
    
    Login(){
        //Frame Creation
        f=new JFrame("Login Page");
        f.setBackground(Color.WHITE);
        f.setBounds(0, 0, 700, 500);
        f.setLayout(null);
        
        //Label Creation for Background Image
        l1=new JLabel();
        l1.setBounds(0, 0, 1366, 768);
        l1.setLayout(null);
        
        //Image Creation
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("BBM/login_background.PNG"));
        Image i1=img.getImage().getScaledInstance(1400, 768, Image.SCALE_SMOOTH);
        ImageIcon img2=new ImageIcon(i1);
        //Inserting Image to Label1
        l1.setIcon(img2);
        
        //Creating Label-"Username"
        l2=new JLabel("Username");
        l2.setBounds(650, 320, 150, 30);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Arial",Font.BOLD,15));
        //Inserting Username Label to Label1
        l1.add(l2);
        
        //Creating Label-"Password"
        l3=new JLabel("Password");
        l3.setBounds(650, 392, 150, 30);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Arial",Font.BOLD,15));
        //Inserting Password Label to Label1
        l1.add(l3);
        
        //Creation of a Textfield
        tf=new JTextField();
        tf.setBounds(800, 320, 250, 25);
        tf.setFont(new Font("Arial",Font.BOLD,15));
        tf.setBorder(BorderFactory.createLineBorder(Color.black));
        //Adding textfield to Label1
        l1.add(tf);
        
        //Creation of a Passwordfield
        pf=new JPasswordField();
        pf.setBounds(800, 392, 250, 25);
        pf.setBorder(BorderFactory.createLineBorder(Color.black));
        //Adding Passwordfield to Label1
        l1.add(pf);
        
        //Creation of Login Button
        ImageIcon icon1=new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\login.png");
        b1=new JButton("Login",icon1);
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.setBounds(800, 470, 100, 30);
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setBorder(BorderFactory.createLineBorder(Color.black));
        //b1.setBorder(BorderFactory.createEtchedBorder());
        //Adding Button to Label1
        l1.add(b1);
        
        //Creation of Exit Button
        ImageIcon icon2=new ImageIcon("C:\\Users\\KRISHNA\\Documents\\NetBeansProjects\\BloodBankManagementt\\src\\BBM\\Exit application.png");
        b2=new JButton("Exit",icon2);
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.setBounds(950, 470, 100, 30);
        b2.setFont(new Font("Arial",Font.BOLD,15));
        b2.setIcon(icon2);
        b2.setBorder(BorderFactory.createLineBorder(Color.black));
        //b2.setBorder(BorderFactory.createEtchedBorder());
        l1.add(b2);//Adding Button to Label1
        
        f.add(l1);//Adding Label1 to Frame
        f.setVisible(true);//Setting the visibility of the Frame
        f.setSize(1366, 800);
        f.setLocation(300, 100);//Location of the Frame
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            if(tf.getText().equals("BBMS") && pf.getText().equals("admin"))
            {
                f.setVisible(false);
                new Home();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            }
        }
        
        if(e.getSource()==b2)
        {
            int a=JOptionPane.showConfirmDialog(null,"Do you really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
            if(a==0)
            {
                System.exit(0);
            }
        }
    }
    public static void main(String args[])
    {
        new Login();
    }
}
