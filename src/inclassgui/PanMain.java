/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassgui;

import java.awt.CardLayout;
import java.awt.MenuComponent;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author struj3903
 */
class PanMain extends JPanel implements ActionListener {

    JLabel lblTitle = new JLabel();
    JButton btnAdd = new JButton();
    JButton btnSub = new JButton();
    JButton btnMult = new JButton();
    JButton btnDiv = new JButton();
    JButton btnMix = new JButton();
    public PanMain() {
        btnAdd.setText("Addition! :)");
        btnAdd.setBounds(10, 10, 20, 20);
        add(btnAdd);
        btnSub.setText("Subtraction! :)");
        add(btnSub);
        btnMult.setText("Mulitplication! :)");
        add(btnMult);
        btnDiv.setText("Division! :)");
        add(btnDiv);
        btnMix.setText("Mix 'em! :)");
        add(btnMix);
    }

    public void actionPerformed(ActionEvent evt) {
      
    }
}
