/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;


/**
 *
 * @author tss
 */
public class Bank {
    
    private final String nome;
    private final ArrayList <Account> listaConti;
    private static int noGenerator = 0;
    
    public Bank(String nome) {
        this.nome = nome;
        listaConti = new ArrayList<Account>();
    }

     /**
     * creazione dell'account
     * @param a Account
     * @return nuovo numero di conto corrente che deve essere incrementato
     */
    public int createAccount(Account a){
        a.setIdConto(++noGenerator);
        listaConti.add(a);
        return a.getIdConto();
    }
    /**
     * @param id conto 
     * @return account 
     * @throws banksystem.services.InvalidCode
     */
    public Optional<Account> getAccount(int id) throws InvalidCode{
        for (Account a : listaConti) {
            if(a.getIdConto()==id){
                return Optional.of(a);
            }else{
                throw new InvalidCode("Impossibile trovare numero di conto...");
            }
        }
      return Optional.empty();
    }
    /**
     * @param id conto 
     * @param data 
     * @param d deposit
     * @return void
     * @throws banksystem.services.InvalidCode
     */
    // TO DO DISCORSO DATA 
    public void deposit(int id,LocalDate data, Deposit d) throws InvalidCode{
        listaConti.get(listaConti.indexOf(getAccount(id).orElseThrow())).addDeposit(d);
    }
    /**
     * @param id conto 
     * @param data 
     * @param w 
     * @return void 
     *
     */
    public void withdrawal(int id,LocalDate data,Withdrawal w) throws InvalidCode{
        if()
        listaConti.get(listaConti.indexOf(getAccount(id).orElseThrow())).addWithdraw(w);
    }
    /**
     * bonifico verso un conto
     * @param idOrdinante
     * @param idDestinatario
     * @param data 
     * @param importo 
     * @return void 
     * eccezione se i numeri di conto non è trovati
     * eccezione sul saldo 
     * 
     */
    public void transfer(int idOrdinante,int idDestinatario,LocalDate data, double importo){
        
    }
    
    /**
     * chiusura conto
     * @param id
     * @param data 
     * @return account chiuso
     * eccezione se il numero di conto non è trovato
     * eccezione sulla data
     * 
     */
    public String deleteAccount(int id, LocalDate data) throws InvalidCode{
        Account a = listaConti.get(id);
        a.addWithdraw(a.getSaldo());
        listaConti.remove(a);
        return a.toString();
        
    }
    
}
