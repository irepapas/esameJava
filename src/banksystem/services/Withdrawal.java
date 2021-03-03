/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem.services;

import java.time.LocalDate;

/**
 *
 * @author tss
 */
public class Withdrawal extends Operation{
    
    private final String prel="-";
    //da dove effettuo prelievo (bancomat, pagamento,etc)
    private final String dove;
    
    LocalDate data;
    
    public Withdrawal(LocalDate data, double importo, String dove) {
        super(data, importo);
        this.dove=dove;
        
    }

    public String getPrel() {
        return prel;
    }
    
    
    public void stampa(){
        super.toString();
        System.out.println("Prelievo per:" +prel + dove);
    }
}
