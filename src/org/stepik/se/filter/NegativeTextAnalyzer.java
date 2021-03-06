package org.stepik.se.filter;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    public NegativeTextAnalyzer() {
    }

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}
