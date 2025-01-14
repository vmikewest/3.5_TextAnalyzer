public class SpamAnalyzer extends KeywordAnalyzer{

    public SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

}
