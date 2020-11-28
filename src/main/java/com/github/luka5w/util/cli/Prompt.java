package com.github.luka5w.util.cli;

import com.github.luka5w.util.exception.TooMuchIterationException;

import java.util.Scanner;

public class Prompt {
    private static final String YES = "y";
    private static final String NO = "n";
    private static final int MAX_PROMPTS = 100;

    public static boolean promptYN(String question) {
        return promptYN(question, null, null);
    }
    public static boolean promptYN(String question, String prefix, String invalidInput) {
        return promptYN(question, prefix, YES, NO, invalidInput, MAX_PROMPTS);
    }
    public static boolean promptYN(String question, String prefix, String yes, String no, String invalidInput, int maxPrompts) {
        if (prefix == null) prefix = "[y|n] > ";
        if (yes == null) yes = YES;
        if (no == null) no = NO;
        if (invalidInput == null) invalidInput = "please type 'y' or 'n' ";

        Scanner scanner = new Scanner(System.in);
        boolean response;
        if (question != null) System.out.print(question);
        for (int i = 0; i < maxPrompts; i++) {
            System.out.print(prefix);
            String input = scanner.nextLine();
            if (input.equals(yes)) return true;
            if (input.equals(no)) return false;
            System.out.print(invalidInput);
        }

        throw new TooMuchIterationException();
    }

    public static String prompt(String prefix) {
        System.out.print(prefix);
        return new Scanner(System.in).nextLine();
    }
}
