/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.app.modelo;

import java.io.Serializable;

/**
 *
 * @author nemo_
 */
public class Entrada implements Serializable{
    private Cliente cliente;
    private Sala sala;
    private Butaca butaca;

    public Entrada(Cliente cliente, Sala sala, Butaca butaca) {
        this.cliente = cliente;
        this.sala = sala;
        this.butaca = butaca;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Sala getSala() {
        return sala;
    }

    public Butaca getButaca() {
        return butaca;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }
    
    
}
