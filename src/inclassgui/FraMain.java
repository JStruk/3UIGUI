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
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FraMain extends JFrame {

    public static PanMain panMain = new PanMain();
    public static PanAdd panAdd = new PanAdd();

    public FraMain() {
        setVisible(true);
        setTitle("JUDDY @ GUI");
        setSize(500, 500);
        add(panMain);
        //  PanAdd panadd = new PanAdd();
        //  add(panadd);
    }
}
