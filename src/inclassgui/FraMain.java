/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassgui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FraMain extends JFrame implements ActionListener {

    public static PanMain panMain = new PanMain();
    public static PanAdd panAdd = new PanAdd();
    public static PanSub panSub = new PanSub();

    public FraMain() {
        setVisible(true);
        setTitle("JUDDY @ GUI");
        setSize(500, 500);
        add(panMain);
        panMain.setVisible(true);
        panMain.btnAdd.addActionListener(this);
        panMain.btnSub.addActionListener(this);
        panMain.btnDiv.addActionListener(this);
        panMain.btnMult.addActionListener(this);
        panMain.btnMix.addActionListener(this);
        panAdd.btnMain.addActionListener(this);
        panSub.btnMain.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == panMain.btnAdd) {
            remove(panMain);
            add(panAdd);
            repaint();
            revalidate();
        }
        if (evt.getSource() == panAdd.btnMain) {
            remove(panAdd);
            add(panMain);
            repaint();
            revalidate();
        }
        if (evt.getSource() == panMain.btnSub) {
            remove(panMain);
            add(panSub);
            repaint();
            revalidate();
        }
        if (evt.getSource() == panSub.btnMain) {
            remove(panSub);
            add(panMain);
            repaint();
            revalidate();
        }
    }
}
