import GUI.Window;
import GUI.WindowFX;
import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * Created by cristobalvega on 6/11/17.
 */
public class Main  extends Application{

    //JavaFX
    WindowFX windowFX = new WindowFX();
    @Override
    public void start(Stage primaryStage) throws Exception {
        windowFX.initGUI(primaryStage);
    }//start

    public static void main (String args[]){
        launch(args);
    }//main

    //SWING
    /*
    public static void main (String args[]){
               //Use an appropriate Look and Feel

        Window window = new Window();
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        //Turn off metal's use bold fonts
        /*UIManager.put("swing.boldMetal", Boolean.FALSE);*/

        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        //javax.swing.SwingUtilities.invokeLater(new Runnable() {
            /*public void run() {
                window.createAndShowGUI();
            }//
        });
    }//main
    */
}//Main
