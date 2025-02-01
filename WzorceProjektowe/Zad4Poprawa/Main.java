package Studia.WzorceProjektowe.Zad4Poprawa;

// Main.java
public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder("Toyota", "Corolla")
                .setYear(2021)
                .setColor("Red")
                .setEngineSize(1.8)
                .build();

        System.out.println(car);
    }
}