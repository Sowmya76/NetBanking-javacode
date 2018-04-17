/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbanking;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//import java.awt.*;
//import java.awt.event.*;
/**
 *
 * @author sowmya
 */
public class Welcome extends JFrame  {
    
   public JLabel item1,usr_name,password,result;
   public JTextField inp_name,pswd;
   public JButton button,button1;
   public static String user_name,pswrd;
   public static int index;
   public static JSONObject json;
   public static String token;
   public Welcome() {
     super("ATM GUI");
     setLayout(new GridBagLayout());
     GridBagConstraints c = new GridBagConstraints();

     item1 = new JLabel("WELCOME");
     c.fill = GridBagConstraints.HORIZONTAL;
     c.gridx = 1;
     c.gridy = 0;
     c.gridwidth = 1;
     add(item1,c);
     
     

    //Acc_no = new JLabel("Enter 5-digit Account number:");
    usr_name=new JLabel("Enter User name:");
    c.fill = GridBagConstraints.HORIZONTAL;
     c.gridx =0;
     c.gridy =1;
    add(usr_name,c);
    
    inp_name= new JTextField(5);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 1;
    add(inp_name,c);
    
    password=new JLabel("Password:");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0;
    c.gridy =2;
    add(password,c);
    
    pswd= new JTextField(3);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 2;
    add(pswd,c);
    
    button=new JButton("Login");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 6;
   
    
    add(button,c);
    button1=new JButton("New User");
     c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =1;
    c.gridy = 7;
    add(button1,c);
    
    button.addActionListener(new ActionListener()
    {
		 public void actionPerformed(ActionEvent e)
		 {
			 //needs to verify credentials by sending http request
         user_name=inp_name.getText();
        pswrd = pswd.getText();
        JSONObject js1=new JSONObject();
        js1.put("uname",user_name);
        js1.put("password",pswrd);
       // json=http_post.excutePost("http://localhost:8090/setup/login","uname="+user_name+"&password="+pswrd);
        json=http_post.excutePost("http://localhost:8090/setup/login",js1);
        boolean name = (boolean)json.get("success");
        System.out.println(name);
        if(name==true){
              String test=(String)json.get("debitAccount");
              System.out.println(test);
              token=(String)json.get("token");
              Options d2 = new Options();
        }
        else{
          System.out.println("Invalid user");
           JOptionPane.showMessageDialog(null, "Invalid user! Please try again");
        }
	  
		 }
    });
    
    button1.addActionListener(new ActionListener()
    {
		 public void actionPerformed(ActionEvent e)
		 {
			  
                           JOptionPane.showMessageDialog(null, "New user! Please register by providing required details");
                           new_user wi=new new_user();
                           

		 }
    });
     
	 
     
  }
}
 