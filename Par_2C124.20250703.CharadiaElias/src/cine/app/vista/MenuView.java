/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.app.vista;

import cine.app.modelo.Cine;
import cine.app.modelo.Cliente;
import controlador.LogicaNavegacion;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author nemo_
 */
public class MenuView extends VBox{

    public MenuView(Stage stage, Cliente cliente, Cine cine) {
        stage.setHeight(300);
        stage.setWidth(300);
        Label bienvenida = new Label("Bienvenido al Cine");
        Button btnVerSala = new Button("Ver sala");
        
        Button btnSalir = new Button("Salir");
        
        btnVerSala.setOnAction(e -> {
            LogicaNavegacion.irSeleccionarSala(stage, cliente, cine);
        });
        
        
        
        btnSalir.setOnAction(e -> {
            LogicaNavegacion.Salir(stage, cine);
        });
        
        getChildren().addAll(bienvenida, btnVerSala, btnSalir);
    }
}