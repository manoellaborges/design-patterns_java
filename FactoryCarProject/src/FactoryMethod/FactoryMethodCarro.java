/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import Models.Captiva;
import Models.Carro;
import Models.Marea;
import Models.Uno;

/**
 *
 * @author japa
 */
public class FactoryMethodCarro {
    public enum Carros{
        CAPTIVA,MAREA,UNO;
    }
    
    public static Carro getCarro(String tipoCarro){
        Carros tipo = Carros.valueOf(tipoCarro);
        switch (tipo)
        {
            case CAPTIVA:
                   return new Captiva("Captiva AWD","GM","Direcao Mecanica, Ar Condicionado, Cabio manual",120450.67F);
            case MAREA:
                   return new Marea("HLX","FIAT","Direcao Deus na causa, c4, Cabio manual",10.67F);
            case UNO:
                  return new Uno("Mille","FIAT","Direcao Hiraulica, Turbo, Cabio manual",20450.67F);
        }
        
        return null;
    }
}
