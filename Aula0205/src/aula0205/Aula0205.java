/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0205;

import Models.AdapterMatematica;
import Models.Calculadora;
import Models.Matematica;

/**
 *
 * @author Manoella Borges
 */
public class Aula0205 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=9;
        int base=25;
        int expoente=2;
        
        Matematica calc = new Calculadora(); //Adapter - uma classe que implementa uma interface e na hora de usar a classe, retorna a interface e não o objeto da classe.
        
        System.out.println("Raiz: " + calc.raizQuadrada(numero));
        System.out.println("25^2= " + calc.potencia(25, 2));
        
        
        Matematica calc2 = null;
        calc2=new AdapterMatematica();
        
        System.out.println("Raiz: " + calc2.raizQuadrada(numero));
        System.out.println("25^2= " + calc2.potencia(25, 2));
    }
    
}
