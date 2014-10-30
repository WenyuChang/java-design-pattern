package Builder;

public class ConcreteHouseBuilderB implements IHouseBuilder{
    private House house;  
    public ConcreteHouseBuilderB() {
        house = new House();
    }
    public void buildRoom(int roomNo) {
        house.roomNumber++;
    }

    public void buildDoor(int room1, int room2) {
        house.doorNumber++;
    }

    public void buildHoust() {
    	// This room builder has four rooms and four doors
    	buildRoom(1);
    	buildRoom(2);
    	buildRoom(3);
    	buildRoom(4);
    	buildDoor(1,2);
    	buildDoor(2,3);
    	buildDoor(3,4);
    	buildDoor(1,4);
    }
    
    public House getHouse() {
        return house;
    }
}