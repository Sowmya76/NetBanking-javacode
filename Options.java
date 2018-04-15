/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbanking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author sowmya
 */


//****************BALANCE ENQUIRY****************//

class balance_enquiry extends JFrame{
public JLabel Name,PIN,user_name,result,result1,result2;
public JTextField nm,pn;
public int pin_input;
public balance_enquiry(){
     
     setLayout(new GridBagLayout());
     GridBagConstraints c1 = new GridBagConstraints();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(300,300);
     setVisible(true);
	 
    
    result1=new JLabel("");
    c1.fill = GridBagConstraints.HORIZONTAL;
     c1.gridx = 0;
     c1.gridy = 0;
     c1.gridwidth = 2;
     add(result1,c1);

	//result1.setText("Hello "+readfile.c[welcome_frame.index]);  --To be  done
	
    PIN = new JLabel("Enter PIN");
    c1.fill = GridBagConstraints.HORIZONTAL;
     c1.gridx =0;
     c1.gridy =20;
     c1.gridwidth =2;
    add(PIN,c1);
    
    pn= new JTextField(4);
    c1.fill = GridBagConstraints.HORIZONTAL;
     c1.gridx = 0;
     c1.gridy = 30;
     c1.gridwidth =2;
     add(pn,c1); 
        
	result=new JLabel("");
	 c1.fill = GridBagConstraints.HORIZONTAL;
     c1.gridx = 0;
     c1.gridy = 40;
     c1.gridwidth = 2;
     add(result,c1);
	 	 	 
	result2=new JLabel("");
	 c1.fill = GridBagConstraints.HORIZONTAL;
     c1.gridx = 0;
     c1.gridy = 60;
     c1.gridwidth = 2;
     add(result2,c1);
	 	 	 
	 pn.addActionListener(new ActionListener()
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			  pin_input = Integer.parseInt(pn.getText());
			  			
			/*if(pin_input == readfile.b[welcome_frame.index])
				{	
					result2.setText("Available Balance    " + readfile.d[welcome_frame.index]);
					result.setText("");
					//result.setText("valid pin");
					 decission tr1 = new decission();
				     
				}
				
				else 
					result.setText("Invalid pin");
			*/						
				
			  
		 }
	 });
	 
 }
}

//---------------------------------------amount---------------------------------------------------------------------------------

class amount extends JFrame{
public JLabel Rec_Accno,Enter_Amount,result,result1;
public JTextField acc_no,am;
public JButton tsfr;
public static int amount_input;
public static float balance;

public amount(){
setLayout(new GridBagLayout());
     GridBagConstraints c4 = new GridBagConstraints();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(500,500);
     setVisible(true);
    
     Rec_Accno = new JLabel("Enter Receiver's Account number:");
    c4.fill = GridBagConstraints.HORIZONTAL;
     c4.gridx =0;
     c4.gridy =1;
     c4.gridwidth =1;
    add(Rec_Accno,c4);
    
    acc_no= new JTextField(4);
    c4.fill = GridBagConstraints.HORIZONTAL;
     c4.gridx = 2;
     c4.gridy = 1;
     c4.gridwidth =2;
     add(acc_no,c4);
    
    Enter_Amount = new JLabel("Enter Amount:");
    c4.fill = GridBagConstraints.HORIZONTAL;
     c4.gridx =0;
     c4.gridy =4;
     c4.gridwidth =1;
    add(Enter_Amount,c4);
	
am= new JTextField(4);
    c4.fill = GridBagConstraints.HORIZONTAL;
     c4.gridx = 2;
     c4.gridy = 4;
     c4.gridwidth =2;
     add(am,c4);
	 
	 result=new JLabel("");
	 c4.fill = GridBagConstraints.HORIZONTAL;
     c4.gridx = 0;
     c4.gridy = 10;
     c4.gridwidth = 1;
     add(result,c4);
	 
	 result1=new JLabel("");
	 c4.fill = GridBagConstraints.HORIZONTAL;
     c4.gridx = 0;
     c4.gridy = 20;
     c4.gridwidth = 1;
     add(result1,c4);

     tsfr=new JButton("Transfer");
     c4.fill = GridBagConstraints.HORIZONTAL;
     c4.gridx = 1;
     c4.gridy = 30;
     c4.gridwidth = 1;
     add(tsfr,c4);
	 
	 
	 tsfr.addActionListener(new ActionListener()
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			  amount_input = Integer.parseInt(am.getText());
			 /* if(amount_input > readfile.d[welcome_frame.index])  --------------------------TODO----------------
				  result.setText("Sufficient funds are not available in your account");*/
			  //else
			  {
			 
			  //balance = readfile.d[welcome_frame.index] - amount_input;  --------------------------TODO----------------
			  		  
			 // readfile.d[welcome_frame.index] = balance;  --------------------------TODO----------------
			//  writefile wf = new writefile();
			 // wf.write_to_file1();
			  //wf.write_to_file2();
		     // e_receipt ere = new e_receipt();
                          }
			  
			  
		  }
	 });
	 

}
}
//---------------------------------------------------Money Transfer----------------------------------------------------------------

