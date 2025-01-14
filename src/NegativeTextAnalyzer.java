public class NegativeTextAnalyzer extends KeywordAnalyzer{

    public NegativeTextAnalyzer(){
        this.keywords = new String[] {":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }
}
