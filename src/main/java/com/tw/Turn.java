package com.tw;

public class Turn {
    private Choice player1Choice;
    private Choice player2Choice;

    public Turn(Choice choice1, Choice choice2) {
        this.player1Choice = choice1;
        this.player2Choice = choice2;
    }

    public Choice getPlayer1() {
        return player1Choice;
    }

    public Choice getPlayer2() {
        return player2Choice;
    }

    public void play(IDeltaUpdateClosure closure) {
        Machine result = Machine.fromPlayerValues(player1Choice, player2Choice);
        closure.execute(result.getPlayer1Delta(), result.getPlayer2Delta());
    }
}
