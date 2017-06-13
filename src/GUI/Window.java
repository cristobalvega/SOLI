package GUI;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Created by cristobalvega on 6/13/17.
 */
public class Window extends JFrame {

    JButton buttonNew,buttonOpen,buttonCompile;
    GridBagLayout gbl;

    public Window() {
        super("SOLI");
        setLayout(new FlowLayout());

        buttonNew = new JButton("New");
        buttonOpen = new JButton("Open");
        buttonCompile = new JButton("Complile");

        add(buttonNew);
        add(buttonOpen);
        add(buttonCompile);

        setVisible(true);
        setSize(800, 600);
        setDefaultCloseOperation(3);
        show();
    }//Constructor

}//Class
