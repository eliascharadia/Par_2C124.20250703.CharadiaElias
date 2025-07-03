/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_2c124.pkg20250703.charadiaelias;

import cine.app.modelo.Cine;
import cine.app.persistencia.PersistenciaDatos;
import cine.app.vista.LoginView;
import com.sun.tools.javac.Main;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author nemo_
 */
public class Par_2C12420250703CharadiaElias extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Cine cine = PersistenciaDatos.cargarEstado();
        if(cine.getSalas().isEmpty()){
            cine.agregarSala(1,"Como entrenara tu dragon",4,4);
            cine.agregarSala(2,"F1: la pelicua",4,4);
            cine.agregarSala(3,"Sinners",4,4);
        }
        
        
        LoginView login = new LoginView(stage, cine);
        stage.setScene(new Scene(login));
        stage.setTitle("Cajero - Inicio de sesión");
        
        // Guardar al salir
        stage.setOnCloseRequest(eh -> {
            try {
                PersistenciaDatos.guardarEstado(cine);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        stage.show();
    }
    
}
