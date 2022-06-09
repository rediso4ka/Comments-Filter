package org.stepik.se.filter;

import org.w3c.dom.Text;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    public NegativeTextAnalyzer() {
    }

    @Override
    protected String[] getKeywords() {
        String[] smiles = {":(", "=(", ":|"};
        return smiles;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
