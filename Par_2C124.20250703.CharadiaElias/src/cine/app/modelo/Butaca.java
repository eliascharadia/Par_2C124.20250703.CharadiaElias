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
public class Butaca implements Serializable {
    private int numeroButaca;
    private int numero;
    private int fila;
    private boolean estado = false;
    
    public Butaca(int f, int c, int numeroButaca) {
        this.numero = c;
        this.fila = f;
        this.numeroButaca = numeroButaca;
    }

    public int getNumeroButaca() {
        return numeroButaca;
    }
    
    public int getNumero() {
        return numero;
    }

    public int getFila() {
        return fila;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setNumeroButaca(int numeroButaca) {
        this.numeroButaca = numeroButaca;
    }
   
    
}
