package com.company;


import java.util.*;
import java.util.Scanner;
import java.util.Stack;
public class EditHistory {
    Stack<String> myStack;
    String deletedWord;
    public EditHistory() {
        myStack = new Stack<>();
    }
    public boolean processString(String a) {
        if (myStack.size() == 10) {
            System.out.println("History Full");
            for (String b : myStack) {
                System.out.println(b);
            }
        }
        if (a.toLowerCase().equals("quit")) {
            return false;
        }
        try{
            if (a.toLowerCase().equals("delete")) {
                deletedWord = myStack.pop();
                System.out.println("Deleted word: " + deletedWord);
                System.out.println(myStack);
            } else if (a.toLowerCase().equals("undo")) {
                System.out.println("Undo for word: " + deletedWord);
                myStack.add(deletedWord);
                System.out.println(myStack);
            } else if (a.toLowerCase().equals("copy")) {
                String copiedWord = myStack.peek();
                myStack.add(copiedWord);
                System.out.println("Copied Word " + copiedWord);
                System.out.println(myStack);
            } else {
                myStack.add(a);
            }
        }catch (EmptyStackException emptystackexception){
            System.out.println("There's nothing left in the stack");
        }


        return true;
    }
}
