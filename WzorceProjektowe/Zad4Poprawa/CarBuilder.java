package Studia.WzorceProjektowe.Zad4Poprawa;

// CarBuilder.java
public class CarBuilder {
    private String make;
    private String model;
    private int year;
    private String color;
    private double engineSize;

    // Konstruktor Builder-a z wymaganymi parametrami
    public CarBuilder(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Metody do ustawiania opcjonalnych parametrów
    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setEngineSize(double engineSize) {
        this.engineSize = engineSize;
        return this;
    }

    // Metoda build, która tworzy obiekt Car
    public Car build() {
        return new Car(make, model, year, color, engineSize);
    }
}
