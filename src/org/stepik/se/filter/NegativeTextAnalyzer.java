package org.stepik.se.filter;

import org.w3c.dom.Text;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

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

    @Override
    public Label processText(String text) {
        for (String smile: getKeywords()) {
            if (text.contains(smile)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
