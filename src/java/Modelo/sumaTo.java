package Modelo;

import java.io.Serializable;

/**
 *
 * @author Touchier
 */
public class sumaTo implements Serializable{
    sumaBo sum;
    int resultado;
    /* Metodo Constructor */
    public sumaTo(){
        resultado= 0;
    }
    //Traemos los datos
    public void sumaBO(sumaBo suma){
        sum= suma; 
    }
    //Procesa y devuelve el dato final
    public int suma(){
        resultado= sum.getNumA() + sum.getNumB();
        return resultado;
    }
}
