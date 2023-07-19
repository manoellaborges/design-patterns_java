/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Manoella Borges
 */
public class Calculadora implements Matematica{

    @Override
    public int potencia(int base, int expoente) {
        int valor = 1;
        for(int n=0; n<expoente;n++)
            valor=valor*base;
        return valor;
        
    }

    @Override
    public int raizQuadrada(int valor) {
        int num=valor;
        int raiz=0;
        int impar=1;
        
        while(num>=impar){
            num=num-impar;
            impar+=2;
            raiz++;
        }
        
        return raiz;
    }
    
}
