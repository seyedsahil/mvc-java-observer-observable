package org.sydlabz;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        KeyBoardObservable keyBoardObservable = new KeyBoardObservable(System.in);
        KeyBoardObserver keyBoardObserver = new KeyBoardObserver(keyBoardObservable);
        keyBoardObservable.addObserver(keyBoardObserver);
        while (true) {
            char input = keyBoardObservable.read();
            if (input == '\n') {
                break;
            }
        }
        System.out.println("Filtered Input: " + keyBoardObserver.getSafeCommand());
    }
}
