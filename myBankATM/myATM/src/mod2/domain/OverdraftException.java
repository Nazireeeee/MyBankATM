/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod2.domain;

/**
 *
 * @author 05
 */
public class OverdraftException extends Exception{
    private double deficit;

    public double getDeficit() {
        return deficit;
    }

    public OverdraftException(double deficit, String message) {
        super(message);
        this.deficit = deficit;
    }
    
}
