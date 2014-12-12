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
        btnAdd.setBounds(30, 50, 100, 20);
        add(btnAdd);
        btnSub.setText("Subtraction! :)");
        btnSub.setBounds(130, 50, 115, 20);
        add(btnSub);
        btnMult.setText("Mulitplication! :)");
        btnMult.setBounds(245, 50, 125, 20);
        add(btnMult);
        btnDiv.setText("Division! :)");
        btnDiv.setBounds(365, 50, 100, 20);
        add(btnDiv);
        btnMix.setText("Mix 'em! :)");
        btnMix.setBounds(200, 90, 120, 30);
        add(btnMix);
    }

    public void actionPerformed(ActionEvent evt) {
      
    }
}
