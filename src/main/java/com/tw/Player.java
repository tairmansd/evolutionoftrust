package com.tw;

public class Player {

    private String name;
    private int totalScore;

    public Player(String name) {
        this.name = name;
    }

    public void addToTotalScore(int score) {
        totalScore+=score;
    }

    public int getTotalScore() {
        return totalScore;
    }
}
