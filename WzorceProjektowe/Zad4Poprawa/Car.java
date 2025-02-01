package Studia.WzorceProjektowe.Zad4Poprawa;
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double engineSize;

    Car(String make, String model, int year, String color, double engineSize) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engineSize=" + engineSize +
                '}';
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getEngineSize() {
        return engineSize;
    }
}
