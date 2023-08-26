package hotel.management.system;
import javax.swing.*;
import java.awt.*;
public class HotelManagementSystem extends JFrame{
  
    HotelManagementSystem()
    {
        setSize(1366,565);      //size of frame
        setLocation(100,100);          //frame from top 100 & from bottom 100;by def topleft hota
       
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/first.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1366,565);           
        add(image); 
        
        
        JLabel text=new JLabel("Hotel Management System");
        text.setBounds(20,430,1000,90);
        image.add(text);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif",Font.PLAIN,70));
        
       JButton next=new JButton("Next");
       next.setBounds(1150,450,150,50);
       
       next.setBackground(Color.WHITE);
       next.setForeground(Color.MAGENTA);
       next.setFont(new Font("serif",Font.PLAIN,24));
        image.add(next);
           
        setVisible(true);   //bydefault false and not visible so used for   
        
        
        while(true)
        {
            text.setVisible(false);
            try
            {
                Thread.sleep(500); 
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }    
            text.setVisible(true);
             try
            {
                Thread.sleep(500); 
            }
            catch (Exception e)
            {
                e.printStackTrace();
            } 
        }  
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        new HotelManagementSystem();           // object of class
        
    }
    
}
