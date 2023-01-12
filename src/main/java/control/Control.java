package control;

import model.ScoreTypes;


/**
 * Defines game operations
 */
@SuppressWarnings("unused")
public interface Control {
	void addPlayer();
	void addPlayer(String name);
	void startGame();
	void rollDie1();
	void rollDie2();
	void rollDie3();
	void rollDie4();
	void rollDie5();
	void toggleDie1();
	void toggleDie2();
	void toggleDie3();
	void toggleDie4();
	void toggleDie5();
	boolean canRoll();
	void doRolls(int rolls);
	boolean canSelect(ScoreTypes st);
	void makeSelection(ScoreTypes st);
	boolean canEnd();
	boolean endTurn();
}
