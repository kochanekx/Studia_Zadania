package Studia.WzorceProjektowe.Zad3;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String jsonInput = "{\"key\": \"value\"}";
        String xmlInput = "<key>value</key>";

        Parser jsonParser = ParserFactory.getParser("JSON");
        Optional<Object> jsonResult = jsonParser.parse(jsonInput);
        jsonResult.ifPresent(result -> System.out.println("Parsed JSON: " + result));

        Parser xmlParser = ParserFactory.getParser("XML");
        Optional<Object> xmlResult = xmlParser.parse(xmlInput);
        xmlResult.ifPresent(result -> System.out.println("Parsed XML: " + result));
    }
}
