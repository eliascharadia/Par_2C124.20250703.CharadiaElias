/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.app.vista;

import cine.app.modelo.Cine;
import cine.app.modelo.Cliente;
import cine.app.modelo.Sala;
import controlador.LogicaNavegacion;
import java.util.List;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author nemo_
 */
public class SeleccionarSalaView extends VBox{

    public SeleccionarSalaView(Stage stage, Cliente cliente, Cine cine) {
        stage.setHeight(300);
        stage.setWidth(300);
        Button btnSalir = new Button("Volver al menu principal");
        
        List<Sala> salas = cine.getSalas();
        for (Sala sl: salas){
            Button btnSala = new Button("Sala: "+String.valueOf(sl.getNumero()));
            Label nombrePelicula = new Label("Pelicula: " + sl.getPelicula());
            
            btnSala.setOnAction(e -> {
                switch (sl.getNumero()) {
                    case 1:
                        SalaView salaview = new SalaView(stage,cliente,cine,sl);
                        stage.setScene(new Scene(salaview));
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
            });
            
            getChildren().addAll(nombrePelicula,btnSala);
        }
        
        
        btnSalir.setOnAction(e -> {
            LogicaNavegacion
        });
//        Label bienvenida = new Label("Bienvenido al Cine");
//        Button btnVerSala = new Button("Ver sala");
//        
//        Button btnSalir = new Button("Salir");
//        
//        btnVerSala.setOnAction(e -> {
//            
//        });
//        
//        
//        
//        btnSalir.setOnAction( e -> {
//            LoginView login = new LoginView(stage, cine);
//            stage.setScene(new Scene(login));
//        });
//        
        getChildren().addAll(btnSalir);
    }
}