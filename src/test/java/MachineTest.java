import com.tw.Choice;
import com.tw.Machine;
import com.tw.Turn;
import org.junit.Assert;
import org.junit.Test;

public class MachineTest {

    @Test
    public void shouldCheckReturn22BothCOOPERATE() {
        Assert.assertEquals(Machine.COOPERATE_COOPERATE.getPlayer1Delta(),2);
        Assert.assertEquals(Machine.COOPERATE_COOPERATE.getPlayer2Delta(),2);
    }

    @Test
    public void shouldCheckReturn3_1COOPERATECheat() {
        Assert.assertEquals(Machine.COOPERATE_CHEAT.getPlayer1Delta(),-1);
        Assert.assertEquals(Machine.COOPERATE_CHEAT.getPlayer2Delta(),3);
    }

    @Test
    public void shouldCheckReturn1_3CheatCOOPERATE() {
        Assert.assertEquals(Machine.CHEAT_COOPERATE.getPlayer1Delta(),3);
        Assert.assertEquals(Machine.CHEAT_COOPERATE.getPlayer2Delta(),-1);
    }

    @Test
    public void shouldCheckReturn00CheatCheat() {
        Assert.assertEquals(Machine.CHEAT_CHEAT.getPlayer1Delta(),0);
        Assert.assertEquals(Machine.CHEAT_CHEAT.getPlayer2Delta(),0);
    }
}
