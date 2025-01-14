public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected String[] keywords;
    abstract protected Label getLabel();

    protected abstract String[] getKeywords();

    @Override
    public Label processText(String text) {
        for (String keyword : keywords) {
            if (text.indexOf(keyword) > 0){
                return this.getLabel();
            }
        }
        return Label.OK;
    }
}
