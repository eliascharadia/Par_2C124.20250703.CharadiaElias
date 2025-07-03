/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.app.vista;

import cine.app.modelo.Cine;
import cine.app.modelo.Cliente;
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
public class LoginView extends VBox {

    public LoginView(Stage stage, Cine cine) {
        stage.setHeight(300);
        stage.setWidth(300);
        Label lblUser = new Label("Usuario");
        TextField campoUsuario = new TextField();
        Label lblEmail = new Label("Email");
        TextField campoEmail = new TextField();
        Label mensaje = new Label();
        Button btnIngresar = new Button("Ingresar");
        Button btnRegistrarse = new Button("Registrarse");

        Label lblContraseña = new Label("Contraseña");
        PasswordField campoPin = new PasswordField();

        btnIngresar.setOnAction(e -> {
            LogicaLogin.IngresarMenuPrincipal(stage, campoUsuario, campoEmail, campoPin, cine, mensaje);
        });

        btnRegistrarse.setOnAction(e -> {
            LogicaNavegacion.irRagistrarView(stage, cine);
        });

        getChildren().addAll(lblUser, campoUsuario, lblEmail, campoEmail, lblContraseña, campoPin, btnIngresar, mensaje, btnRegistrarse);
    }
}