class MoneyTransfer extends JFrame{

public JLabel Name,PIN,user_name,result,result1;
public JTextField nm,pn;
public int pin_input;

public MoneyTransfer(){
	System.out.println("MoneyTransfer window");
     
     setLayout(new GridBagLayout());
     GridBagConstraints c3 = new GridBagConstraints();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(500,500);
     setVisible(true);
	 
	 
	 result1=new JLabel("");
	 c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 0;
     c3.gridy = 0;
     c3.gridwidth = 2;
     add(result1,c3);

	//result1.setText("Hello "+readfile.c[welcome_frame.index]);  ------------------------------TODO---------------------
	
    PIN = new JLabel("Enter PIN");
    c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx =0;
     c3.gridy =10;
     c3.gridwidth =2;
    add(PIN,c3);
    
    pn= new JTextField(4);
    c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 0;
     c3.gridy = 20;
     c3.gridwidth =2;
     add(pn,c3);
        
	result=new JLabel("");
	 c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 0;
     c3.gridy = 30;
     c3.gridwidth = 1;
     add(result,c3);
	 
	 
	 
	 	 
	 pn.addActionListener(new ActionListener()
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			  pin_input = Integer.parseInt(pn.getText());
			  			System.out.println("outside");
			//if(pin_input == readfile.b[welcome_frame.index])  ------------------------------TODO---------------------
				{	
					amount d4 = new amount();					
					result.setText("");
				}
				
				//else 
					//result.setText("Invalid pin");
									
				
			  
		 }
	 });
	 
 }
}



//****************MINI STATEMENT*********************//

 class mini_statement extends JFrame{
	
 public JLabel Name,PIN,user_name,output;
 public JTextField nm,pn;
 public int pin_input;
 
 public mini_statement(){
	 setLayout(new GridBagLayout());
     GridBagConstraints c3 = new GridBagConstraints();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(300,300);
     setVisible(true);
	 
	 user_name=new JLabel("");
	 c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 0;
     c3.gridy = -10;
     c3.gridwidth = 1;
     add(user_name,c3);

	//user_name.setText(readfile.c[welcome_frame.index]);
	
	 output =new JLabel("");
	 c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 0;
     c3.gridy = 20;
     c3.gridwidth = 1;
     add(output,c3);

	
	PIN = new JLabel("Enter PIN");
    c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx =0;
     c3.gridy =2;
     c3.gridwidth =1;
    add(PIN,c3);
    
    pn= new JTextField(4);
    c3.fill = GridBagConstraints.HORIZONTAL;
     c3.gridx = 0;
     c3.gridy = 4;
     c3.gridwidth =1;
     add(pn,c3); 
	 
	 pn.addActionListener(new ActionListener()
	 {
		 public void actionPerformed(ActionEvent e)
		 {
			  pin_input = Integer.parseInt(pn.getText());
			  //output.setText(" The last three transactions are  " + readfile.t3[welcome_frame.index] +" " +readfile.t2[welcome_frame.index] + " " + readfile.t1[welcome_frame.index]);
			 // decission dw = new decission();	  
	
	 }
	 });
	
	
	
	
}

}
 
 
 //-----------------------------------decision---------------------------------------

