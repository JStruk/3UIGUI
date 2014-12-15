/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassgui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

/**
 *
 * @author struj3903
 */
class PanSub extends JPanel implements ActionListener {

    JTextField txtIn = new JTextField(10);
    String sText;
    JButton btnOut = new JButton();
    JLabel lblSub = new JLabel();
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
    int nAns, nScore = 0, nTotal = 0, n1, n2, nTime = 30;
    String sN1 = "", sN2 = "", sScore = "", sTotal = "", sTime = "";
    JLabel lblOut = new JLabel();

    public PanSub() {
        btnMain.setText("Back To Main!");
        btnMain.setBounds(10, 10, 115, 20);
        add(btnMain);
        lblSub.setText("SUBTRACTION!");
        lblSub.setFont(new Font("Serif", Font.PLAIN, 20));
        lblSub.setForeground(Color.magenta);
        lblSub.setBounds(150, 10, 1000, 20);
        add(lblSub);
        txtIn.setBounds(200, 50, 100, 20);
        add(txtIn);
        n1 = (int) (Math.random() * 10);
        n2 = (int) (Math.random() * 10);
        sN1 = "";
        sN2 = "";
        sN1 += n1;
        sN2 += n2;
        if (n2 > n1) {
            nAns = n2 - n1;
            lblNum1.setText(sN2);
            lblNum2.setText(sN1);
        } else {
            nAns = n1 - n2;
            lblNum1.setText(sN1);
            lblNum2.setText(sN2);
        }
        lblNum1.setBounds(150, 50, 20, 20);
        add(lblNum1);
        lblOp.setText(" - ");
        lblOp.setBounds(170, 50, 20, 20);
        add(lblOp);
        lblNum2.setBounds(190, 50, 20, 20);
        add(lblNum2);
        sScore += nScore;
        sTotal += nScore;
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
                                nTotal = 25;
                                lblFinal.setText("YOUR SUBTRACTION  TEST SCORE: " + nScore + " / " + nTotal);
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
            sN1 = "";
            sN2 = "";
            sN1 += n1;
            sN2 += n2;
            if (n2 > n1) {
                nAns = n2 - n1;
                lblNum1.setText(sN2);
                lblNum2.setText(sN1);
            } else {
                nAns = n1 - n2;
                lblNum1.setText(sN1);
                lblNum2.setText(sN2);
            }

            sScore += nScore;
            sTotal += nTotal;
            lblScore.setText("Score: " + sScore + " / " + sTotal);
            lblOp.setText(" - ");
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
            sN1 = "";
            sN2 = "";
            sN1 += n1;
            sN2 += n2;
            if (n2 > n1) {
                nAns = n2 - n1;
                lblNum1.setText(sN2);
                lblNum2.setText(sN1);
            } else {
                nAns = n1 - n2;
                lblNum1.setText(sN1);
                lblNum2.setText(sN2);
            }
            sScore += nScore;
            sTotal += nTotal;
            lblScore.setText("Score: " + sScore + " / " + sTotal);
            add(lblNum1);
            lblOp.setText(" - ");
            add(lblOp);
            add(lblNum2);
            txtIn.setText("");
            add(lblScore);
            remove(lblCorrect);
            add(lblWrong);
            repaint();
            revalidate();
        }
        lblFinal.setText("YOUR SUBTRACTION TEST SCORE: " + nScore + " / " + nTotal);
        lblFinal.setFont(new Font("Serif", Font.PLAIN, 20));
        revalidate();
        if (nTotal == 25) {
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
