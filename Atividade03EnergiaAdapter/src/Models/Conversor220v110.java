/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Manoella Borges
 */
public class Conversor220v110 extends Voltagem110 {
    private Voltagem220 voltagem220;

    public Conversor220v110(Voltagem220 voltagem220) {
        this.voltagem220 = voltagem220;
    }

    @Override
    public String getEnergia110() {
        return "110v";
    }

    public Voltagem110 converte() {
        return new Conversor220v110(voltagem220);
    }
}

