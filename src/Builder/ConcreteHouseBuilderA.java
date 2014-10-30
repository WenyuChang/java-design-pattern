package Builder;

public class ConcreteHouseBuilderA implements IHouseBuilder{
    private House house;  
    public ConcreteHouseBuilderA() {
        house = new House();
    }
    public void buildRoom(int roomNo) {
        house.roomNumber++;
    }

    public void buildDoor(int room1, int room2) {
        house.doorNumber++;
    }

    public void buildHoust() {
    	// This room builder has two rooms and one doors
    	buildRoom(1);
    	buildRoom(2);
    	buildDoor(1,2);
    }
    
    public House getHouse() {
        return house;
    }
}