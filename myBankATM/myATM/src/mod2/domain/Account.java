/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod2.domain;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 *
 * @author Nelli
 * 
 * Customer's bank account
 */
public class Account {
    protected double balance;
    
    /**
     *@param balance positive account balance
     * Constructor that provides initial balabce
     */

    protected Account(double balance) {
        if(balance>=0){
            this.balance=balance;
        }else{
            this.balance=0;
        }
    }

    public Account() {
        this.balance=0;
    }
    
    
    /**
     *Method to check account balabce
     * @return balance of account
     */
    
    public double getBalance(){
        Locale.setDefault(Locale.ENGLISH);
        DecimalFormat formatOfBalance=new DecimalFormat("####.##");
        return Double.parseDouble(formatOfBalance.format(balance));
    }
    
    /**
     * Method to add money to account
     *@param money the positive amount of money deposited
     * @return 
     * 
     */
    
    public boolean deposit(double money){
        if(money>0){
            balance+=money;
            return true;
        }
        return false;
    }
    
    /**
     * Method to withdrow money
     *@param money the positive amount of withdrowing money
     * @return 
     */
    
    public boolean withdraw(double money)throws Exception{
        if(balance>=money){
            balance-=money;
            return true;
        }else{
            System.out.println("There are not enough funds in the account!");
        }
        return false;
    }
    
}
