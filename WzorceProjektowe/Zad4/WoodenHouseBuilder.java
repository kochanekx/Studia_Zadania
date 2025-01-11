package Studia.WzorceProjektowe.Zad4;

public class WoodenHouseBuilder implements HouseBuilder {
    private House house;

    public WoodenHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Wooden Piles");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wood and Timber");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wooden Shingles");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Wooden Interior");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
