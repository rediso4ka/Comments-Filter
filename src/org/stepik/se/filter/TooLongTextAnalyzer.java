package org.stepik.se.filter;

public class TooLongTextAnalyzer implements TextAnalyzer {

    int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
