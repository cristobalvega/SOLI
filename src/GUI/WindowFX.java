package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;


/**
 * Created by cristobalvega on 6/24/17.
 */

public class WindowFX {
        public BorderPane rootPrincipal;
        public Stage stagePrincipal;
        public Scene scenePrincipal;

    public void initGUI(Stage stage) {
            ///////Ventana
            stagePrincipal = stage;
            rootPrincipal = new BorderPane();
            scenePrincipal = new Scene(rootPrincipal, 1250, 600);
            rootPrincipal.setCenter(WindowFX());

            /////////////////////////////El menu
            MenuBar  menuBar = new MenuBar();

            //////////////////////////////////////Secciones del menu
            Menu menuFile = new Menu("File");
            Menu menuOptions = new Menu("Options");
            Menu menuHelp= new Menu("Help");

            ///////////////////////////////////////Items del menu
            MenuItem menuItemFile1 = new MenuItem("New");
            MenuItem menuItemFile2 = new MenuItem("Open");
            MenuItem menuItemOptions1  = new MenuItem("Compile");
            MenuItem menuItemHelp1 = new MenuItem("About...");
            menuItemHelp1.setOnAction(e->about());

            ///////////////////////////////////////////////////////Agregar Items al menu
            menuFile.getItems().addAll(menuItemFile1,menuItemFile2);
            menuOptions.getItems().add(menuItemOptions1);
            menuHelp.getItems().add(menuItemHelp1);

            /////////////////////////////////////////////////Agregar seccion a la barra de menu
            menuBar.getMenus().addAll(menuFile,menuOptions,menuHelp);
            //////////////////////////////////////////////////
            stage.setTitle("SOLI");
            rootPrincipal.setTop(menuBar);
            stage.setScene(scenePrincipal);
            stagePrincipal.setResizable(false);
            stage.show();
        }//initGUI

    private void about() {
    }//about

    public VBox WindowFX() {

            VBox rootM = new VBox(10);
            HBox root2M = new HBox(20);

            GridPane gridpane = new GridPane();
            gridpane.setPadding(new Insets(10,15,20,15));
            gridpane.setHgap(0);
            gridpane.setVgap(5);


            root2M.setAlignment(Pos.TOP_LEFT);
            root2M.setPadding(new Insets(10, 0, 0, 20));
            rootM.setAlignment(Pos.CENTER);
            gridpane.setAlignment(Pos.CENTER);

            Button Archivobtn = new Button("Archivo");
            Archivobtn.setPrefHeight(80);
            Archivobtn.setPrefWidth(80);

            Button Edicionbtn = new Button("Edicion");
            Edicionbtn.setPrefHeight(80);
            Edicionbtn.setPrefWidth(80);
            Button Verbtn = new Button("Ver");
            Verbtn.setPrefHeight(80);
            Verbtn.setPrefWidth(80);
            Button Ayudabtn = new Button("Ayuda");
            Ayudabtn.setPrefHeight(80);
            Ayudabtn.setPrefWidth(80);
            TextArea CodigoTxt = new TextArea();
            TextArea ConsolaTxt = new TextArea();
            Label Salidalbl = new Label("SALIDA:");
            // rootM.getChildren().addAll(gridpane);
            gridpane.add(CodigoTxt, 0, 0);
            CodigoTxt.setPrefWidth((int)scenePrincipal.getWidth());
            CodigoTxt.setPrefHeight((int)scenePrincipal.getHeight());
            gridpane.add(Salidalbl, 0, 1);
            gridpane.add(ConsolaTxt, 0, 2);
            ConsolaTxt.setPrefHeight((int)scenePrincipal.getHeight()-300);
            ConsolaTxt.setPrefWidth((int)scenePrincipal.getWidth());
            root2M.getChildren().addAll(Archivobtn,Edicionbtn,Verbtn,Ayudabtn);
            rootM.getChildren().addAll(root2M,gridpane);
            rootM.setStyle("-fx-background-color: rgba(52,50,54,0.85)");
            Salidalbl.setStyle("-fx-text-fill: white");
            return rootM;
        }//Constructor
}//WindowFX