package org.sydlabz;

public class FilteredInput {
    private StringBuffer input;

    public FilteredInput() {
        input = new StringBuffer();
    }

    public void append(char character) {
        this.input.append(character);
    }

    public String getInput() {
        return input.toString();
    }
}
