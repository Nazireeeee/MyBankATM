/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod2.domain;

import java.util.ArrayList;

/**
 *
 * @author 05
 */
public class Bank {

    private ArrayList<Customer> customers =new ArrayList<>();
    private int numOfClaents =0;
    private static Bank myBank=new Bank();

    public static Bank getBank() {
        return myBank;
    }

    private Bank() {
        
    }

    public Customer getCustomer(int custNumber) {
        if (custNumber < customers.size()) {
            return customers.get(custNumber);
        }
        return null;
    }
    
    public void addCustomer(Customer newCustomer){
        customers.add(newCustomer);
        numOfClaents++;
    }

    public int getNumOfClaents() {
        return numOfClaents;
    }

}
