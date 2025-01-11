package Studia.WzorceProjektowe.Zad2.AbstractFactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        modernChair.sitOn();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        victorianChair.sitOn();
    }
}
