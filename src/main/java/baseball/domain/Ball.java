package baseball.domain;

import java.util.Objects;

public class Ball {
	private int number;

	public Ball(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Ball ball = (Ball)o;
		return number == ball.getNumber();
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	public int getNumber() {
		return number;
	}
}
