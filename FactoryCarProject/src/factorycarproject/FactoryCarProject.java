/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorycarproject;

import FactoryMethod.FactoryMethodCarro;
import Models.Carro;
import javax.swing.JOptionPane;


public class FactoryCarProject {

    
private static void imprimir(Carro objeto)
{
    String saida = "Marca: " + objeto.getMarca() +"\n";
    saida += "Modelo: " + objeto.getModelo() + "\n";
    saida += "Acessorios: " + objeto.getAcessorios() + "\n";
    saida += "Preco: " + objeto.getValorVenda() +"\n";
    saida += "Descicao: " + objeto.descricao() +"\n";
    JOptionPane.showMessageDialog(null, saida);
}
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean controle = true;
        Object[] opcoes ={"CAPTIVA","MAREA","UNO"};
        Object tipoDoCarro;
        Carro obj = null;
        do{
            tipoDoCarro = JOptionPane.showInputDialog(null,
                          "Selecine um modelo",
                          "Simple Factory Method - Carros",
                          JOptionPane.PLAIN_MESSAGE,
                          null,
                          opcoes,"CAPTIVA" );
         obj=FactoryMethodCarro.getCarro(tipoDoCarro.toString());
         imprimir(obj);
        }while(controle);
        
    }
    
}
