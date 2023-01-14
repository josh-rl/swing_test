package view;

import control.*;
import model.ScoreTypes;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

@SuppressWarnings("unused")
public class YahtzeeMain extends JFrame {
    private final Game yahzteeGame;
    private int numPlayers;
    private int gameTurn;
    private boolean virtDice;
    private String player1Name;
    private String player2Name;
    private String player3Name;
    private String player4Name;
    private String player5Name;
    private String player6Name;
    private Timer vdStart;
    private Timer vdStop;


    private JPanel mainRoot;
    private JPanel offlineStartRoot;
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
    private JLabel confirmDiceModeLabel;
    private JLabel confirmP1Label;
    private JLabel confirmP2Label;
    private JLabel confirmP3Label;
    private JLabel confirmP4Label;
    private JLabel confirmP5Label;
    private JLabel confirmP6Label;


    private JPanel diceRollRow;
    private JPanel virtDiceGroup;
    private JPanel die1Panel;
    private JPanel die2Panel;
    private JPanel die3Panel;
    private JPanel die4Panel;
    private JPanel die5Panel;
    private JLabel die1Label;
    private JLabel die2Label;
    private JLabel die3Label;
    private JLabel die4Label;
    private JLabel die5Label;
    private JButton vdRollBtn;
    private JPanel virtDiceToggles;
    private JRadioButton die1Toggle;
    private JRadioButton die2Toggle;
    private JRadioButton die3Toggle;
    private JRadioButton die4Toggle;
    private JRadioButton die5Toggle;

    private JPanel vdGameScorePane;
    private JPanel vdOnesRow;
    private JPanel vdTwosRow;
    private JPanel vdThreesRow;
    private JPanel vdFoursRow;
    private JPanel vdFivesRow;
    private JPanel vdSixesRow;
    private JPanel vdTopTotalRow;
    private JPanel vdBonusRow;
    private JPanel vdTopGrandTotalRow;
    private JPanel vdThreeOKRow;
    private JPanel vdFourOKRow;
    private JPanel vdFHRow;
    private JPanel vdSmStrRow;
    private JPanel vdLGStrRow;
    private JPanel vdYahtzeeRow;
    private JPanel vdChanceRow;
    private JPanel vdYahtzeeBonusRow;
    private JPanel vdBottomTotalRow;
    private JPanel vdGrandTotalRow;
    private JRadioButton vdOnesScoreBtn;
    private JRadioButton vdTwosScoreBtn;
    private JRadioButton vdThreesScoreBtn;
    private JRadioButton vdFoursScoreBtn;
    private JRadioButton vdFivesScoreBtn;
    private JRadioButton vdSixesScoreBtn;
    private JRadioButton vdThreeOKScoreBtn;
    private JRadioButton vdFourOKScoreBtn;
    private JRadioButton vdFHScoreBtn;
    private JRadioButton vdSMStrScoreBtn;
    private JRadioButton vdLGStrScoreBtn;
    private JRadioButton vdYahtzeeScoreBtn;
    private JRadioButton vdChanceScoreBtn;
    private JRadioButton vdYahtzeeBonusScoreBtn;
    private JLabel vdOnesScoreLabel;
    private JLabel vdTwosScoreLabel;
    private JLabel vdThreesScoreLabel;
    private JLabel vdFoursScoreLabel;
    private JLabel vdFivesScoreLabel;
    private JLabel vdSixesScoreLabel;
    private JLabel vdTopTotalScoreLabel;
    private JLabel vdBonusScoreLabel;
    private JLabel vdTopGrandTotalScoreLabel;
    private JLabel vdThreeOKScoreLabel;
    private JLabel vdFourokScoreLabel;
    private JLabel vdFHScoreLabel;
    private JLabel vdSMStrScoreLabel;
    private JLabel vdLGStrScoreLabel;
    private JLabel vdYahtzeeScoreLabel;
    private JLabel vdChanceScoreLabel;
    private JLabel vdYahtzeeBonusScoreLabel;
    private JLabel vdBottomTotalScoreLabel;
    private JLabel vdGrandTotalScoreLabel;
    private JLabel vdOnesScoreValue;
    private JLabel vdTwosScoreValue;
    private JLabel vdThreesScoreValue;
    private JLabel vdFoursScoreValue;
    private JLabel vdFivesScoreValue;
    private JLabel vdSixesScoreValue;
    private JLabel vdTopTotalScoreValue;
    private JLabel vdBonusScoreValue;
    private JLabel vdTopGrandTotalScoreValue;
    private JLabel vdThreeOKScoreValue;
    private JLabel vdFourokScoreValue;
    private JLabel vdFHScoreValue;
    private JLabel vdSMStrScoreValue;
    private JLabel vdLGStrScoreValue;
    private JLabel vdYahtzeeScoreValue;
    private JLabel vdChanceScoreValue;
    private JLabel vdYahtzeeBonusScoreValue;
    private JLabel vdBottomTotalScoreValue;
    private JLabel vdGrandTotalScoreValue;

