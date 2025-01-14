public class main {
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label result = Label.OK;
        for (TextAnalyzer analyzer : analyzers){
            result = analyzer.processText(text);
            if ( result != Label.OK) {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Label new1 = checkLabels(new TextAnalyzer[] {
                new SpamAnalyzer(new String[]{"казино", "три", "топора"}),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(100)
        },"Во саду ли в или огороде :( казино");
        System.out.println(new1);
    }
}
