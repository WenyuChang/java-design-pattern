package Builder;
/*
 *  This class is a Director
 */
public class HouseDirector  {
	IHouseBuilder builder;
	public HouseDirector(IHouseBuilder builder) {
		this.builder = builder;
	}
    public House CreateHouse() {
    	builder.buildHoust();
        return builder.getHouse();
    }
}