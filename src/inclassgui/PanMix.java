//Justin Struk
package inclassgui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

class PanMix extends JPanel implements ActionListener {

    JTextField txtIn = new JTextField(10);
    String sText;
    JButton btnOut = new JButton();
    JLabel lblMix = new JLabel();
    JLabel lblNum1 = new JLabel();
    JLabel lblNum2 = new JLabel();
    JLabel lblOp = new JLabel();
    JLabel lblCorrect = new JLabel();
    JLabel lblWrong = new JLabel();
    JLabel lblScore = new JLabel();
    JLabel lblTotal = new JLabel();
    JLabel lblFinal = new JLabel();
    JLabel lblTime = new JLabel();
    JLabel lblTimeUp = new JLabel();
    JButton btnMain = new JButton();
    Timer tmrTime = new Timer(true);
    Timer tmrUpdate = new Timer(true);
    boolean isStarted = false, isTimeUp = false;
    int nAns, nScore = 0, n1, n2, nTime = 30, nCount = 0, nMin = 0, nMax = 4, nRand, nMod;
    String sN1 = "", sN2 = "", sScore = "", sTotal = "25", sTime = "";
    JLabel lblOut = new JLabel();

    public PanMix() {

        btnMain.setText("Back To Main!");
        btnMain.setBounds(10, 10, 115, 20);
        add(btnMain);
        lblMix.setText("MIXED TEST!");
        lblMix.setFont(new Font("Serif", Font.PLAIN, 20));
        lblMix.setForeground(Color.magenta);
        lblMix.setBounds(150, 10, 1000, 20);
        add(lblMix);
        txtIn.setBounds(225, 50, 100, 20);
        add(txtIn);
        nRand = nMin + (int) (Math.random() * ((nMax - nMin) + 1));
        n1 = (int) (Math.random() * 10);
        n2 = (int) (Math.random() * 10);
        sN1 += n1;
        sN2 += n1;
        if (nRand == 1) {//Add   
            lblOp.setText(" + ");
            sN1 += n1;
            sN2 += n2;
            lblNum1.setText(sN1);
            lblNum2.setText(sN2);
            nAns = n1 + n2;
        } else if (nRand == 2) {//Sub
            lblOp.setText(" - ");
            if (n2 > n1) {
                nAns = n2 - n1;
                lblNum1.setText(sN2);
                lblNum2.setText(sN1);
            } else {
                nAns = n1 - n2;
                lblNum1.setText(sN1);
                lblNum2.setText(sN2);
            }
        } else if (nRand == 3) {   //Mult
            lblOp.setText(" * ");
            lblNum1.setText(sN1);
            lblNum2.setText(sN2);
            nAns = n1 * n2;
        } else if (nRand == 4) {//Div
            lblOp.setText(" / ");
            n1 = (int) (Math.random() * 100);
            n2 = (int) (Math.random() * 100);
            do {
                sN1 = "";
                sN2 = "";
                n1 = (int) ((Math.random() + 0.1) * 100);
                n2 = (int) ((Math.random() + 0.1) * 100);
                if (n2 > n1) {
                    nMod = n2 % n1;
                    nAns = n2 / n1;
                    sN1 += n2;
                    sN2 += n1;
                } else {
                    nMod = n1 % n2;
                    nAns = n1 / n2;
                    sN1 += n1;
                    sN2 += n2;
                }
            } while (nMod != 0);
            lblNum1.setText(sN1);
            lblNum2.setText(sN2);
        }
        lblNum1.setBounds(150, 50, 20, 20);
        add(lblNum1);
        lblOp.setBounds(170, 50, 20, 20);
        add(lblOp);
        lblNum2.setBounds(190, 50, 20, 20);
        add(lblNum2);
        sScore += nScore;
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
        lblTimeUp.setText("TIMES UP!");
        lblTimeUp.setFont(new Font("Serif", Font.PLAIN, 30));
        lblTimeUp.setBounds(75, 25, 1000, 100);
        txtIn.addActionListener(this);
        sTime += nTime;
        lblTime.setText("00:" + sTime);
        lblTime.setBounds(10, 50, 50, 20);
        add(lblTime);
        tmrTime.scheduleAtFixedRate(
                new TimerTask() {
            public void run() {
                if (isStarted) {
                    nTime = nTime - 1;
                    revalidate();
                    repaint();
                    if (nTime <= 0) {
                        isStarted = false;
                        remove(txtIn);
                        remove(lblNum1);
                        remove(lblOp);
                        remove(lblNum2);
                        remove(lblScore);
                        remove(lblWrong);
                        remove(lblCorrect);
                        lblFinal.setText("YOUR MIXED TEST SCORE: " + nScore + " / " + sTotal);
                        add(lblTimeUp);
                        add(lblFinal);
                        revalidate();
                        repaint();
                    }
                }
            }
        }, 0, 1000);
        tmrUpdate.scheduleAtFixedRate(
                new TimerTask() {
            public void run() {
                if (isStarted) {
                    sTime = "";
                    sTime += nTime;
                    lblTime.setText("00:" + sTime);
                    revalidate();
                    repaint();
                }
            }
        }, 0, 1);
    }

    public void actionPerformed(ActionEvent evt) {
        isStarted = true;
        revalidate();
        repaint();
        int nUser;
        String sWord = txtIn.getText();
        nUser = (int) Integer.parseInt(sWord);
        if (nUser == nAns) {
            nCount++;
            nScore++;
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
            sN1 += (n1);
            sN2 += (n2);
            sScore += nScore;
            sTotal = "25";
            lblScore.setText("Score: " + sScore + " / " + sTotal);
            lblNum1.setText(sN1);
            lblNum2.setText(sN2);
            txtIn.setText("");
            remove(lblWrong);
            add(lblCorrect);
            add(lblScore);
            revalidate();
            repaint();
        } else {
            nCount++;
            System.out.println(nScore);
            System.out.println("Correct:)");
            n1 = 0;
            n2 = 0;
            sN1 = "";
            sN2 = "";
            sScore = "";
            sTotal = "25";
            System.out.println(nAns);
            System.out.println(nUser);
            n1 = (int) (Math.random() * 10);
            n2 = (int) (Math.random() * 10);
            sN1 += (n1);
            sN2 += (n2);
            sScore += nScore;
            lblScore.setText("Score: " + sScore + " / " + sTotal);
            lblNum1.setText(sN1);
            add(lblNum1);
            //lblOp.setText(" + ");
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
        lblFinal.setText("YOUR MIXED TEST SCORE: " + nScore + " / " + sTotal);
        lblFinal.setFont(new Font("Serif", Font.PLAIN, 20));
        revalidate();
        if (nCount == 25) {
            isStarted = false;
            remove(txtIn);
            remove(lblNum1);
            remove(lblOp);
            remove(lblNum2);
            remove(lblScore);
            remove(lblWrong);
            remove(lblCorrect);
            add(lblFinal);
            add(btnMain);
            revalidate();
            repaint();
        }
    }
}