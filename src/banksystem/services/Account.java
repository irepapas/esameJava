/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem.services;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author tss
 */
public class Account {
    

    private int idConto;
    private final String correntista;
    private final double saldo;
    private final List< Operation> movimenti;

    public Account(int idConto,String correntista, double saldo) {
        this.idConto=idConto;
        this.correntista = correntista;
        this.saldo = saldo;
        movimenti = new ArrayList<>();
    }

    public int getIdConto() {
        return idConto;
    }

    public String getCorrentista() {
        return correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setIdConto(int idConto) {
        this.idConto = idConto;
    }
    
    // to do ordinare decrescente
    public List<Operation> getMovimenti() {
        return movimenti;
    }
    
    public void addDeposit(Deposit d){
      movimenti.add(d);
    }
    
    public void addWithdraw (Withdrawal w){
       movimenti.add(w);
    }
    
   
    public List<Deposit> getDeposit(){
     return movimenti.stream().filter(mov -> movimenti.getClass() == Deposit.class).collect(Collectors.toList());
    }
    
    public List<Operation> getWithdrawal(){
      
    }

    @Override
    public String toString() {
        return "Account{" + "idConto=" + idConto + ", correntista=" + correntista + ", saldo=" + saldo + ", movimenti=" + movimenti + '}';
    }

}
