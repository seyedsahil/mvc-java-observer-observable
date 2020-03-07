package org.sydlabz;

import java.util.Observable;
import java.util.Observer;

public class KeyBoardObserver implements Observer {
    private KeyBoardObservable keyBoardObservable;
    private FilteredInput safeCommand;

    public KeyBoardObserver(KeyBoardObservable keyBoardObservable, FilteredInput safeCommand) {
        super();
        this.keyBoardObservable = keyBoardObservable;
        this.safeCommand = safeCommand;
    }

    @Override
    public void update(Observable observable, Object parameters) {
        if (observable instanceof KeyBoardObservable && observable == keyBoardObservable) {
            keyBoardObservable = (KeyBoardObservable) observable;
            safeCommand.append(keyBoardObservable.getInputChar());
        } else {
            throw new RuntimeException("Invalid application state.");
        }
    }
}