class decision extends JFrame{
public JLabel result;
public JButton yes,no;
public	decision(){
	super("do you want to continue");
	 setLayout(new GridBagLayout());
     GridBagConstraints c2 = new GridBagConstraints();
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(500,500);
     setVisible(true);

	yes = new JButton("yes");
  c2.fill = GridBagConstraints.HORIZONTAL;
     c2.gridx = 0;
     c2.gridy = 2;
     c2.gridwidth = 1;
     add(yes,c2);

  no = new JButton("no");
  c2.fill = GridBagConstraints.HORIZONTAL;
     c2.gridx = 0;
     c2.gridy = 4;
     c2.gridwidth = 1;
     add(no,c2);
	 
	 event a = new event();
	 
	 result=new JLabel("");
	 c2.fill = GridBagConstraints.HORIZONTAL;
     c2.gridx = 0;
     c2.gridy = 10;
     c2.gridwidth = 1;
     add(result,c2);
	 
	 
yes.addActionListener(a); 
no.addActionListener(a);

}
public class event implements ActionListener{
public void actionPerformed(ActionEvent a){
 String op = a.getActionCommand();
 
if(op.equals("yes"))
 {
   Options ob = new Options(); 
   
}

if(op.equals("no"))
{
	end d = new end();
}
	

}
}
}


//----conclusion----
class end extends JFrame{
public JLabel mssg;	
end(){
setLayout(new GridBagLayout());
     GridBagConstraints f2 = new GridBagConstraints();
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(300,300);
     setVisible(true);

mssg = new JLabel("Thank you Have a nice day");
f2.fill = GridBagConstraints.HORIZONTAL;
     f2.gridx = 0;
     f2.gridy = 2;
     f2.gridwidth = 2;
     add(mssg,f2);
}
}

//**************OPTIONS*************************//   
public class Options extends JFrame{
    


  public JButton Money_Transfer,Balance_Inquiry,Mini_Statement,PIN_Change,Debt_paying;
  public JLabel result;  
  
  public Options(){
  
  super("ATM GUI");
  
     setLayout(new GridBagLayout());
     GridBagConstraints c2 = new GridBagConstraints();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(300,300);
     setVisible(true);

  Money_Transfer = new JButton("Money Transfer");
  c2.fill = GridBagConstraints.HORIZONTAL;
     c2.gridx = 0;
     c2.gridy = 2;
     c2.gridwidth = 1;
     add(Money_Transfer,c2);

  PIN_Change = new JButton("Pin Change");
  c2.fill = GridBagConstraints.HORIZONTAL;
     c2.gridx = 0;
     c2.gridy = 4;
     c2.gridwidth = 1;
     add(PIN_Change,c2);

Mini_Statement = new JButton("Mini Statement");
  c2.fill = GridBagConstraints.HORIZONTAL;
     c2.gridx = 0;
     c2.gridy = 6;
     c2.gridwidth = 1;
     add(Mini_Statement,c2);
  
Balance_Inquiry = new JButton("Balance Enquiry");
  c2.fill = GridBagConstraints.HORIZONTAL;
     c2.gridx = 0;
     c2.gridy = 8;
     c2.gridwidth = 1;
     add(Balance_Inquiry,c2);
     
Debt_paying = new JButton("Debt Paying");
  c2.fill = GridBagConstraints.HORIZONTAL;
  c2.gridx = 0;
     c2.gridy = 10;
     c2.gridwidth = 1;
     add(Debt_paying,c2);


event a = new event();
Money_Transfer.addActionListener(a); 
Balance_Inquiry.addActionListener(a);
Mini_Statement.addActionListener(a); 
Debt_paying.addActionListener(a); 
PIN_Change.addActionListener(a);
}

public class event extends JFrame implements ActionListener{
public JLabel result;
public void actionPerformed(ActionEvent a){
 String op = a.getActionCommand();
  
if(op.equals("Money Transfer"))
 {   System.out.println("Money Transfer");
    MoneyTransfer mt=new MoneyTransfer();
	 
 }
   
if(op.equals("Balance Enquiry"))
{
	System.out.println("Balance Inquiry");
        balance_enquiry be=new balance_enquiry();
}



if(op.equals("Pin Change")){
	
		System.out.println("PIN Change");
		pin_success ps=new pin_success();
}

if(op.equals("Mini Statement")){
	System.out.println("Mini Statement");
        mini_statement ms=new mini_statement();
	
	
}

if(op.equals("Debt Paying")){
	System.out.println("Debt_paying ");
	
	
}



}
}


}











