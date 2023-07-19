/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractcarros.Factory;

import abstractcarros.Models.Carros.Captiva;
import abstractcarros.Models.Carros.Carro;
import abstractcarros.Models.Carros.Marea;
import abstractcarros.Models.Carros.Uno;

/**
 *
 * @author japa
 */
public class CarrosAbstractFactory {
    public enum Carros{
        CAPTIVA, MAREA, UNO;
    }
    
    ImpostosAbstractFactory impostos;
    
    public Carro getCarro(String tipoCarro,String modelo, String marca, String acessorios, float valorVenda, String estado )
    {
        Carros tipo = Carros.valueOf(tipoCarro);
        this.impostos=geraImpostos(estado);
        switch(tipo)
        {
            case CAPTIVA:
                return new Captiva(impostos,modelo, marca, acessorios, valorVenda);
            case MAREA:
                return new Marea(impostos,modelo, marca, acessorios, valorVenda);
            case UNO:
                return new Uno(impostos,modelo, marca, acessorios, valorVenda);
            default: 
                return null;
        }
    }
    
    public ImpostosAbstractFactory geraImpostos(String estado)
    {
        if (estado.equals("goias"))
            return new ImpostosGoiasAbstractFactory();
        else if (estado.equals("para"))
             return new ImpostosParaAbstractFactory();
        else
            return null;
    }
}
