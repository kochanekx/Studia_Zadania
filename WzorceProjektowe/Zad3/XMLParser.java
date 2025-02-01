package Studia.WzorceProjektowe.Zad3;

import java.io.StringReader;
import java.util.Optional;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class XMLParser implements Parser {
    @Override
    public Optional<Object> parse(String input) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(input)));
            return Optional.of(document.getDocumentElement().getTextContent()); // Zwraca treść głównego elementu
        } catch (Exception e) {
            System.err.println("Error parsing XML: " + e.getMessage());
            return Optional.empty();
        }
    }
}
