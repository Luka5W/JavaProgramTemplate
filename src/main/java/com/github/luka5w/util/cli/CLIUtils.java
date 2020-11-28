package com.github.luka5w.util.cli;

public class CLIUtils {

    public static void logAndExit(String message, Throwable e) {
        logAndExit(message + (e.getMessage() == null || e.getMessage().equals("") ? e.getClass().getName() : e.getMessage()), -1);
    }

    public static void logAndExit(String message, int status) {
        System.out.println(message);
        System.exit(status);
    }
}
