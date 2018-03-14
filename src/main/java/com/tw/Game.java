package com.tw;

public class Game {

    private static final int NUMBER_OF_ROUNDS = 4;
    private Player player1;
    private Player player2;

    public Game() {
        this.player1 = new Player("Red");
        this.player2 = new Player("Blue");
    }

    public void start() {
        for (int round = 0; round < Game.NUMBER_OF_ROUNDS; round++) {
            playround();
        }
        int[] scores = getPlayersScores();
        System.out.println("Total score of player1: "+scores[0]+" player2: "+scores[1]);
    }

    private void playround() {
        Turn turn = new Turn(UserInput.getUserInput(), UserInput.getUserInput());
        turn.play((delta1, delta2) -> {
            player1.addToTotalScore(delta1);
            player2.addToTotalScore(delta2);
        });
    }

    public int[] getPlayersScores() {
        return new int[]{player1.getTotalScore(), player2.getTotalScore()};
    }
}
