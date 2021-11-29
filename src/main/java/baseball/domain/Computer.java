package baseball.domain;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
	BallRepository ballRepository = new BallRepository();

	public void createBalls() {
		ballRepository.insertBall(createRandomNumbers());
	}

	private List<Integer> createRandomNumbers() {
		LinkedHashSet<Integer> tempSet = new LinkedHashSet<>();
		while (tempSet.size() != 3) {
			tempSet.add(Randoms.pickNumberInRange(1, 9));
		}
		return new ArrayList<>(tempSet);
	}
}
