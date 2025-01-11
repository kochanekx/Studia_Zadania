package Studia.WzorceProjektowe.Zad4;

public class BrickHouseBuilder implements HouseBuilder {
    private House house;

    public BrickHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete and Rebar");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Brick Walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete and Tiles");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Modern Interior");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
