package model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Game state
 */
public abstract class State {
	private static int num1s = 0;
	private static int num2s = 0;
	private static int num3s = 0;
	private static int num4s = 0;
	private static int num5s = 0;
	private static int num6s = 0;

	public Random rand;
	public Player currPlayer;
	public ArrayList<Player> players;
	public int currPlayerIndx;
	public ScoreTypes selected;
	public int[] diceVals;
	public boolean[] diceRollState;
	public int rollsRem;

	public void setState() {
		for (int i : diceVals) {
			switch (i) {
				case 1 -> num1s++;
				case 2 -> num2s++;
				case 3 -> num3s++;
				case 4 -> num4s++;
				case 5 -> num5s++;
				case 6 -> num6s++;
			}
		}
	}

	public void clearState() {
		num1s = 0;
		num2s = 0;
		num3s = 0;
		num4s = 0;
		num5s = 0;
		num6s = 0;
	}

	public int getOnesScore() {
		return num1s;
	}

	public int getTwosScore() {
		return 2 * num2s;
	}

	public int getThreesScore() {
		return 3 * num3s;
	}

	public int getFoursScore() {
		return 4 * num4s;
	}

	public int getFivesScore() {
		return 5 * num5s ;
	}

	public int getSixesScore() {
		return 6 * num6s;
	}

	public int getBonusScore() {
		int ret = 0;
		if (currPlayer.getTopTotal() >= 63) ret += ScoreTypes.bonusScore;
		return ret;
	}

	public int getThreeOfKindScore() {
		int ret = 0;
		if (num1s > 2 || num2s > 2 || num3s > 2 || num4s > 2 || num5s > 2 || num6s > 2) {
			ret += (num1s) + (2 * num2s) + (3 * num3s) + (4 * num4s) + (5 * num5s) + (6 * num6s);
		}
		return ret;
	}

	public int getFourOfKindScore() {
		int ret = 0;
		if (num1s > 3 || num2s > 3 || num3s > 3 || num4s > 3 || num5s > 3 || num6s > 3) {
			ret += (num1s) + (2 * num2s) + (3 * num3s) + (4 * num4s) + (5 * num5s) + (6 * num6s);
		}
		return ret;
	}

	public int getFullHouseScore() {
		int ret = 0;
		if (num1s == 2 || num2s == 2 || num3s == 2 || num4s == 2 || num5s == 2 || num6s == 2) {
			if (num1s == 3 || num2s == 3 || num3s == 3 || num4s == 3 || num5s == 3 || num6s == 3) {
				ret += ScoreTypes.fullHouseScore;
			}
		}
		return ret;
	}

	public int getSmallStrScore() {
		int ret = 0;
		if ((num1s > 0 && num2s > 0 && num3s > 0 && num4s > 0) || 
			(num2s > 0 && num3s > 0 && num4s > 0 && num5s > 0) ||
			(num3s > 0 && num4s > 0 && num5s > 0 && num6s > 0)) {
			ret += ScoreTypes.smallStrScore;
		}
		return ret;
	}

	public int getLargeStrScore() {
		int ret = 0;
		if ((num1s > 0 && num2s > 0 && num3s > 0 && num4s > 0 && num5s > 0) || 
			(num2s > 0 && num3s > 0 && num4s > 0 && num5s > 0 && num6s > 0)) {
			ret += ScoreTypes.largeStrScore;
		}
		return ret;
	}

	public int getYahtzeeScore() {
		int ret = 0;
		if (num1s == 5 || num2s == 5 || num3s == 5 || num4s == 5 || num5s == 5 || num6s == 5) {
			ret += ScoreTypes.yahtzeeScore;
		}
		return ret;
	}

	public int getChanceScore() {
		return (num1s) + (2 * num2s) + (3 * num3s) + (4 * num4s) + (5 * num5s) + (6 * num6s);
	}

	public int getBonusYahtzeeScore() {
		int ret = 0;
		if (getYahtzeeScore() == ScoreTypes.yahtzeeScore && currPlayer.yahtzeeCount > 0) {
			ret += ScoreTypes.yahtzeeBonusScore;
		}
		return ret;
	}

	public int getSelectionScore(ScoreTypes st) {
		return switch (st) {
			case scoreOne -> getOnesScore();
			case scoreTwo -> getTwosScore();
			case scoreThree -> getThreesScore();
			case scoreFour -> getFoursScore();
			case scoreFive -> getFivesScore();
			case scoreSix -> getSixesScore();
			case scoreTop -> currPlayer.getTopTotal();
			case scoreBonus -> getBonusScore();
			case scoreTopTotal -> currPlayer.getTopGrandTotal();
			case score3OfKind -> getThreeOfKindScore();
			case score4OfKind -> getFourOfKindScore();
			case scoreFullHouse -> getFullHouseScore();
			case scoreSmallStr -> getSmallStrScore();
			case scoreLargeStr -> getLargeStrScore();
			case scoreYahtzee -> getYahtzeeScore();
			case scoreChance -> getChanceScore();
			case scoreYahtzeeBonus -> getBonusYahtzeeScore();
			case scoreBottomTotal -> currPlayer.getBottomTotal();
			case scoreGrandTotal -> currPlayer.getGrandTotal();
		};
	}
}
