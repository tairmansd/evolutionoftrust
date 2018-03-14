package com.tw;

@FunctionalInterface
public interface IDeltaUpdateClosure {
    void execute(int player1Delta, int player2Delta);
}
