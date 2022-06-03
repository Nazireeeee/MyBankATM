/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod2.domain;

/**
 *
 * @author 05
 */
public class CheckingAccount extends Account{
    private double overdraftAmount;

    public CheckingAccount(double initBalance, double overdraftAmount) {
        this.balance=initBalance;
        this.overdraftAmount=overdraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance,0);
    }
    
    @Override
    public boolean withdraw(double amt) throws OverdraftException{
        if(amt<=balance+overdraftAmount){
            balance-=amt;
            return true;
        }
        throw new OverdraftException(amt-balance-overdraftAmount, "Error! Insufficient funds!");
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }
    
    
    
    
}
