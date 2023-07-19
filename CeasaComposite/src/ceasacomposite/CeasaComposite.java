/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ceasacomposite;

import Models.Fruta;
import Models.Verdura;
import Models.Xepa;

/**
 *
 * @author Manoella Borges
 */
public class CeasaComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fruta maca = new Fruta("Maçã", 1.5);
        Verdura alface = new Verdura("Alface", 2.0);
        Xepa caixaFrutas = new Xepa("Caixa de Frutas");
        Xepa caixaVerduras = new Xepa("Caixa de Verduras");
        caixaFrutas.adicionarProduto(maca);
        caixaVerduras.adicionarProduto(alface);

        Xepa caixaMista = new Xepa("Caixa Mista");
        caixaMista.adicionarProduto(caixaFrutas);
        caixaMista.adicionarProduto(caixaVerduras);

        caixaMista.imprimir();
    }
    
}
