package Builder;

/**
 * Intent
 * 
 * Separate the construction of a complex object from
 * its representation so that the same construction 
 * process can create different representations.
 */
/*
 *  A test client to create a house
 *  but we do not know how the room and door be created
 */
public class Client  {
	private static final String houseType = "B";
	
    public Client() {
    }

    public static void main(String[] args) {
    	// The client creates the Director object and configures it with the desired Builder object
    	IHouseBuilder myHouseBuilder = null;
    	if("A".equals(houseType)) {
    		myHouseBuilder = new ConcreteHouseBuilderA();
    	} else if("B".equals(houseType)) {
    		myHouseBuilder = new ConcreteHouseBuilderB();
    	}
        HouseDirector myHouseDirector = new HouseDirector(myHouseBuilder);
        House myHouse = myHouseDirector.CreateHouse();

        System.out.println("My house has room: " + myHouse.getRoomNumber());
        System.out.println("My house has door: " + myHouse.getDoorNumber());
    }
}