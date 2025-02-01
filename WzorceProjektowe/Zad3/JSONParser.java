package Studia.WzorceProjektowe.Zad3;

import java.util.Optional;

public class JSONParser implements Parser {
    @Override
    public Optional<Object> parse(String input) {
        try {
            JSONObject jsonObject = new JSONObject(input);
            return Optional.of(jsonObject.toMap());
        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
            return Optional.empty();
        }
    }
}
