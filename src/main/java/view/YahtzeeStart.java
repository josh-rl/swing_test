package view;

import javax.swing.*;

public class YahtzeeStart extends JFrame {
    private JPanel yahtzeeStartPanel;
    private JPanel welcomeRow;
    private JPanel playerCountRow;
    private JPanel optionsRow;
    private JPanel footerSpace;
    private JLabel welcomeLabel;
    private JLabel numPlayersLabel;
    private JRadioButton playerCount2;
    private JRadioButton playerCount3;
    private JRadioButton playerCount4;
    private JRadioButton playerCount5;
    private JRadioButton playerCount6;
    private JLabel optionsLabel;
    private JRadioButton showRollFalse;
    private JRadioButton showRollTrue;

    public YahtzeeStart(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(yahtzeeStartPanel);
        this.setResizable(false);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new YahtzeeStart("Yahtzee");
        frame.setVisible(true);
    }
}
