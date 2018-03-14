import com.tw.Choice;
import com.tw.Player;
import com.tw.Turn;
import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void shouldCheckForTurnComputation() {
        Player player1 = new Player("Red");
        Player player2 = new Player("Blue");
        Turn turn = new Turn(Choice.COOPERATE, Choice.COOPERATE);
        turn.play((player1Delta, player2Delta) -> {
           player1.addToTotalScore(player1Delta);
           player2.addToTotalScore(player2Delta);
        });

        Assert.assertEquals(player1.getTotalScore(), 2);
        Assert.assertEquals(player2.getTotalScore(), 2);
    }
}
