/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica_proyecto;

import java.util.ArrayList;

/**
 *
 * @author jumbo
 */
public class Aleatorio {
    private ArrayList<Double> aleatorios_entrega;
    private ArrayList<Double> aleatorios_espera;

    public Aleatorio(ArrayList<Double> aleatorios_entrega, ArrayList<Double> aleatorios_espera) {
        this.aleatorios_entrega = aleatorios_entrega;
        this.aleatorios_espera = aleatorios_espera;
    }

    public ArrayList<Double> getAleatorios_entrega() {
        return aleatorios_entrega;
    }

    public void setAleatorios_entrega(ArrayList<Double> aleatorios_entrega) {
        this.aleatorios_entrega = aleatorios_entrega;
    }

    public ArrayList<Double> getAleatorios_espera() {
        return aleatorios_espera;
    }

    public void setAleatorios_espera(ArrayList<Double> aleatorios_espera) {
        this.aleatorios_espera = aleatorios_espera;
    }
    
    
}
