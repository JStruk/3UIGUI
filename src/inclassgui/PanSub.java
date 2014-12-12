/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassgui;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author struj3903
 */
class PanSub extends JPanel {
    JButton btnMain = new JButton();
    public PanSub(){
        btnMain.setText("Back To Main!");
        add(btnMain);
    }
}
