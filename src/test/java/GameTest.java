import com.tw.Game;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GameTest {

    @Test
    public void shouldCheckForOneTurnCOOPCOOP() {
        generateTestData();

        Game game = new Game();

        game.start();

        int[] scores = game.getPlayersScores();

        Assert.assertEquals(scores[0], 7);
        Assert.assertEquals(scores[1], 3);
    }

    private void generateTestData() {
        String round1 = "COOPERATE\nCOOPERATE";
        String round2 = "CHEAT\nCOOPERATE";
        String round3 = "COOPERATE\nCHEAT";
        String round4 = "CHEAT\nCHEAT";
        String round5 = "CHEAT\nCOOPERATE";

        String rounds = round1 + "\n" + round2 + "\n" + round3 + "\n" + round4 + "\n" + round5;

        InputStream inP1 = new ByteArrayInputStream(rounds.getBytes());
        System.setIn(inP1);
    }
}
