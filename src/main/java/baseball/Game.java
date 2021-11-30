package baseball;

import java.util.List;

import baseball.domain.Ball;
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
		OutputView.printHint(referee.getStringHint());
		if (referee.correctAnswer()) {
			return;
		}
		referee.clearStrikeAndBall();
		run();
	}
}
