/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_2c124.pkg20250703.charadiaelias;

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
        Label etiqueta = new Label();
        TextField ingreso = new TextField();
        Button boton = new Button("Haz click");
                
        VBox layout = new VBox();
        Scene escena = new Scene(layout,300,200);
        
        etiqueta.setText("Hola");
        layout.getChildren().addAll(etiqueta,ingreso,boton);
        
        stage.setScene(escena);
        stage.show();
    }
    
}
