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


/**
 * Created by cristobalvega on 6/24/17.
 */

public class WindowFX {
        public BorderPane rootVentanaCompilador;
        public Stage window;
        public Scene scene;

        public void initGUI(Stage stage) {
            ///////Ventana
            window = stage;
            rootVentanaCompilador = new BorderPane();
            scene = new Scene(rootVentanaCompilador, 1250, 600);
            rootVentanaCompilador.setCenter(WindowFX());

            /////////////////////////////El menu
            MenuBar  menuBar = new MenuBar();

            //////////////////////////////////////Secciones del menu
            Menu ArchivoMenu = new Menu("Archivo");
            Menu EdicionMenu = new Menu("Editar");
            Menu VerMenu = new Menu("Ver");
            Menu AyudaMenu = new Menu("Ayuda");

            ///////////////////////////////////////Items del menu
            MenuItem Item1Archivo = new MenuItem("K onda ");
            MenuItem Item1Edicion = new MenuItem("K onda pa editar ");
            MenuItem Item1Ver = new MenuItem("K onda pa ver ");
            MenuItem Item1Ayuda = new MenuItem("K onda pa ayudar ");

            ///////////////////////////////////////////////////////Agregar Items al menu
            ArchivoMenu.getItems().add(Item1Archivo);
            EdicionMenu.getItems().add(Item1Edicion);
            VerMenu.getItems().add(Item1Ver);
            AyudaMenu.getItems().add(Item1Ayuda);

            /////////////////////////////////////////////////Agregar seccion a la barra de menu
            menuBar.getMenus().addAll(ArchivoMenu,EdicionMenu,VerMenu,AyudaMenu);
            //////////////////////////////////////////////////
            stage.setTitle("VentanaAutomata");
            rootVentanaCompilador.setTop(menuBar);
            stage.setScene(scene);
            window.setResizable(false);
            stage.show();
        }

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
            CodigoTxt.setPrefWidth((int)scene.getWidth());
            CodigoTxt.setPrefHeight((int)scene.getHeight());
            gridpane.add(Salidalbl, 0, 1);
            gridpane.add(ConsolaTxt, 0, 2);
            ConsolaTxt.setPrefHeight((int)scene.getHeight()-300);
            ConsolaTxt.setPrefWidth((int)scene.getWidth());
            root2M.getChildren().addAll(Archivobtn,Edicionbtn,Verbtn,Ayudabtn);
            rootM.getChildren().addAll(root2M,gridpane);



            rootM.setStyle("-fx-background-color: rgba(52,50,54,0.85)");
            Salidalbl.setStyle("-fx-text-fill: white");
            return rootM;


        }//Constructor
}//WindowFX
