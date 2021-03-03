/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem.services;

/**
 *
 * @author tss
 */
public class InvalidCode extends Exception{
    
    public InvalidCode(String message) {
        super(message);
    }
    
}
