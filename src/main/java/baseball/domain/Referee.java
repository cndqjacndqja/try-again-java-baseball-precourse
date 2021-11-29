package baseball.domain;

import java.util.List;

public class Referee {
	private int strike;
	private int ball;
	private List<Ball> ballList;

	public void insertStandardBalls(List<Ball> ballList) {
		this.ballList = ballList;
	}

	public void judge(List<Ball> userBallList) {
		for (int i = 0; i < userBallList.size(); i++) {
			judgeElement(userBallList.get(i), i);
		}
	}

	public void judgeElement(Ball userBall, int position) {
		for (int i = 0; i < ballList.size(); i++) {
			if (i == position && ballList.get(i).equals(userBall)) {
				strike++;
				return;
			}
			if (ballList.get(i).equals(userBall)) {
				ball++;
				return;
			}
		}
	}

	public void clearStrikeAndBall() {
		strike = 0;
		ball = 0;
	}

	public boolean correctAnswer() {
		return strike == 3;
	}

	public String getStringHint() {
		StringBuilder sb = new StringBuilder();
		if (strike == 0 && ball == 0) {
			sb.append("낫싱");
			return sb.toString();
		}
		if (ball != 0) {
			sb.append(ball).append("볼 ");
		}
		if (strike != 0) {
			sb.append(strike).append("스트라이크");
		}
		return sb.toString();
	}
}
