package netbanking;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

//import java.awt.*;
//import java.awt.event.*;
/**
 *
 * @author sowmya
 */
public class new_user extends JFrame  {
   public JLabel item1,usr_name,pswd,debitAcc,bal_debit,creditAcc,maxCredit,bal_credit,rate,noOfpayments,result,sec_ques,sec_ans;
   public JTextField user_name,password,debit_Accnt,debit_balance,credit_Accnt,max_credit,credit_balance,interest_rate,payment_number,answer;
   public JButton button,button1;
   public String username,pswrd,cdt_Act,dbt_Act,ques_chosen,ans;
   public int dbt_bal,max_cdt,cdt_bal,payment_num;
   double int_rate;
   public static int index;
   public static JSONObject json,json1;
   public new_user() {
     super("ATM GUI");
     setLayout(new GridBagLayout());
     GridBagConstraints c = new GridBagConstraints();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(800,800);
     setVisible(true);

     item1 = new JLabel("WELCOME");
     c.fill = GridBagConstraints.HORIZONTAL;
     c.gridx = 1;
     c.gridy = 0;
     c.gridwidth = 1;
     add(item1,c);
     
     

    //Acc_no = new JLabel("Enter 5-digit Account number:");
    usr_name=new JLabel("Username:");
    c.fill = GridBagConstraints.HORIZONTAL;
     c.gridx =0;
     c.gridy =1;
    add(usr_name,c);
    
    user_name= new JTextField(10);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 1;
    add(user_name,c);
    
    pswd=new JLabel("Password:");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0;
    c.gridy =2;
    add(pswd,c);
    
    password= new JTextField(6);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 2;
    add(password,c);

    debitAcc=new JLabel("Debit Account number:");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0;
    c.gridy =3;
    add(debitAcc,c);
    
    debit_Accnt= new JTextField(8);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy =3;
    add(debit_Accnt,c);

    bal_debit=new JLabel("Debit Balance:");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0;
    c.gridy =4;
    add(bal_debit,c);
    
    debit_balance= new JTextField(10);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 4;
    add(debit_balance,c);

    creditAcc=new JLabel("Credit Account number:");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0;
    c.gridy =5;
    add(creditAcc,c);
    
    credit_Accnt= new JTextField(8);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 5;
    add(credit_Accnt,c);

    maxCredit=new JLabel("Maximum Credit:");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0;
    c.gridy =6;
    add(maxCredit,c);
    
    max_credit= new JTextField(10);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 6;
    add(max_credit,c);

    bal_credit=new JLabel("Credit Balance:");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0;
    c.gridy =7;
    add(bal_credit,c);
    
    credit_balance= new JTextField(10);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 7;
    add(credit_balance,c);

    rate=new JLabel("Credit Interest rate:");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0;
    c.gridy =8;
    add(rate,c);
    
    interest_rate= new JTextField(5);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 8;
    add(interest_rate,c);


    noOfpayments=new JLabel("Number of payments:");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0;
    c.gridy =9;
    add(noOfpayments,c);
    
    payment_number=new JTextField(5);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 9;
    add(payment_number,c);

   

    sec_ques=new JLabel("Security Question:");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0;
    c.gridy =10;
    add(sec_ques,c);


    String[] questions = { "What is your pet name?", "What is your favourite novel?", "What is your favourite movie?","What is your favourite color?", "Which phone number do you remember most from your childhood?" };

    JComboBox ques = new JComboBox(questions);
    ques.setEditable(false);
    ques.setSelectedIndex(1);
     c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 10;
    add(ques,c);

     sec_ans=new JLabel("Answer:");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx =0;
    c.gridy =11;
    add(sec_ans,c);
    
    answer= new JTextField(5);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 2;
    c.gridy = 11;
    add(answer,c);

    ques.addActionListener(new ActionListener()
    {
		public void actionPerformed(ActionEvent e)
		{
			JComboBox cb = (JComboBox)e.getSource();
            ques_chosen = (String)cb.getSelectedItem();
            System.out.println(ques_chosen);
            //updateLabel(que_chosen);
        }
	  
		 
    });
    
    
    button=new JButton("Register");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 20;
    add(button,c);
   

   button.addActionListener(new ActionListener()
    {
		public void actionPerformed(ActionEvent e)
		{
            JSONObject j1=new JSONObject();
            JSONObject j2=new JSONObject();
            JSONObject j3=new JSONObject();
            json=new JSONObject();
			username=user_name.getText();
             System.out.println(username);
            pswrd = password.getText();
            System.out.println(pswrd);
            dbt_Act=debit_Accnt.getText();
            System.out.println(dbt_Act);
            dbt_bal=Integer.parseInt(debit_balance.getText());
            System.out.println(dbt_bal);
            cdt_Act=credit_Accnt.getText();
            System.out.println(cdt_Act);
            max_cdt=Integer.parseInt(max_credit.getText());
            System.out.println(max_cdt);
            cdt_bal=Integer.parseInt(credit_balance.getText());
            System.out.println(cdt_bal);
            int_rate=Double.parseDouble(interest_rate.getText());
            System.out.println(int_rate);
            payment_num=Integer.parseInt(payment_number.getText());
            System.out.println(payment_num);
            ans=answer.getText();
            System.out.println(ans);
            System.out.println(username);
            json.put("uname",username);
            json.put("password",pswrd);
            json.put("debitAccount",dbt_Act);
            j1.put("accountnumber",cdt_Act);
            j1.put("maxCredit",max_cdt);
            j1.put("balance",cdt_bal);
            j1.put("interestRate",int_rate);
            j1.put("numofpayments",payment_num);
            json.put("creditAccount",j1);
            j2.put("question",ques_chosen);
            j2.put("answer",ans);
            json.put("security",j2);
            j3.put("debit",dbt_bal);
            j3.put("credit",cdt_bal);
            json.put("balance",j3);
        System.out.println(json.toString());

       json1=http_post.excutePost("http://localhost:8090/setup/signup",json);

         //  json1=http_post.excutePost("http://localhost:8090/setup/login","uname="+username+"&password="+pswrd+"&debitAccount="+dbt_Act+"&creditAccount:{accountNumber="+cdt_Act+"&maxCredit="+max_cdt+"&balance="+cdt_bal+"&interestRate="+int_rate+"&numofpayments="+payment_num+"}&security:{question="+ques_chosen+"&answer="+ans+"&balance:{debit="+dbt_bal+"&credit="+cdt_bal);
            boolean name = (boolean)json1.get("success");
        System.out.println(name);
        if(name==true){
              Options d2 = new Options();
        }
        else{
          System.out.println(" user already exists, Please try again");
           JOptionPane.showMessageDialog(null, "user already exists! Please try again");        
        }
    }
		 
  });

 }
    /*public static void main(String args[])
    {
        new_user wi=new new_user();
    wi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    wi.setSize(800,800);
    //step1.pack();
    wi.setVisible(true);
    }*/
   
}