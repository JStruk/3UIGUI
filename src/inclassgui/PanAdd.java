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
    JLabel lblAdd = new JLabel();
    JLabel lblNum1 = new JLabel();
    JLabel lblNum2 = new JLabel();
    JLabel lblOp = new JLabel();
    JLabel lblCorrect = new JLabel();
    JLabel lblWrong = new JLabel();
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
        btnMain.setBounds(10, 10, 115, 20);
        add(btnMain);
        lblAdd.setText("Addition!");
        lblAdd.setFont(new Font("Serif", Font.PLAIN, 20));
        lblAdd.setForeground(Color.magenta);
        lblAdd.setBounds(150, 10, 100, 20);
        add(lblAdd);
        txtIn.setBounds(200, 50, 100, 20);
        add(txtIn);
        n1 = (int) (Math.random() * 10);
        n2 = (int) (Math.random() * 10);
        nAns = n1 + n2;
        sN1 += (n1);
        sN2 += (n2);
        lblNum1.setText(sN1);
        lblNum1.setBounds(150, 50, 20, 20);
        add(lblNum1);
        lblOp.setText(" + ");
        lblOp.setBounds(170, 50, 20, 20);
        add(lblOp);
        lblNum2.setText(sN2);
        lblNum2.setBounds(190, 50, 20, 20);
        add(lblNum2);
        sScore+=nScore;
        sTotal+=nScore;
        lblScore.setBounds(150, 90, 100, 10);
        lblScore.setText("Score: " + sScore + " / " + sTotal);
        add(lblScore);
        lblFinal.setBounds(75, 50, 1000, 100);
        lblCorrect.setBounds(320, 50, 1000, 35);
        lblCorrect.setFont(new Font("Serif", Font.PLAIN, 30));
        lblCorrect.setForeground(Color.GREEN);
        lblCorrect.setText("CORRECT :)");
        lblWrong.setFont(new Font("Serif", Font.PLAIN, 30));
        lblWrong.setBounds(320, 50, 1000, 35);
        lblWrong.setForeground(Color.RED);
        lblWrong.setText("WRONG :(");        
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
            lblOp.setText(" + ");
            lblNum2.setText(sN2);
            txtIn.setText("");
            remove(lblWrong);
            add(lblCorrect);
            add(lblScore);
            revalidate();
            repaint();
        } else {
            nTotal++;
            System.out.println(nScore);
            System.out.println("Correct:)");
            n1 = 0;
            n2 = 0;
            sN1 = "";
            sN2 = "";
            sScore = "";
            sTotal = "";
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
            lblNum1.setText(sN1);
            add(lblNum1);
            lblOp.setText(" + ");
            add(lblOp);
            lblNum2.setText(sN2);
            add(lblNum2);
            txtIn.setText("");
            add(lblScore);
            remove(lblCorrect);
            add(lblWrong);
            repaint();
            revalidate();
        }
        lblFinal.setText("YOUR ADDITION TEST SCORE: " + nScore + " / " + nTotal);
        lblFinal.setFont(new Font("Serif", Font.PLAIN, 20));
        revalidate();

        if (nTotal == 25) {
            remove(txtIn);
            remove(lblNum1);
            remove(lblOp);
            remove(lblNum2);
            remove(lblScore);
            remove(btnMain);
            remove(lblWrong);
            remove(lblCorrect);
            add(lblFinal);
            add(btnMain);
            revalidate();
            repaint();
        }
    }
}
