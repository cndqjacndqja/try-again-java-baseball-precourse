package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class BallRepository {
	List<Ball> ballList = new ArrayList<>();

	public void insertBall(List<Integer> numbers) {
		clearBallList();
		for (int i = 0; i < numbers.size(); i++) {
			ballList.add(new Ball(numbers.get(i)));
		}
	}

	public void clearBallList() {
		ballList.clear();
	}

	public List<Ball> getBallList() {
		return ballList;
	}
}
