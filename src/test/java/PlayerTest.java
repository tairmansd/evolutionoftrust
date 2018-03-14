import com.tw.Player;
import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void shouldCheckTotalScoreMutation() {
        Player player = new Player("Red");
        player.addToTotalScore(10);
        Assert.assertEquals(player.getTotalScore(), 10);
    }

}
