package Builder;
/*
 *  An abstract Builder
 */
public interface IHouseBuilder  {
    public void buildRoom(int roomNo);
    public void buildDoor(int room1, int room2);
    public void buildHoust();
    public House getHouse();
}