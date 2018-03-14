package com.tw;

import java.util.Scanner;

public class UserInput {
    private static Scanner sc = new Scanner(System.in);

    public static Choice getUserInput() {
        System.out.println("Do you want to CHEAT or COOPERATE ?");
        String input  = sc.nextLine();
        try {
            System.out.println("You have selected:"+input);
            return Choice.valueOf(input.toUpperCase().trim());
        } catch (IllegalArgumentException ex) {
            return getUserInput();
        }
    }
}
