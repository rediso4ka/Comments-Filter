package org.stepik.se.filter;

public class SpamAnalyzer implements TextAnalyzer{

    String[] keywords;

    public SpamAnalyzer (String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
