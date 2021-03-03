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
public class InvalidValue extends Exception{
    
    public InvalidValue(String message) {
        super(message);
    }
}
