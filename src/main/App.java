/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import banksystem.services.Account;
import banksystem.services.Bank;



/**
 *
 * @author tss
 */
public class App {
    public static void main(String[] args) {
        
        Bank banca = new Bank("ssss");
        
        banca.createAccount(new Account(1, "Mario Rossi", 200));
        
    }
}
