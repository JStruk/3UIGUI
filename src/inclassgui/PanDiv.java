/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassgui;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Justin
 */
public class PanDiv extends JPanel {

    JButton btnMain = new JButton();

    public PanDiv() {
        btnMain.setText("Back To Main!");
        add(btnMain);
    }
}
