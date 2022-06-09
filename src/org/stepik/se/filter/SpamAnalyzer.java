package org.stepik.se.filter;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer{

    String[] keywords;

    public SpamAnalyzer (String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String text) {
        for (String keyword: getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
