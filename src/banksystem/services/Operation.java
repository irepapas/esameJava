/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem.services;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author tss
 */
public abstract class Operation {
    
    private final LocalDate data;
    private final double importo;

    public Operation(LocalDate data,double importo) {
        this.data = data;

        this.importo = importo;
    }


    public double getImporto() {
        return importo;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.data);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.importo) ^ (Double.doubleToLongBits(this.importo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Operation other = (Operation) obj;
        if (Double.doubleToLongBits(this.importo) != Double.doubleToLongBits(other.importo)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Operation{" + "data=" + data + ", importo=" + importo + '}';
    }
    
    
    
    
}
