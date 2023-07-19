/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Manoella Borges
 */
public class AdapterMatematica implements Matematica{

    @Override
    public int potencia(int base, int expoente) {
        return (int)Math.pow(base, expoente);
    }

    @Override
    public int raizQuadrada(int valor) {
        return (int)Math.sqrt(valor);
    }
    
}
