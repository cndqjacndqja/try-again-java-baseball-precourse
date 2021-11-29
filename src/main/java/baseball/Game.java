package baseball;

import baseball.domain.Computer;
import baseball.domain.Referee;
import baseball.domain.User;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Game {
	Computer computer = new Computer();
	User user = new User();
	Referee referee = new Referee();

	public Game() {
		computer.createBalls();
		referee.insertStandardBalls(computer.getBallList());
	}

	public void run() {
		user.insertNumbers(InputView.inputNumbers());
		referee.judge(user.getBallList());
		if (referee.correctAnswer()) {
			return;
		}
		OutputView.printHint(referee.getStringHint());
		referee.clearStrikeAndBall();
		run();
	}
}
