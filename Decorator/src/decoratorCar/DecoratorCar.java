/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratorCar;

import Models.ArCondicionado;
import Models.Captiva;
import Models.Carro;
import Models.Celta;
import Models.DirecaoEletrica;
import Models.KitTurbo;

/**
 *
 * @author japa
 */
public class DecoratorCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro captiva = new Captiva();
        System.out.println("Carro: " + captiva.getDescricao());
        System.out.println("Preco: R$ " + captiva.preco()); 
        
        captiva=new ArCondicionado(captiva);
        System.out.println("Carro: " + captiva.getDescricao());
        System.out.println("Preco: R$ " + captiva.preco());
        captiva=new KitTurbo(captiva);
        System.out.println("Carro: " + captiva.getDescricao());
        System.out.println("Preco: R$ " + captiva.preco());
        Carro celta = new DirecaoEletrica(new Celta());
        System.out.println("Carro: " + celta.getDescricao());
        System.out.println("Preco: R$ " + celta.preco());
        celta = new DirecaoEletrica(celta);
        System.out.println("Carro: " + celta.getDescricao());
        System.out.println("Preco: R$ " + celta.preco());        
    }
    
}
