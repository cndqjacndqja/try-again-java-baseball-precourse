package baseball.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class User {
	BallRepository ballRepository = new BallRepository();

	public void insertNumbers(String input) {
		ballRepository.insertBall(createBallNumbers(input));
	}

	private List<Integer> createBallNumbers(String input) {
		validateDuplicate(input);
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			int number = Character.getNumericValue(input.charAt(i));
			validateNumber(number);
			numbers.add(number);
		}
		return numbers;
	}

	private void validateDuplicate(String input) {
		LinkedHashSet<String> tempSet = new LinkedHashSet<>(Arrays.asList(input.split("")));
		if (tempSet.size() != 3) {
			throw new IllegalArgumentException();
		}
	}

	private void validateNumber(int number) {
		if (number >= 1 && number <= 9) {
			return;
		}
		throw new IllegalArgumentException();
	}

	public List<Ball> getBallList() {
		return ballRepository.getBallList();
	}
}
