package Studia.WzorceProjektowe.Zad2.AbstractFactory;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
