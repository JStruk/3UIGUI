/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassgui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author struj3903
 */
class PanAdd extends JPanel implements ActionListener {

    JTextField txtIn = new JTextField(10);
    String sText;
    JButton btnOut = new JButton();
    JLabel lblJuds = new JLabel();
    JLabel lblNum1 = new JLabel();
    JLabel lblNum2 = new JLabel();
    JLabel lblOp = new JLabel();
    JLabel lblCorrect = new JLabel("Correct!");
    JLabel lblWrong = new JLabel("Wrong :(");
    JLabel lblScore = new JLabel();
    JLabel lblTotal = new JLabel();
    JLabel lblFinal = new JLabel();
    JButton btnMain = new JButton();
    int nAns, nScore = 0, nTotal = 0;
    int n1, n2;
    String sN1 = "", sN2 = "", sScore = "", sTotal = "";
    JLabel lblOut = new JLabel();

    public PanAdd() {
        btnMain.setText("Back To Main!");
        add(btnMain);
        lblJuds.setText("JUDDY>BEEEEMER ;)");
        lblJuds.setBounds(100, 100, 20, 20);
        lblJuds.setFont(new Font("Serif", Font.PLAIN, 45));
        lblJuds.setForeground(Color.BLACK);
        //    add(lblJuds);
        add(txtIn);
        n1 = (int) (Math.random() * 10);
        n2 = (int) (Math.random() * 10);
        nAns = n1 + n2;
        sN1 += (n1);
        sN2 += (n2);
        lblNum1.setText(sN1);
        add(lblNum1);
        lblOp.setText(" + ");
        add(lblOp);
        lblNum2.setText(sN2);
        add(lblNum2);
        lblCorrect.setBounds(300, 100, 20, 20);
        lblCorrect.setFont(new Font("Serif", Font.PLAIN, 30));
        lblWrong.setBounds(300, 100, 20, 20);
        lblWrong.setFont(new Font("Serif", Font.PLAIN, 30));
        txtIn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        int nUser;
        String sWord = txtIn.getText();
        nUser = (int) Integer.parseInt(sWord);
        if (nUser == nAns) {
            nScore++;
            nTotal++;
            System.out.println(nScore);
            System.out.println("Correct:)");
            n1 = 0;
            n2 = 0;
            sN1 = "";
            sN2 = "";
            sScore = "";
            sTotal = "";
            lblNum1.setText("");
            lblNum2.setText("");
            lblScore.setText("");
            lblTotal.setText("");
            System.out.println(nAns);
            System.out.println(nUser);
            n1 = (int) (Math.random() * 10);
            n2 = (int) (Math.random() * 10);
            nAns = n1 + n2;
            sN1 += (n1);
            sN2 += (n2);
            sScore += nScore;
            sTotal += nTotal;
            lblScore.setText("Score: " + sScore + " / " + sTotal);
            add(lblScore);
            lblNum1.setText(sN1);
            add(lblNum1);
            lblOp.setText(" + ");
            add(lblOp);
            lblNum2.setText(sN2);
            add(lblNum2);
            txtIn.setText("");
            remove(lblWrong);
            add(lblCorrect);
            add(lblScore);
            revalidate();
        } else {
            nTotal++;
            sTotal = "";
            sScore="";
            lblScore.setText("");
            lblTotal.setText("");
            sScore += nScore;
            sTotal += nTotal;
            lblScore.setText("Score: " + sScore + " / " + sTotal);
            add(lblScore);
            add(lblWrong);
            remove(lblCorrect);
            System.out.println("Wrong:(");
            txtIn.setText("");
        }
        if(nTotal==25){
            remove(txtIn);
            remove(lblNum1);
            remove(lblOp);
            remove(lblNum2);
            remove(lblScore);
            remove(btnMain);
            remove(lblWrong);
            remove(lblCorrect);
            
            
        }
    }
}