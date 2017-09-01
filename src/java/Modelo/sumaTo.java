package Modelo;

import java.io.Serializable;

/**
 *
 * @author Touchier
 */
public class sumaTo implements Serializable{
    sumaBo sum;
    int resultado;
    
    public sumaTo(){
        resultado= 0;
    }
    public void sumaBO(sumaBo suma){
        sum= suma; 
    }
    
    public int suma(){
        resultado= sum.getNumA() + sum.getNumB();
        return resultado;
    }
}
