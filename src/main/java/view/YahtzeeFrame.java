package view;

import javax.swing.*;

public class YahtzeeFrame extends JFrame {
	private YahtzeeStart startScreen = new YahtzeeStart();

	public YahtzeeFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(startScreen.getContainer());
		this.setResizable(false);
		this.pack();
	}

	public static void main(String[] args) {
		JFrame frame = new YahtzeeFrame("Yahtzee");
		frame.setVisible(true);
	}
}
