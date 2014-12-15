//Justin Struk
package inclassgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class FraMain extends JFrame implements ActionListener {

    public static PanMain panMain = new PanMain();
    public static PanAdd panAdd = new PanAdd();
    public static PanSub panSub = new PanSub();
    public static PanMult panMult = new PanMult();
    public static PanDiv panDiv = new PanDiv();
    public static PanMix panMix = new PanMix();

    public FraMain() {
        panMain.setLayout(null);
        panAdd.setLayout(null);
        panSub.setLayout(null);
        panMult.setLayout(null);
        panDiv.setLayout(null);
        panMix.setLayout(null);
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
        panMult.btnMain.addActionListener(this);
        panDiv.btnMain.addActionListener(this);
        panMix.btnMain.addActionListener(this);
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
        if (evt.getSource() == panMain.btnMult) {
            remove(panMain);
            add(panMult);
            repaint();
            revalidate();
        }
        if (evt.getSource() == panMult.btnMain) {
            remove(panMult);
            add(panMain);
            repaint();
            revalidate();
        }
        if (evt.getSource() == panMain.btnDiv) {
            remove(panMain);
            add(panDiv);
            repaint();
            revalidate();
        }
        if (evt.getSource() == panDiv.btnMain) {
            remove(panDiv);
            add(panMain);
            repaint();
            revalidate();
        }
        if (evt.getSource() == panMain.btnMix) {
            remove(panMain);
            add(panMix);
            repaint();
            revalidate();
        }
        if (evt.getSource() == panMix.btnMain) {
            remove(panMix);
            add(panMain);
            repaint();
            revalidate();
        }
    }
}
