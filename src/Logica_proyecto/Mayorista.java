/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica_proyecto;

import logica_generadores.Generador_demanda;
import logica_generadores.Generador_entrega;
import logica_generadores.Generador_espera;

/**
 *
 * @author jumbo
 */
public class Mayorista {
    private Gasto gasto;
    private int corrida;
    private Generador_entrega gen_entrega;
    private Generador_espera gen_espera;
    private Generador_demanda gen_demanda;
    private int dia;

    public Mayorista(Gasto gasto, int corrida) {
        this.gasto = gasto;
        this.corrida = corrida;
        this.dia=0;
        gen_demanda=new Generador_demanda();
        gen_entrega=new Generador_entrega();
        gen_espera=new Generador_espera();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    

    public Generador_entrega getGen_entrega() {
        return gen_entrega;
    }

    public void setGen_entrega(Generador_entrega gen_entrega) {
        this.gen_entrega = gen_entrega;
    }

    public Generador_espera getGen_espera() {
        return gen_espera;
    }

    public void setGen_espera(Generador_espera gen_espera) {
        this.gen_espera = gen_espera;
    }

    public Generador_demanda getGen_demanda() {
        return gen_demanda;
    }

    public void setGen_demanda(Generador_demanda gen_demanda) {
        this.gen_demanda = gen_demanda;
    }
    

    public Gasto getGasto() {
        return gasto;
    }

    public void setGasto(Gasto gasto) {
        this.gasto = gasto;
    }

    public int getCorrida() {
        return corrida;
    }

    public void setCorrida(int corrida) {
        this.corrida = corrida;
    }
    
    
}
