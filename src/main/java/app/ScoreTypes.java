package app;

public enum ScoreTypes {
	scoreOne,
	scoreTwo,
	scoreThree,
	scoreFour,
	scoreFive,
	scoreSix,
	scoreTop,
	scoreBonus,
	scoreTopTotal,
	score3OfKind,
	score4OfKind,
	scoreFullHouse,
	scoreSmallStr,
	scoreLargeStr,
	scoreYahtzee,
	scoreChance,
	scoreYahtzeeBonus,
	scoreBottomTotal,
	scoreGrandTotal;

	public static final int bonusScore = 35;
	public static final int fullHouseScore = 25;
	public static final int smallStrScore = 30;
	public static final int largeStrScore = 40;
	public static final int yahtzeeScore = 50;
	public static final int yahtzeeBonusScore = 100;
}
