package org.sydlabz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Observable;

public class KeyBoardObservable extends Observable {
    private BufferedReader reader;
    private char inputChar;

    public KeyBoardObservable(InputStream inputStream) {
        super();
        reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    public char read() throws IOException {
        char character = (char) reader.read();
        if (FilterUtil.doFilter(character)) {
            inputChar = character;
            setChanged();
            notifyObservers();
        }
        if (inputChar == '\n') {
            deleteObservers();
        }
        return character;
    }

    public char getInputChar() {
        return inputChar;
    }
}
