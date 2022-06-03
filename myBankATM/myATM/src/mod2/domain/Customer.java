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
public class Customer {

    private ArrayList<Account> accounts;
    private String firstName;
    private String lastName;
    private int customerNumber;
    private static int customerNumberBase = 1000;
    private int numOfAccounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new ArrayList<>();
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumOfAccounts() {
        return numOfAccounts;
    }

    public Account getAccount(int accNumber) {
        if (accNumber < accounts.size() && numOfAccounts != 0) {
            return accounts.get(accNumber);
        }
        return null;
    }

    public void addAccount(Account acc) {

        accounts.add(acc);
        numOfAccounts++;

    }

    @Override
    public String toString() {
        String s = "Customer{" + "fullName=" + lastName + " " + firstName + ", customerNumber=" + customerNumber + ", numOfAccounts=" + numOfAccounts + '}';
        for (int i = 0; i < this.numOfAccounts; i++) {
            Account acc = getAccount(i);
            if (acc instanceof SavingsAccount) {
                s += "\n\t" + (i + 1) + " Savings account with interest rate %" + ((SavingsAccount) acc).getInterestRate();
            } else {
                s += "\n\t" + (i + 1) + " Checking account with overdraft $" + ((CheckingAccount) acc).getOverdraftAmount();
            }
            s += ", balance $" + acc.getBalance();
        }
        s += "\n";
        return s;
    }

}
