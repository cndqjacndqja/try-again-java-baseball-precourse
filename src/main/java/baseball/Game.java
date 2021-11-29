package baseball;

import baseball.domain.Computer;
import baseball.view.InputView;

public class Game {
	Computer computer = new Computer();

	public Game() {
		computer.createBalls();
	}

	public void run() {
		String input = InputView.inputNumbers();

	}
}
