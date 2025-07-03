/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.app.vista;

import cine.app.modelo.Cine;
import controlador.LogicaLogin;
import controlador.LogicaNavegacion;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author nemo_
 */
public class RegistrarUsuarioView extends VBox{
     public RegistrarUsuarioView(Stage stage,Cine cine){
         stage.setHeight(300);
        stage.setWidth(300);
         Label nombreUsuario = new Label("nombreUsuario");
         Label contraseñaUsuario = new Label("contraseña");
         Label emailUsuario = new Label("Email");
         TextField campoNombreUsuario = new TextField();
         TextField campoEmailUsuario = new TextField();
         PasswordField campoContraseñaUsuario = new PasswordField();
         Button registrar = new Button("Registrar");
         Button salir = new Button("Salir");
         Label resultado = new Label();
         
         registrar.setOnAction(e -> {
             LogicaLogin.registrarUsuario(campoNombreUsuario, campoEmailUsuario, campoContraseñaUsuario, cine, resultado);
         });
         
         salir.setOnAction(e -> {
             LogicaNavegacion.Salir(stage, cine);
         });
         
         getChildren().addAll(nombreUsuario,campoNombreUsuario,emailUsuario,campoEmailUsuario,contraseñaUsuario,campoContraseñaUsuario,registrar,resultado, salir);
     }
}