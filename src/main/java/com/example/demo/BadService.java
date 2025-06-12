package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class BadService {
    public static final int MAGIC_NUMBER = 42;
    private static List<String> data = new ArrayList<>();
    public String unusedField;

    public BadService() {
        // Nothing here
    }

    public void doEverything(String input) {
        if (input != null) {
            if (input.length() > 0) {
                if (input.equals("admin")) {
                    System.out.println("Admin logged in");
                } else if (input.equals("guest")) {
                    System.out.println("Guest user");
                } else {
                    if (input.contains("x")) {
                        System.out.println("Contains x");
                    } else {
                        System.out.println("Unknown user");
                    }
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            // do nothing
        }

        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            e.printStackTrace(); // SonarQube odia esto
        }
    }

    public void doNothing() {
        // Intentionally empty
    }

    public int complexMethod(int a, int b, int c, int d, int e) {
        if (a > b) {
            if (c > d) {
                return e;
            } else {
                return d;
            }
        } else {
            return a + b + c + d + e;
        }
    }

    public void recursiveMethod() {
        recursiveMethod();
    }
}