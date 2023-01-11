package view;

import javax.swing.*;

public class YahtzeeStart {
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

    public JPanel getContainer() {
        return yahtzeeStartPanel;
    }

    public YahtzeeStart() {}
}
