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
public class Cliente implements Serializable{

    private String nombre;
    private String email;
    private String contraseña;

    public Cliente(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    

    public boolean validarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }

    public boolean validarEmail(String email) {
        return this.email.equals(email);
    }

}