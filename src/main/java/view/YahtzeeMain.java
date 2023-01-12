package view;

import control.*;
import model.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JLabel confirmWelcome;
    private JButton confirmPrevBtn;
    private JButton confirmNextBtn;
    private JPanel confirmDiceRow;
    private JPanel confirmP1Row;
    private JPanel confirmP2Row;
    private JPanel confirmP3Row;
    private JPanel confirmP4Row;
    private JPanel confirmP5Row;
    private JPanel confirmP6Row;
    private JPanel namesCofirmPanelBtnGroup;
    private JLabel diceModeConfirm;
    private JLabel p1NameConfirm;
    private JLabel p2NameConfirm;
    private JLabel p3NameConfirm;
    private JLabel p4NameConfirm;
    private JLabel p5NameConfirm;
    private JLabel p6NameConfirm;


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
        confirmP3Row.setVisible(false);
        confirmP4Row.setVisible(false);
        confirmP5Row.setVisible(false);
        confirmP6Row.setVisible(false);

        twoPlayersBtn.addActionListener(e -> {
            numPlayers = 2;
            player3Row.setVisible(false);
            player4Row.setVisible(false);
            player5Row.setVisible(false);
            player6Row.setVisible(false);
            confirmP3Row.setVisible(false);
            confirmP4Row.setVisible(false);
            confirmP5Row.setVisible(false);
            confirmP6Row.setVisible(false);
        });
        threePlayersBtn.addActionListener(e -> {
            numPlayers = 3;
            player3Row.setVisible(true);
            player4Row.setVisible(false);
            player5Row.setVisible(false);
            player6Row.setVisible(false);
            confirmP3Row.setVisible(true);
            confirmP4Row.setVisible(false);
            confirmP5Row.setVisible(false);
            confirmP6Row.setVisible(false);
        });
        fourPlayersBtn.addActionListener(e -> {
            numPlayers = 4;
            player3Row.setVisible(true);
            player4Row.setVisible(true);
            player5Row.setVisible(false);
            player6Row.setVisible(false);
            confirmP3Row.setVisible(true);
            confirmP4Row.setVisible(true);
            confirmP5Row.setVisible(false);
            confirmP6Row.setVisible(false);
        });
        fivePlayersBtn.addActionListener(e -> {
            numPlayers = 5;
            player3Row.setVisible(true);
            player4Row.setVisible(true);
            player5Row.setVisible(true);
            player6Row.setVisible(false);
            confirmP3Row.setVisible(true);
            confirmP4Row.setVisible(true);
            confirmP5Row.setVisible(true);
            confirmP6Row.setVisible(false);
        });
        sixPlayersBtn.addActionListener(e -> {
            numPlayers = 6;
            player3Row.setVisible(true);
            player4Row.setVisible(true);
            player5Row.setVisible(true);
            player6Row.setVisible(true);
            confirmP3Row.setVisible(true);
            confirmP4Row.setVisible(true);
            confirmP5Row.setVisible(true);
            confirmP6Row.setVisible(true);
        });
        virtDiceBtn.addActionListener(e -> {
            virtDice = true;
            diceModeConfirm.setText("Virtual");
        });
        realDiceBtn.addActionListener(e -> {
            virtDice = false;
            diceModeConfirm.setText("Real");
        });
        toPlayerNames.addActionListener(e -> ((CardLayout)mainRoot.getLayout()).show(mainRoot, "playerCard"));
        playerNamesBack.addActionListener(e -> ((CardLayout)mainRoot.getLayout()).show(mainRoot, "startCard"));
        playerNamesConfirmBtn.addActionListener(e -> {
            player1Name = player1Input.getText();
            player2Name = player2Input.getText();
            player3Name = player3Input.getText();
            player4Name = player4Input.getText();
            player5Name = player5Input.getText();
            player6Name = player6Input.getText();
            if (player1Name.length() == 0) p1NameConfirm.setText("Player 1");
            else p1NameConfirm.setText(player1Name);
            if (player2Name.length() == 0) p2NameConfirm.setText("Player 2");
            else p2NameConfirm.setText(player2Name);
            if (player3Name.length() == 0) p3NameConfirm.setText("Player 3");
            else p3NameConfirm.setText(player3Name);
            if (player4Name.length() == 0) p4NameConfirm.setText("Player 4");
            else p4NameConfirm.setText(player4Name);
            if (player5Name.length() == 0) p5NameConfirm.setText("Player 5");
            else p5NameConfirm.setText(player5Name);
            if (player6Name.length() == 0) p6NameConfirm.setText("Player 6");
            else p6NameConfirm.setText(player6Name);
            ((CardLayout)mainRoot.getLayout()).show(mainRoot, "nameConfirmCard");
        });
        confirmPrevBtn.addActionListener(e -> ((CardLayout)mainRoot.getLayout()).show(mainRoot, "playerCard"));
        confirmNextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                yahzteeGame = new Game();
                if (player1Name.length() == 0) yahzteeGame.addPlayer();
                else yahzteeGame.addPlayer(player1Name);
                if (player2Name.length() == 0) yahzteeGame.addPlayer();
                else yahzteeGame.addPlayer(player2Name);
                if (numPlayers > 2 && player3Name.length() == 0) yahzteeGame.addPlayer();
                else if (numPlayers > 2) yahzteeGame.addPlayer(player3Name);
                if (numPlayers > 3 && player4Name.length() == 0) yahzteeGame.addPlayer();
                else if (numPlayers > 3) yahzteeGame.addPlayer(player4Name);
                if (numPlayers > 4 && player5Name.length() == 0) yahzteeGame.addPlayer();
                else if (numPlayers > 4) yahzteeGame.addPlayer(player5Name);
                if (numPlayers > 5 && player6Name.length() == 0) yahzteeGame.addPlayer();
                else if (numPlayers > 5) yahzteeGame.addPlayer(player6Name);
//                for (Player p : yahzteeGame.players) {
//                    System.out.println(p.name);
//                }
                yahzteeGame.startGame();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new YahtzeeMain("Yahtzee");
        frame.setVisible(true);
    }
}
