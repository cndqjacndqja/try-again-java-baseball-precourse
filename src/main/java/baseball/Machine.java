package baseball;

import baseball.view.InputView;

public class Machine {
	public void run() {
		Game game = new Game();
		game.run();
		if (whetherRestart()) {
			System.out.println("게임 종료");
			return;
		}
		run();
	}

	public boolean whetherRestart() {
		return InputView.requestWhetherRestart().equals("2");
	}
}
