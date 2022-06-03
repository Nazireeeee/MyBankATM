/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod2.domain;

/**
 *
 * @author 05
 */
public class SavingsAccount extends Account{
    private double interestRate;
    
    public SavingsAccount(double initBalance, double interestRate){
        this.balance=initBalance;
        this.interestRate=interestRate;
    }
    
    public void addInterestRate(){
        this.balance+=this.balance*interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
    
    
}
