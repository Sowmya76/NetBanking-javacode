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
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class http_post {
    static JSONObject json=null;
    public static JSONObject excutePost(String url, JSONObject urlparameters){
        HttpURLConnection con=null;
        try {

        URL base_url = new URL(url);
       con =(HttpURLConnection) base_url.openConnection();
        JSONObject jsonObj=null;

        con.setDoInput(true);
        con.setDoOutput(true);
        con.setUseCaches(false);
       // con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
         con.setRequestProperty("Content-Type", "application/json");
        DataOutputStream printout = new DataOutputStream(con.getOutputStream());
        String usrid,pin;
        // This is the POST 
        //String content ="email=jad939933@hotmail.com&pass=577383";
        JSONObject content =urlparameters;
        System.out.println("parameters are "+urlparameters);

        printout.writeBytes(content.toString());
        System.out.println(content.toString());
        printout.flush();
        printout.close();





        DataInputStream input = new DataInputStream(con.getInputStream());
        String str;
        while (null != ((str = input.readLine()))) {
        JSONParser parser = new JSONParser(); 
        jsonObj = (JSONObject) parser.parse(str);
        boolean name = (boolean)jsonObj.get("success");
        System.out.println(str);
        System.out.println(name);
        }
        input.close();
        return jsonObj;

        }catch (Exception e) {

            e.printStackTrace();
            return null;  

        }  finally {

            if(con != null) {
              con.disconnect(); 
            }
      
        }
    } 

    /*
    public static void main(String args[]){
        String username="bindu"; int psword=123456;
        json=new JSONObject();
        JSONObject j1=new JSONObject();
            JSONObject j2=new JSONObject();
            JSONObject j3=new JSONObject();
            JSONObject json1=new JSONObject();
            String user,pswrd,ques_chosen,ans,dbt_Act,cdt_Act;
            int dbt_bal,max_cdt,cdt_bal,payment_num;
            double int_rate;
			user="abc";
            pswrd = "12345";
            dbt_Act="12345678";
            dbt_bal=10000;
            cdt_Act="34567812";
            max_cdt=100000;
            cdt_bal=100000;
            int_rate=10;
            payment_num=5;
            ques_chosen="what's ur pet name?";
            ans="puppy";
            json.put("uname",user);
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

        //json=excutePost("http://localhost:8090/setup/login","uname="+username+"&password="+psword);
        json1=excutePost("http://localhost:3000/setup/setup",json);
        String name = (String)json1.get("token");
        System.out.println(name);
    
    }*/
}
