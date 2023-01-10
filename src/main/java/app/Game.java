package app;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Game extends State {
	public Game() {
		players = new ArrayList<>();
		rand = new Random();
		diceVals = new int[5];
		Arrays.fill(diceVals, 0);
		rollsRem = 3;
	}

}
