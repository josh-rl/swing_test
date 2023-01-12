package view;

import model.*;
import control.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YahtzeeMain extends JFrame {
    private Game yahzteeGame;
    private int numPlayers;
    private boolean virtDice;
    private JPanel mainRoot;
    private JPanel startRoot;
    private JPanel playerRoot;
    private JPanel virtDiceRoot;
    private JPanel realDiceRoot;
    private JPanel endGameRoot;
    private JButton prevStart;
    private JButton nextStart;
    private JLabel startLabel;
    private JButton prevPlayer;
    private JButton nextPlayer;
    private JLabel playerLabel;
    private JButton prevVD;
    private JButton nextVD;
    private JLabel vdLabel;
    private JButton prevRD;
    private JButton nextRD;
    private JLabel rdLabel;
    private JButton prevEG;
    private JButton nextEG;
    private JLabel egLabel;

    public YahtzeeMain(String title) {
        super(title);
        //this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainRoot);
        this.setResizable(false);
        this.pack();
        nextStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainRoot.getLayout()).show(mainRoot, "playerCard");
            }
        });
        prevPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainRoot.getLayout()).show(mainRoot, "startCard");
            }
        });
        nextPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainRoot.getLayout()).show(mainRoot, "virtDiceCard");
            }
        });
        prevVD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainRoot.getLayout()).show(mainRoot, "playerCard");
            }
        });
        nextVD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainRoot.getLayout()).show(mainRoot, "realDiceCard");
            }
        });
        prevRD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainRoot.getLayout()).show(mainRoot, "virtDiceCard");
            }
        });
        nextRD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainRoot.getLayout()).show(mainRoot, "endGameCard");
            }
        });
        prevEG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)mainRoot.getLayout()).show(mainRoot, "realDiceCard");
            }
        });

        yahzteeGame = new Game();
    }

    public static void main(String[] args) {
        JFrame frame = new YahtzeeMain("Yahtzee");
        frame.setVisible(true);
    }
}
