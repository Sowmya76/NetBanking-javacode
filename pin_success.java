/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbanking;

/**
 *
 * @author sowmya
 */



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.json.simple.JSONObject;




public class pin_success extends JFrame{
public JLabel PIN,result0;
public JTextField pn;
public JLabel new_pin,success;
public JTextField  np1;
public JButton Enter;
public static String npin;
public static String pinx;




public pin_success(String str){
	
     setLayout(new GridBagLayout());
     GridBagConstraints c3 = new GridBagConstraints();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(500,500);
     setVisible(true);

	result0=new JLabel("");
	 c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 0;
     c3.gridy = 0;
     c3.gridwidth = 2;
     add(result0,c3);
	//result0.setText("Hello "+readfile.c[welcome_frame.index]);  ---------------TODO
	
	PIN = new JLabel("Current PIN");
    c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx =0;
     c3.gridy =10;
     c3.gridwidth =2;
    add(PIN,c3);
    
    pn= new JTextField(4);
    c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 3;
     c3.gridy = 10;
     c3.gridwidth =2;
     add(pn,c3);
	 
	 new_pin =new JLabel("Enter New Pin");
	 c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 0;
     c3.gridy = 14;
     c3.gridwidth = 2;
	 add(new_pin,c3);

	np1= new JTextField(4);
	c3.fill = GridBagConstraints.HORIZONTAL;
    c3.gridx = 3;
    c3.gridy = 14;
    c3.gridwidth = 2;
    add(np1,c3);

	Enter=new JButton("Change");
    c3.fill = GridBagConstraints.HORIZONTAL;
    c3.gridx = 2;
    c3.gridy = 16;
    add(Enter,c3);
	
	 success=new JLabel("");
	 c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 2;
     c3.gridy = 30;
     c3.gridwidth = 2;
     add(success,c3);

	
	 	 	
Enter.addActionListener(new ActionListener()
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			  pinx = pn.getText();
			  npin=np1.getText();
			
			  JSONObject jp1=new JSONObject();
			  JSONObject json1=new JSONObject();
			  JSONObject jp2=new JSONObject();
			  jp1.put("uname",str);
			  jp1.put("password",pinx);

			json1=http_post.excutePost("http://localhost:8090/setup/login",jp1);
        	boolean name = (boolean)json1.get("success");
        	System.out.println(name);

			if(name==true){
				String str1=(String)json1.get("token");
				jp2.put("uname",str);
				jp2.put("token",str1);
				jp2.put("password",npin);
				json1=http_post.excutePost("http://localhost:8090/api/pinchange",jp2);

			}

			  boolean name1 = (boolean)json1.get("success");
        	  System.out.println(name1);
			  if(name1==true)
			  {
				  success.setText(" Your pin has been successfully changed to  "+npin);
			  }
			   else 
			   {
				   		success.setText("Requested pin is same as your old pin"); 
			   }
			  
		 }
	 });
	
 }
 

} 
