package app;

/**
 * Defines game operations
 */
public interface Control {
	public void addPlayer();
	public void addPlayer(String name);
	public void removePlayer(int amount);
	public void startGame();
	public void rollDie1();
	public void rollDie2();
	public void rollDie3();
	public void rollDie4();
	public void rollDie5();
	public void toggleDie1();
	public void toggleDie2();
	public void toggleDie3();
	public void toggleDie4();
	public void toggleDie5();
	public boolean canRoll();
	public void doRolls(int rolls);
	public boolean canSelect(ScoreTypes st);
	public void makeSelection(ScoreTypes st);
	public boolean canEnd();
	public boolean endTurn();
}
