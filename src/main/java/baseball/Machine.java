package baseball;

import baseball.view.InputView;

public class Machine {
	public void run() {
		Game game = new Game();
		game.run();
		if(whetherRestart()) {
			return;
		}
		run();
	}

	public boolean whetherRestart() {
		return InputView.requestWhetherRestart().equals("2");
	}
}
