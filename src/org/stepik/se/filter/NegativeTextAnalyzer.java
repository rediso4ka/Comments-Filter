package org.stepik.se.filter;

import org.w3c.dom.Text;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    public NegativeTextAnalyzer() {
    }

    @Override
    protected String[] getKeywords() {
        return new String[0];
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
