/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.app.vista;

import cine.app.modelo.Butaca;
import cine.app.modelo.Cine;
import cine.app.modelo.Cliente;
import cine.app.modelo.Entrada;
import cine.app.modelo.Sala;
import controlador.LogicaNavegacion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author nemo_
 */
public class SalaView extends VBox {

    public SalaView(Stage stage, Cliente cliente, Cine cine, Sala sala) {
        stage.setHeight(350);
        stage.setWidth(300);
        int numerButaca = 0;
        Label nombrePelicula = new Label("Funcion para: " + sala.getPelicula());
        Label ingreseButaca = new Label("Ingrese el numero de la butaca: ");
        TextField campoIngresarNumeroButaca = new TextField();
        Button confirmarCompra = new Button("Confirmar compra");
        Button salir = new Button("Salir");
        Label compraExitosa = new Label();
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5); // Espacio horizontal entre celdas
        gridPane.setVgap(5); // Espacio vertical entre celdas
        List<Butaca> listaButacas = new ArrayList<>();
// Llenar el GridPane con Labels
        System.out.println(Arrays.toString(sala.getButacas()));
        for (int i = 0; i < sala.getButacas().length; i++) {
            for (int j = 0; j < sala.getButacas().length; j++) {
                numerButaca += 1;
                Butaca but = new Butaca(i, j, numerButaca);
                if (listaButacas.size() != (sala.getButacas().length * sala.getButacas().length)) {
                    listaButacas.add(but);
                   
                }

                Label label = new Label(but.isEstado() ? "[ X ]" : "[ " + numerButaca + " ]");
                // Opcional: agregar estilo
                label.setStyle("-fx-border-color: black; -fx-padding: 5px;");

                // Agregar el Label al GridPane (fila, columna)
                gridPane.add(label, j, i + 1);

            }
        }

        confirmarCompra.setOnAction(e -> {
            int nButaca = Integer.parseInt(campoIngresarNumeroButaca.getText());
            for (Butaca but : listaButacas) {
                System.out.println(but.getNumeroButaca());
                if (but.getNumeroButaca() == nButaca) {
                    but.setEstado(true);
                    cine.agregarEntrada(cliente, sala, but);
                    compraExitosa.setText("Compra exitosa!");
                    break;
                }
            }

            //                    Entrada nuevaEntrada = new Entrada(cliente,sala,but);
        });

        salir.setOnAction(e -> {
            LogicaNavegacion.irMenuView(stage, cliente, cine);
        });

// Agregar el GridPane a tu escena
        getChildren().addAll(nombrePelicula, gridPane, ingreseButaca, campoIngresarNumeroButaca, confirmarCompra, compraExitosa, salir);

    }
}
