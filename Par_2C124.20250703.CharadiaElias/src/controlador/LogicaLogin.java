/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import cine.app.modelo.Cine;
import cine.app.modelo.Cliente;
import cine.app.vista.MenuView;
import cine.app.vista.RegistrarUsuarioView;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author nemo_
 */
public class LogicaLogin {

    private static String capturarTexto(TextField campo) {
        return campo.getText();
    }
    
    private static Cliente buscarCliente(TextField nombre, TextField email, TextField contraseña, Cine cine){
        Cliente cliente = cine.buscarCliente(capturarTexto(email), capturarTexto(contraseña));
        return cliente;
    }
    
    public static void IngresarMenuPrincipal(Stage stage,TextField nombre, TextField email, TextField contraseña, Cine cine, Label mensaje){
        Cliente cliente = buscarCliente(nombre, email,contraseña,cine);
        if (cliente != null ){
            LogicaNavegacion.irMenuView(stage, cliente, cine);
            } else {
                mensaje.setText("Usuario o PIN incorrecto");
            }
        }
    
        
    public static void registrarUsuario(TextField nombre,TextField email,TextField contraseña, Cine cine, Label resultado){
        Cliente nuevoCliente = new Cliente(capturarTexto(nombre),capturarTexto(email),capturarTexto(contraseña));
        cine.getClientes().add(nuevoCliente);
        resultado.setText("Se ha registrado exitosamente");
    }
    
   
    
    }

