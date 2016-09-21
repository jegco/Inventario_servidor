/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica_controladores;

import Interfaces.Demanda;
import Logica_proyecto.Aleatorio;
import Logica_proyecto.Mayorista;
import java.rmi.RemoteException;

/**
 *
 * @author jumbo
 */
public class Inventario implements Interfaces.Interface_inventario{
    private Mayorista mayorista;
    private Aleatorio aleatorios;
    private int aleatorio_n;
    private int clientes;
    private int minoristas_actuales;

    public Inventario(Mayorista mayorista, Aleatorio aleatorios) {
        this.mayorista = mayorista;
        this.aleatorios = aleatorios;
        this.aleatorio_n=0;
        this.clientes=0;
        this.minoristas_actuales=0;
    }

    public Mayorista getMayorista() {
        return mayorista;
    }

    public void setMayorista(Mayorista mayorista) {
        this.mayorista = mayorista;
    }

    public Aleatorio getAleatorios() {
        return aleatorios;
    }

    public void setAleatorios(Aleatorio aleatorios) {
        this.aleatorios = aleatorios;
    }

    public int getAleatorio_n() {
        return aleatorio_n;
    }

    public void setAleatorio_n(int aleatorio_n) {
        this.aleatorio_n = aleatorio_n;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public int getMinoristas_actuales() {
        return minoristas_actuales;
    }

    public void setMinoristas_actuales(int minoristas_actuales) {
        this.minoristas_actuales = minoristas_actuales;
    }
    
    
    
    
    
    @Override
    public void hacer_pedido(int demanda,int espera) throws RemoteException {
        mayorista.getGasto().setInventario(mayorista.getGasto().getInventario()-demanda);
        if(espera>=0)
            mayorista.getGasto().setGastos(mayorista.getGasto().getGastos()+espera*50);
        else
            mayorista.getGasto().setGastos(mayorista.getGasto().getGastos()+-1*espera*100);
        clientes++;
        if(clientes>=minoristas_actuales) mayorista.setDia(mayorista.getDia()+1);
        if(mayorista.getGasto().getInventario()<=mayorista.getGasto().getReorden()){
            mayorista.getGasto().setGastos(mayorista.getGasto().getGastos()+100);
            mayorista.getGasto().setInventario(mayorista.getGasto().getInventario()+mayorista.getGasto().getReorden());
        }
    }
    @Override
    public int total_clintes() throws RemoteException{
        return minoristas_actuales;
    }

    @Override
    public int espera(boolean decision) throws RemoteException {
        int entrega=mayorista.getGen_entrega().dias_entrega(aleatorios.getAleatorios_entrega().get(aleatorio_n));
        return entrega;
    }

    
    
}
