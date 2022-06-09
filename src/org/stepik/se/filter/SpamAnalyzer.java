package org.stepik.se.filter;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer{

    String[] keywords;

    public SpamAnalyzer (String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return null;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
