/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbanking;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author sowmya
 */
public class NetBanking_main {
    
 
    public static void main(String args[]){
	
    Welcome step1 = new Welcome();
    step1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    step1.setSize(400,400);
    //step1.pack();
    step1.setVisible(true);

}
}