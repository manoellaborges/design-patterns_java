/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractcarros.Factory;

import abstractcarros.Models.Carros.Impostos.Impostos;
import abstractcarros.Models.Carros.Impostos.ImpostosGoias;

/**
 *
 * @author japa
 */
public class ImpostosGoiasAbstractFactory implements ImpostosAbstractFactory {

    @Override
    public Impostos getImpostos() {
        return new ImpostosGoias();
    }
    
}
