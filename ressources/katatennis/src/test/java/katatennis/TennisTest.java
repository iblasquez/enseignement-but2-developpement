package katatennis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import katatennis.TennisGame;
import katatennis.TennisGame1;

import java.util.stream.Stream;

public class TennisTest {

	@ParameterizedTest
	@MethodSource("gameProvider")
	void checkAllScoresTennisGame1(int player1Score, int player2Score, String expectedScore) {
		TennisGame game = new TennisGame1("player1", "player2");
		checkAllScores(game, player1Score, player2Score, expectedScore);
	}

	void checkAllScores(TennisGame game, int player1Score, int player2Score, String expectedScore) {
		int highestScore = Math.max(player1Score, player2Score);
		for (int i = 0; i < highestScore; i++) {
			if (i < player1Score)
				game.wonPoint("player1");
			if (i < player2Score)
				game.wonPoint("player2");
		}

		assertEquals(expectedScore, game.getScore());
	}
	

	static Stream<Arguments> gameProvider() {
		return Stream.of(
				Arguments.of(0, 0, "Love-All"), 
				Arguments.of(1, 1, "Fifteen-All"),
				Arguments.of(2, 2, "Thirty-All"), 
				Arguments.of(3, 3, "Deuce"), 
				Arguments.of(4, 4, "Deuce"),
				Arguments.of(1, 0, "Fifteen-Love"), 
				Arguments.of(0, 1, "Love-Fifteen"),
				Arguments.of(2, 0, "Thirty-Love"), 
				Arguments.of(3, 0, "Forty-Love"),
				Arguments.of(4, 0, "Win for player1"), 
				Arguments.of(0, 4, "Win for player2"),
				Arguments.of(2, 1, "Thirty-Fifteen"), 
				Arguments.of(1, 2, "Fifteen-Thirty"),
				Arguments.of(3, 1, "Forty-Fifteen"), 
				Arguments.of(1, 3, "Fifteen-Forty"),
				Arguments.of(4, 1, "Win for player1"), 
				Arguments.of(1, 4, "Win for player2"),
				Arguments.of(3, 2, "Forty-Thirty"), 
				Arguments.of(2, 3, "Thirty-Forty"),
				Arguments.of(4, 2, "Win for player1"), 
				Arguments.of(2, 4, "Win for player2"),
				Arguments.of(4, 3, "Advantage player1"), 
				Arguments.of(3, 4, "Advantage player2"),
				Arguments.of(5, 4, "Advantage player1"), 
				Arguments.of(4, 5, "Advantage player2"),
				Arguments.of(15, 14, "Advantage player1"), 
				Arguments.of(14, 15, "Advantage player2"),
				Arguments.of(6, 4, "Win for player1"), 
				Arguments.of(4, 6, "Win for player2"),
				Arguments.of(16, 14, "Win for player1"), 
				Arguments.of(14, 16, "Win for player2"));
	}

	


}
