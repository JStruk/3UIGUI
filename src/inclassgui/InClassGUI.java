/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassgui;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author struj3903
 */
public class InClassGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FraMain frame = new FraMain();
       // frame.setLayout(null);
        //  frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
