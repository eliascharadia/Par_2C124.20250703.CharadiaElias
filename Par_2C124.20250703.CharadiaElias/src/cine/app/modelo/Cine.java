/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.app.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nemo_
 */
public class Cine implements Serializable{
    private List<Sala> salas;
    private List<Entrada> entradas;
    private List<Cliente> clientes;

    public Cine() {
        this.salas = new ArrayList<>();
        this.entradas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public Cliente buscarCliente(String email, String contraseña){
        for (Cliente cl: clientes){
            if (cl.validarEmail(email) && cl.validarContraseña(contraseña)){
                return cl;
            }
        }
        return null;
    }
    
    public void agregarSala(int numero, String pelicula, int filas, int columnas){
        this.salas.add(new Sala(numero,pelicula,filas,columnas));
    }
    
    public void agregarEntrada(Cliente cliente, Sala sala, Butaca butaca){
        this.entradas.add(new Entrada(cliente, sala, butaca));
    }
}
