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


class hello extends JFrame{
public JLabel new_pin,success;
public JTextField  np1;
public static int changed_pin;

public hello(){
	
	setLayout(new GridBagLayout());
     GridBagConstraints h = new GridBagConstraints();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(600,600);
     setVisible(true);
	 
	 new_pin =new JLabel("Enter New Pin");
	 h.fill = GridBagConstraints.HORIZONTAL;
     h.gridx = 0;
     h.gridy = 0;
     h.gridwidth = 2;
	 add(new_pin,h);
	
	 success=new JLabel("");
	 h.fill = GridBagConstraints.HORIZONTAL;
     h.gridx = 0;
     h.gridy = 20;
     h.gridwidth = 2;
     add(success,h);
	 
	 np1= new JTextField(4);
	h.fill = GridBagConstraints.HORIZONTAL;
     h.gridx = 6;
     h.gridy = 0;
     h.gridwidth = 2;
     add(np1,h);
	
	np1.addActionListener(new ActionListener()
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			  changed_pin = Integer.parseInt(np1.getText());
			   if(changed_pin == pin_success.pinx)
				success.setText("Requested pin is same as your old pin"); 
			   
			   else if((changed_pin>=100)&&(changed_pin<1000))
			   {
			  //readfile.b[welcome_frame.index] = changed_pin;   // ---------------TODO--------------------------------------------
			  success.setText(" Your pin has been successfully changed to  "+changed_pin);
			   //writefile wf = new writefile();     // ---------------TODO--------------------------------------------
			  //wf.write_to_file1();
			   //decission d = new decission();
                           }
			  else 
			   success.setText(" Your pin must be in 3 digits");
			    
		 }
	 });
			  
}
}


public class pin_success extends JFrame{
public JLabel PIN,result0,result11;
public JTextField pn;
public JButton Enter;
public static int npin;
public static int pinx;
public static int pin_input1;

public pin_success(){
	//System.out.println("HFSF");
     setLayout(new GridBagLayout());
     GridBagConstraints c3 = new GridBagConstraints();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(300,300);
     setVisible(true);
result11=new JLabel("");
	 c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 0;
     c3.gridy = 0;
     c3.gridwidth = 2;
     add(result11,c3);
	//result11.setText("Hello "+readfile.c[welcome_frame.index]);  ---------------TODO
	
	PIN = new JLabel("Enter PIN");
    c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx =0;
     c3.gridy =20;
     c3.gridwidth =2;
    add(PIN,c3);
    
    pn= new JTextField(4);
    c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 0;
     c3.gridy = 30;
     c3.gridwidth =2;
     add(pn,c3);
	 
	result0=new JLabel("");
	 c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 0;
     c3.gridy = 50;
     c3.gridwidth = 1;
     add(result0,c3);
	 	 	
pn.addActionListener(new ActionListener()
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			  pinx = Integer.parseInt(pn.getText());
			  
                          hello hi = new hello();
                         // ---------------TODO--------------------------------------------
		 /*if(pinx == readfile.b[welcome_frame.index]){
			  result0.setText(" ");
			  
			  }
			  else{
				 result0.setText("Invalid pin"); 
			  }
                    */
		 }
	 });
	
 }
 

} 
