/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractcarros;

import abstractcarros.Factory.CarrosAbstractFactory;
import abstractcarros.Models.Carros.Carro;

/**
 *
 * @author japa
 */
public class AbstractCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarrosAbstractFactory fabrica = new CarrosAbstractFactory();
        Carro carro1,carro2;
        carro1=fabrica.getCarro("MAREA", "ESX", "FIAT", "AR CONDICIONADO", 20000, "goias");
        carro2=fabrica.getCarro("UNO", "MILLE", "FIAT", "DIRECAO HID.", 30000, "para");
        System.out.println(carro1.descricao());
        System.out.println("");
        System.out.println(carro2.descricao());
    }
    
}
