/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import cine.app.modelo.Cine;
import cine.app.modelo.Cliente;
import cine.app.modelo.Sala;
import cine.app.vista.LoginView;
import cine.app.vista.MenuView;
import cine.app.vista.RegistrarUsuarioView;
import cine.app.vista.SalaView;
import cine.app.vista.SeleccionarSalaView;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author nemo_
 */
public class LogicaNavegacion {
    public static void Salir(Stage stage, Cine cine){
        LoginView login = new LoginView(stage, cine);
        stage.setScene(new Scene(login));
    }
    
    public static void irSeleccionarSala(Stage stage, Cliente cliente, Cine cine){
        SeleccionarSalaView slsala = new SeleccionarSalaView(stage,cliente,cine);
        stage.setScene(new Scene(slsala));
    }
    
    public static void irMenuView(Stage stage, Cliente cliente, Cine cine){
        MenuView menu = new MenuView(stage, cliente, cine);
        stage.setScene(new Scene(menu));
    }
    
    public static void irRagistrarView(Stage stage, Cine cine){
         RegistrarUsuarioView ventanaRegistro = new RegistrarUsuarioView(stage, cine);
        stage.setScene(new Scene(ventanaRegistro));
    }
    
    public static void irSalaView(Stage stage, Cliente cliente, Cine cine, Sala sl){
        SalaView salaview = new SalaView(stage,cliente,cine,sl);
        stage.setScene(new Scene(salaview));
    }
}
