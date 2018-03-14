package com.tw;

public enum Machine {

    COOPERATE_COOPERATE(Choice.COOPERATE, Choice.COOPERATE, 2, 2),
    CHEAT_COOPERATE(Choice.CHEAT, Choice.COOPERATE, 3, -1),
    COOPERATE_CHEAT(Choice.COOPERATE, Choice.CHEAT, -1, 3),
    CHEAT_CHEAT(Choice.CHEAT, Choice.CHEAT, 0, 0);

    private final Choice player1Choice;
    private final Choice player2Choice;
    private final int player1Delta;
    private final int player2Delta;

    Machine(Choice player1Choice, Choice player2Choice, int player1Delta, int player2Delta) {
        this.player1Choice = player1Choice;
        this.player2Choice = player2Choice;
        this.player1Delta = player1Delta;
        this.player2Delta = player2Delta;
    }

    public int getPlayer1Delta() {
        return player1Delta;
    }

    public int getPlayer2Delta() {
        return player2Delta;
    }

    public static Machine fromPlayerValues(Choice player1, Choice player2) {
        for (Machine machine : Machine.values()) {
            if(player1 == machine.player1Choice && player2 == machine.player2Choice) {
                return machine;
            }
        }
        return null;
    }
}