    private JPanel vdPlayerInfoPane;
    private JPanel vdSelectionPane;
    private JLabel vdCurrPlayerLabel;
    private JLabel vdRollsRemLabel;
    private JLabel vdRollsRemValue;
    private JPanel vdGameInfoPane;
    private JPanel vdInfoTopSpacer;
    private JPanel vdInfoBottomSpacer;
    private JPanel vdSelectionSpacer;
    private JPanel vdInfoRow;
    private JLabel vdHowToInfo1;
    private JLabel vdHowToInfo2;
    private JLabel vdHowToInfo3;
    private JLabel vdHowToInfo4;
    private JLabel vdHowToInfo5;
    private JLabel vdHowToInfo6;
    private JLabel vdScoreCardSelectionLabel;
    private JLabel vdScoreCardSelectionValue;
    private JPanel vdEndTurnButtonRow;
    private JButton vdEndTurnButton;
    private JLabel vdScoreSelectionScoreValue;
    private JLabel vdScoreCardSelectionScoreLabel;
    private JRadioButton vdInvisibleBtn;


    public YahtzeeMain(String title) {
        super(title);
        //this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainRoot);
        //this.setResizable(false);
        this.pack();

        yahzteeGame = new Game();
        numPlayers = 2;
        gameTurn = 0;
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
        toPlayerNames.addActionListener(e -> ((CardLayout) mainRoot.getLayout()).show(mainRoot, "playerCard"));
        playerNamesBack.addActionListener(e -> ((CardLayout) mainRoot.getLayout()).show(mainRoot, "startCard"));
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
            ((CardLayout) mainRoot.getLayout()).show(mainRoot, "nameConfirmCard");
        });
        confirmPrevBtn.addActionListener(e -> ((CardLayout) mainRoot.getLayout()).show(mainRoot, "playerCard"));
        confirmNextBtn.addActionListener(e -> {
            if (player1Name.length() == 0 || player1Name.length() > 30) yahzteeGame.addPlayer();
            else yahzteeGame.addPlayer(player1Name);
            if (player2Name.length() == 0 || player2Name.length() > 30) yahzteeGame.addPlayer();
            else yahzteeGame.addPlayer(player2Name);
            if (numPlayers > 2 && (player3Name.length() == 0 || player3Name.length() > 30)) yahzteeGame.addPlayer();
            else if (numPlayers > 2) yahzteeGame.addPlayer(player3Name);
            if (numPlayers > 3 && (player4Name.length() == 0 || player4Name.length() > 30)) yahzteeGame.addPlayer();
            else if (numPlayers > 3) yahzteeGame.addPlayer(player4Name);
            if (numPlayers > 4 && (player5Name.length() == 0 || player5Name.length() > 30)) yahzteeGame.addPlayer();
            else if (numPlayers > 4) yahzteeGame.addPlayer(player5Name);
            if (numPlayers > 5 && (player6Name.length() == 0 || player6Name.length() > 30)) yahzteeGame.addPlayer();
            else if (numPlayers > 5) yahzteeGame.addPlayer(player6Name);
            yahzteeGame.startGame();

            setVDiceValues();
            setVDScoreValues();
            setVDScoreSelectable();
            setVDPlayerName();

            if (virtDice) ((CardLayout) mainRoot.getLayout()).show(mainRoot, "virtDiceCard");
            else ((CardLayout) mainRoot.getLayout()).show(mainRoot, "realDiceCard");
        });
        vdStart = new Timer(100, e -> {
            yahzteeGame.doRolls();
            setVDiceValues();
            die1Label.repaint();
            die2Label.repaint();
            die3Label.repaint();
            die4Label.repaint();
            die5Label.repaint();
        });
        vdStop = new Timer(2000, e -> {
            vdStart.stop();
            yahzteeGame.rollsRem--;
            vdRollsRemValue.setText(String.valueOf(yahzteeGame.rollsRem));
            if (yahzteeGame.canRoll()) {
                vdRollBtn.setEnabled(true);
                die1Toggle.setEnabled(true);
                die2Toggle.setEnabled(true);
                die3Toggle.setEnabled(true);
                die4Toggle.setEnabled(true);
                die5Toggle.setEnabled(true);
            }
            die1Toggle.setSelected(false);
            die2Toggle.setSelected(false);
            die3Toggle.setSelected(false);
            die4Toggle.setSelected(false);
            die5Toggle.setSelected(false);
            yahzteeGame.setState();
            Arrays.fill(yahzteeGame.diceRollState, false);
            if (yahzteeGame.selected != null)
                vdScoreSelectionScoreValue.setText(String.valueOf(yahzteeGame.getSelectionScore(yahzteeGame.selected)));
            if (yahzteeGame.canEnd())
                vdEndTurnButton.setEnabled(true);
        });
        vdStop.setRepeats(false);
        vdRollBtn.addActionListener(e -> {
            if (yahzteeGame.canRoll()) {
                yahzteeGame.clearState();
                vdRollBtn.setEnabled(false);
                die1Toggle.setEnabled(false);
                die2Toggle.setEnabled(false);
                die3Toggle.setEnabled(false);
                die4Toggle.setEnabled(false);
                die5Toggle.setEnabled(false);
                vdStart.start();
                vdStop.setDelay(yahzteeGame.rand.nextInt(5000) + 1000);
                vdStop.start();
            }
        });
        die1Toggle.addActionListener(e -> yahzteeGame.toggleDie1());
        die2Toggle.addActionListener(e -> yahzteeGame.toggleDie2());
        die3Toggle.addActionListener(e -> yahzteeGame.toggleDie3());
        die4Toggle.addActionListener(e -> yahzteeGame.toggleDie4());
        die5Toggle.addActionListener(e -> yahzteeGame.toggleDie5());
        vdOnesScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreOne;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdTwosScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreTwo;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdThreesScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreThree;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdFoursScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreFour;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdFivesScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreFive;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdSixesScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreSix;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdThreeOKScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.score3OfKind;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdFourOKScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.score4OfKind;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdFHScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreFullHouse;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdSMStrScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreSmallStr;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdLGStrScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreLargeStr;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdYahtzeeScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreYahtzee;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdChanceScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreChance;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdYahtzeeBonusScoreBtn.addActionListener(e -> {
            yahzteeGame.selected = ScoreTypes.scoreYahtzeeBonus;
            setVDSelectedScore();
            if (yahzteeGame.canEnd()) vdEndTurnButton.setEnabled(true);
        });
        vdEndTurnButton.addActionListener(e -> {
            gameTurn++;
            yahzteeGame.endTurn();
            if (gameTurn >= 13 * numPlayers) {
                // TODO - End game, find winner, display all score cards
            } else {
                vdRollsRemValue.setText("3");
                vdRollBtn.setEnabled(true);
                vdEndTurnButton.setEnabled(false);
                die1Toggle.setEnabled(false);
                die2Toggle.setEnabled(false);
                die3Toggle.setEnabled(false);
                die4Toggle.setEnabled(false);
                die5Toggle.setEnabled(false);
                die1Toggle.setSelected(true);
                die2Toggle.setSelected(true);
                die3Toggle.setSelected(true);
                die4Toggle.setSelected(true);
                die5Toggle.setSelected(true);
                setVDPlayerName();
                setVDiceValues();
                setVDScoreValues();
                setVDScoreSelectable();
                setVDSelectedScore();
            }
        });
    }

    private void setVDScoreValues() {
        vdOnesScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreOne)));
        vdTwosScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreTwo)));
        vdThreesScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreThree)));
        vdFoursScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreFour)));
        vdFivesScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreFive)));
        vdSixesScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreSix)));
        vdTopTotalScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreTop)));
        vdBonusScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreBonus)));
        vdTopGrandTotalScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreTopTotal)));
        vdThreeOKScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.score3OfKind)));
        vdFourokScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.score4OfKind)));
        vdFHScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreFullHouse)));
        vdSMStrScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreSmallStr)));
        vdLGStrScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreLargeStr)));
        vdYahtzeeScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreYahtzee)));
        vdChanceScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreChance)));
        vdYahtzeeBonusScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreYahtzeeBonus)));
        vdBottomTotalScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreBottomTotal)));
        vdGrandTotalScoreValue.setText(String.valueOf(yahzteeGame.currPlayer.scoreMap.get(ScoreTypes.scoreGrandTotal)));
    }

    private void setVDiceValues() {
        die1Label.setText(String.valueOf(yahzteeGame.diceVals[0]));
        die2Label.setText(String.valueOf(yahzteeGame.diceVals[1]));
        die3Label.setText(String.valueOf(yahzteeGame.diceVals[2]));
        die4Label.setText(String.valueOf(yahzteeGame.diceVals[3]));
        die5Label.setText(String.valueOf(yahzteeGame.diceVals[4]));
    }

    private void setVDPlayerName() {
        vdCurrPlayerLabel.setText(yahzteeGame.currPlayer.name + "'s Turn:");
    }

    private void setVDScoreSelectable() {
        vdInvisibleBtn.setSelected(true);
        vdOnesScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.scoreOne));
        vdTwosScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.scoreTwo));
        vdThreesScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.scoreThree));
        vdFoursScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.scoreFour));
        vdFivesScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.scoreFive));
        vdSixesScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.scoreSix));
        vdThreeOKScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.score3OfKind));
        vdFourOKScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.score4OfKind));
        vdFHScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.scoreFullHouse));
        vdSMStrScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.scoreSmallStr));
        vdLGStrScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.scoreLargeStr));
        vdYahtzeeScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.scoreYahtzee));
        vdChanceScoreBtn.setEnabled(!yahzteeGame.currPlayer.pickMap.get(ScoreTypes.scoreChance));
        vdYahtzeeBonusScoreBtn.setEnabled(yahzteeGame.currPlayer.yahtzeeCount > 0);
    }

    private void setVDSelectedScore() {
        if (yahzteeGame.selected == null) {
            vdScoreCardSelectionValue.setText("none");
            vdScoreSelectionScoreValue.setText("0");
            return;
        }
        switch (yahzteeGame.selected) {
            case scoreOne -> vdScoreCardSelectionValue.setText("Ones");
            case scoreTwo -> vdScoreCardSelectionValue.setText("Twos");
            case scoreThree -> vdScoreCardSelectionValue.setText("Threes");
            case scoreFour -> vdScoreCardSelectionValue.setText("Fours");
            case scoreFive -> vdScoreCardSelectionValue.setText("Fives");
            case scoreSix -> vdScoreCardSelectionValue.setText("Sixes");
            case score3OfKind -> vdScoreCardSelectionValue.setText("3-of-kind");
            case score4OfKind -> vdScoreCardSelectionValue.setText("4-of-kind");
            case scoreFullHouse -> vdScoreCardSelectionValue.setText("Full House");
            case scoreSmallStr -> vdScoreCardSelectionValue.setText("Small Straight");
            case scoreLargeStr -> vdScoreCardSelectionValue.setText("Large Straight");
            case scoreYahtzee -> vdScoreCardSelectionValue.setText("Yahtzee");
            case scoreChance -> vdScoreCardSelectionValue.setText("Chance");
            case scoreYahtzeeBonus -> vdScoreCardSelectionValue.setText("Bonus Yahtzee");
        }
        vdScoreSelectionScoreValue.setText(String.valueOf(yahzteeGame.getSelectionScore(yahzteeGame.selected)));
    }


    public static void main(String[] args) {
        JFrame frame = new YahtzeeMain("Yahtzee");
        frame.setVisible(true);
    }

}
