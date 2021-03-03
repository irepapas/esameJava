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
public class Deposit extends Operation{
    
    private final String vers="+";
   //mezzo usato per il versamento (contanti,assegno etc.)
    private final String mezzo; 
    // causale opzionale 
    private String causale = null;
    
    LocalDate data;

    public Deposit(LocalDate data, double importo, String m) {
        super(data,importo);
        this.mezzo = m;
        
    }

    public String getVers() {
        return vers;
    }
    
    

    public void setCausale(String causale) {
        this.causale = causale;
    }
    
    public void stampa(){
        System.out.println("Versamento tramite:" + vers + mezzo);
        super.toString();
        if (causale !=null)System.out.println("Causale:" + causale);
    }
    
    
}
