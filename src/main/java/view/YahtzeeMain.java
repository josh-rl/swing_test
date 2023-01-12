package view;

import control.*;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("unused")
public class YahtzeeMain extends JFrame {
    private Game yahzteeGame;
    private int numPlayers;
    private boolean virtDice;
    private String player1Name;
    private String player2Name;
    private String player3Name;
    private String player4Name;
    private String player5Name;
    private String player6Name;

    private JPanel mainRoot;
    private JPanel startRoot;
    private JPanel playerRoot;
    private JPanel nameConfirmRoot;
    private JPanel virtDiceRoot;
    private JPanel realDiceRoot;
    private JPanel endGameRoot;

    private JLabel welcomeLabel;
    private JLabel numPlayersLabel;
    private JPanel numPlayersBtnGroup;
    private JRadioButton twoPlayersBtn;
    private JRadioButton threePlayersBtn;
    private JRadioButton fourPlayersBtn;
    private JRadioButton fivePlayersBtn;
    private JRadioButton sixPlayersBtn;
    private JLabel optionsLabel;
    private JPanel optionBtnGroup;
    private JRadioButton virtDiceBtn;
    private JRadioButton realDiceBtn;
    private JPanel continueBtnGroup;
    private JButton toPlayerNames;

    private JLabel playersWelcome;
    private JPanel player1Row;
    private JPanel player2Row;
    private JPanel player3Row;
    private JPanel player4Row;
    private JPanel player5Row;
    private JPanel player6Row;
    private JLabel player1Label;
    private JLabel player2Label;
    private JLabel player3Label;
    private JLabel player4Label;
    private JLabel player5Label;
    private JLabel player6Label;
    private JTextField player1Input;
    private JTextField player2Input;
    private JTextField player3Input;
    private JTextField player4Input;
    private JTextField player5Input;
    private JTextField player6Input;
    private JPanel playerNamesPanelBtnGroup;
    private JButton playerNamesBack;
    private JButton playerNamesConfirmBtn;



    public YahtzeeMain(String title) {
        super(title);
        //this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainRoot);
        //this.setResizable(false);
        this.pack();

        yahzteeGame = new Game();
        numPlayers = 2;
        virtDice = true;

        player1Name = null;
        player2Name = null;
        player3Name = null;
        player4Name = null;
        player5Name = null;
        player6Name = null;

        player3Row.setVisible(false);
        player4Row.setVisible(false);
        player5Row.setVisible(false);
        player6Row.setVisible(false);

        twoPlayersBtn.addActionListener(e -> {
            numPlayers = 2;
            player3Row.setVisible(false);
            player4Row.setVisible(false);
            player5Row.setVisible(false);
            player6Row.setVisible(false);
        });
        threePlayersBtn.addActionListener(e -> {
            numPlayers = 3;
            player3Row.setVisible(true);
            player4Row.setVisible(false);
            player5Row.setVisible(false);
            player6Row.setVisible(false);
        });
        fourPlayersBtn.addActionListener(e -> {
            numPlayers = 4;
            player3Row.setVisible(true);
            player4Row.setVisible(true);
            player5Row.setVisible(false);
            player6Row.setVisible(false);
        });
        fivePlayersBtn.addActionListener(e -> {
            numPlayers = 5;
            player3Row.setVisible(true);
            player4Row.setVisible(true);
            player5Row.setVisible(true);
            player6Row.setVisible(false);
        });
        sixPlayersBtn.addActionListener(e -> {
            numPlayers = 6;
            player3Row.setVisible(true);
            player4Row.setVisible(true);
            player5Row.setVisible(true);
            player6Row.setVisible(true);
        });
        virtDiceBtn.addActionListener(e -> virtDice = true);
        realDiceBtn.addActionListener(e -> virtDice = false);
        toPlayerNames.addActionListener(e -> ((CardLayout)mainRoot.getLayout()).show(mainRoot, "playerCard"));
        playerNamesBack.addActionListener(e -> ((CardLayout)mainRoot.getLayout()).show(mainRoot, "startCard"));
        playerNamesConfirmBtn.addActionListener(e -> {
            // TODO: Add players, Validate intput, Start game
            if (virtDice) ((CardLayout)mainRoot.getLayout()).show(mainRoot, "virtDiceCard");
            else ((CardLayout)mainRoot.getLayout()).show(mainRoot, "realDiceCard");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new YahtzeeMain("Yahtzee");
        frame.setVisible(true);
    }
}
