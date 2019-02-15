## Ejercicio realizado en IntelliJ con JavaFX que nos permite mediante un control con 4 botones escoger el periodico del cual mostraremos los titulares y sus respectivos enlaces dentro de un TextArea.

``` java

//CLASE MAIN

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Choose your Newspaper");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

// CONTROLLER

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.text.html.ImageView;

public class Controller {

    @FXML
    private TextArea area;
    @FXML
    private Button bttPais;
    @FXML
    private Button bttRazon;
    @FXML
    private Button bttBenissa;
    @FXML
    private Button bttMarca;
    @FXML
    private Pane MainPane;

    @FXML
    void buscarElPais(ActionEvent event) {

        String lineasPeriodico = "";

        try {
            // Asignamos el documento sobre una HTTP
            Document doc = Jsoup.connect("http://www.elpais.com").get();

            // Extraemos los titulos de los documentos que hay para descargar en la pagina
            String title = doc.title();
            lineasPeriodico += "Título: "+title+"\n";

            //conseguimos todos los link de descarga de la pagina
            Elements links = doc.select("a[href]");
            for (Element link :links)
            {
                lineasPeriodico += "Link: "+link.attr("href")+"\n" ;
                lineasPeriodico += "Texto: "+link.text()+"\n" ;

            }
            area.setText(lineasPeriodico);
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println("Error en la extracción de datos:\n");e.printStackTrace();
        }

    }

    @FXML
    void buscarLaRazon(ActionEvent event) {

        String lineasPeriodico = "";
        try {
            // Asignamos el documento sobre una HTTP
            Document doc = Jsoup.connect("http://www.larazon.es").get();

            // Extraemos los titulos de los documentos que hay para descargar en la pagina
            String title = doc.title();
            lineasPeriodico += "Título: "+title+"\n";

            //conseguimos todos los link de descarga de la pagina
            Elements links = doc.select("a[href]");
            for (Element link :links)
            {
                lineasPeriodico += "Link: "+link.attr("href")+"\n" ;
                lineasPeriodico += "Texto: "+link.text()+"\n" ;

            }
            area.setText(lineasPeriodico);
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println("Error en la extracción de datos:\n");e.printStackTrace();
        }

    }

    @FXML
    void buscarBenissaDigital(ActionEvent event) {

        String lineasPeriodico = "";
        try {
            // Asignamos el documento sobre una HTTP
            Document doc = Jsoup.connect("http://www.benissadigital.es").get();

            // Extraemos los titulos de los documentos que hay para descargar en la pagina
            String title = doc.title();
            lineasPeriodico += "Título: "+title+"\n";

            //conseguimos todos los link de descarga de la pagina
            Elements links = doc.select("a[href]");
            for (Element link :links)
            {
                lineasPeriodico += "Link: "+link.attr("href")+"\n" ;
                lineasPeriodico += "Texto: "+link.text()+"\n" ;

            }
            area.setText(lineasPeriodico);
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println("Error en la extracción de datos:\n");e.printStackTrace();
        }
    }

    @FXML
    void buscarElMarca(ActionEvent event) {

        String lineasPeriodico = "";
        try {
            // Asignamos el documento sobre una HTTP
            Document doc = Jsoup.connect("http://www.marca.com").get();

            // Extraemos los titulos de los documentos que hay para descargar en la pagina
            String title = doc.title();
            lineasPeriodico += "Título: "+title+"\n";

            //conseguimos todos los link de descarga de la pagina
            Elements links = doc.select("a[href]");
            for (Element link :links)
            {
                lineasPeriodico += "Link: "+link.attr("href")+"\n" ;
                lineasPeriodico += "Texto: "+link.text()+"\n" ;

            }
            area.setText(lineasPeriodico);
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println("Error en la extracción de datos:\n");e.printStackTrace();
        }
    }

}

// SAMPLE.FXML

<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.TextArea?>
<?import javafx.scene.control.ToolBar?>
<?import javafx.scene.image.ImageView?>
<?import javafx.scene.layout.BorderPane?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.text.Font?>

<BorderPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="600.0" prefWidth="800.0" xmlns="http://javafx.com/javafx/8.0.172-ea" xmlns:fx="http://javafx.com/fxml/1" fx:controller="sample.Controller">
   <top>
      <Pane fx:id="mainPane" maxHeight="650.0" maxWidth="800.0" minHeight="600.0" minWidth="800.0" prefHeight="600.0" prefWidth="800.0" BorderPane.alignment="CENTER">
         <children>
            <ToolBar layoutX="131.0" layoutY="60.0" prefHeight="57.0" prefWidth="538.0">
              <items>
                <Button fx:id="bttPais" mnemonicParsing="false" onAction="#buscarElPais" text="El Pais">
                     <font>
                        <Font name="Ringbearer Medium" size="20.0" />
                     </font></Button>
                  <Button fx:id="bttRazon" mnemonicParsing="false" onAction="#buscarLaRazon" text="La Razon">
                     <font>
                        <Font name="Ringbearer Medium" size="20.0" />
                     </font></Button>
                  <Button fx:id="bttMarca" mnemonicParsing="false" onAction="#buscarElMarca" text="El Marca">
                     <font>
                        <Font name="Ringbearer Medium" size="20.0" />
                     </font></Button>
                  <Button fx:id="bttBenissa" mnemonicParsing="false" onAction="#buscarBenissaDigital" text="Benissa Digital">
                     <font>
                        <Font name="Ringbearer Medium" size="20.0" />
                     </font></Button>
              </items>
            </ToolBar>
            <Label alignment="CENTER" layoutX="146.0" text="CHOOSE  YOUR  NEWSPAPER ">
               <font>
                  <Font name="Ringbearer Medium" size="36.0" />
               </font>
            </Label>
            <TextArea fx:id="area" layoutX="14.0" layoutY="130.0" prefHeight="453.0" prefWidth="772.0" />
            <ImageView fx:id="imagen" fitHeight="223.0" fitWidth="200.0" layoutX="586.0" layoutY="130.0" pickOnBounds="true" preserveRatio="true" />
         </children>
      </Pane>
   </top>
</BorderPane>

```
