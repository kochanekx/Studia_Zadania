package Studia.WzorceProjektowe.Zad3;

public class ParserFactory {
    public static Parser getParser(String type) {
        if (type.equalsIgnoreCase("JSON")) {
            return new JSONParser();
        } else if (type.equalsIgnoreCase("XML")) {
            return new XMLParser();
        } else {
            throw new IllegalArgumentException("Unknown parser type: " + type);
        }
    }
}
