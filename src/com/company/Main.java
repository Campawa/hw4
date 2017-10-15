package com.company;


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EditHistory myHistory = new EditHistory();
        System.out.println("Please enter ten words into your edit history");
        boolean isRunning = true;
        while (isRunning) {
            String a = scanner.next();
            isRunning = myHistory.processString(a);
        }
        System.out.println("You quit");
    }
}