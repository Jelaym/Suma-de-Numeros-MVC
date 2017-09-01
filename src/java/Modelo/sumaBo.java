package Modelo;

import java.io.Serializable;

/**
 *
 * @author Touchier
 */
public class sumaBo implements Serializable{
    int numA;
    int numB;
    /* Constructor */
    public sumaBo(){
        numA= 0;
        numB= 0;
    }
    /* Metodos para dar y/o recibir variables / parametros */
    public void setNumA(int num){
        this.numA= num;
    }
    public void setNumB(int num){
        this.numB= num;
    }
    
    public int getNumA(){
        return this.numA;
    }
    public int getNumB(){
        return this.numB;
    }
}
