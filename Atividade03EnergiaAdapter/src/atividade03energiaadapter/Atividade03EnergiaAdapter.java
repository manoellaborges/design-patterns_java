/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade03energiaadapter;

import Models.ArCondicionado;
import Models.Conversor220v110;
import Models.Voltagem110;
import Models.Voltagem220;

/**
 *
 * @author Manoella Borges
 */
public class Atividade03EnergiaAdapter {

    //comparar as duas strings get energia, pq com os objetos não está dando
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Voltagem110 voltagem110 = new Voltagem110();
        Voltagem220 voltagem220 = new Voltagem220();
        
        ArCondicionado arCondicionado = new ArCondicionado(new Voltagem110());
        
        if (arCondicionado.testeLigacao(voltagem110)) {
        System.out.println("Ligue");
    }

    // comentado porque não vai compilar
    //if (arCondicionado.testeLigacao(voltagem220)) {
    //    System.out.println("Ligue");
    //}

    Conversor220v110 conversor = new Conversor220v110(voltagem220);

    if (arCondicionado.testeLigacao(conversor.converte())) {
        System.out.println("Ligue");
    }
        
        
    }
    
}
