package Studia.WzorceProjektowe.Zad3;

public class Main {
    public static void main(String[] args) {
        String jsonInput = "{\"key\": \"value\"}";
        String xmlInput = "<key>value</key>";

        Parser jsonParser = ParserFactory.getParser("JSON");
        jsonParser.parse(jsonInput);

        Parser xmlParser = ParserFactory.getParser("XML");
        xmlParser.parse(xmlInput);
    }
}
