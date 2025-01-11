package Studia.WzorceProjektowe.Zad4;

public class Main {
    public static void main(String[] args) {
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        ConstructionEngineer engineer1 = new ConstructionEngineer(woodenHouseBuilder);
        House woodenHouse = engineer1.constructHouse();
        System.out.println("Wooden House: " + woodenHouse);

        HouseBuilder brickHouseBuilder = new BrickHouseBuilder();
        ConstructionEngineer engineer2 = new ConstructionEngineer(brickHouseBuilder);
        House brickHouse = engineer2.constructHouse();
        System.out.println("Brick House: " + brickHouse);
    }
}
