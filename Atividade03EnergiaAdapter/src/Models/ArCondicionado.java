/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Manoella Borges
 */
public class ArCondicionado {
    private Voltagem110 ligacao;

    public ArCondicionado(Voltagem110 ligacao) {
        this.ligacao = ligacao;
    }

    public Voltagem110 getLigacao() {
        return ligacao;
    }

    public void setLigacao(Voltagem110 ligacao) {
        this.ligacao = ligacao;
    }
    
    public boolean testeLigacao(Voltagem110 energia){
       if(energia.getEnergia110().equals("110v")){
           return true;
       }else{
           return false;
       }
        
    }
}
