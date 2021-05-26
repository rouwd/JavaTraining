package dan.rouw;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20,20,5);
//	    Case theCase = new Case("220B","Dell","240w", dimensions);
//
//	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));
//
//	    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",4,6,"v2.44");
//
//	    PC thePC = new PC(theCase,theMonitor,theMotherboard);
//	    thePC.powerUp();

	    Door hallwayDoor = new Door("brown", "wood", true);
	    Room livingRoom = new Room(15,20,"carpet",hallwayDoor);

	    Door bathroomDoor = new Door("white", "wood", false);
	    Room bathroom = new Room(10,10,"tile", bathroomDoor);
		House house = new House("white",2,"colonial",livingRoom, bathroom);

		System.out.println("Is the livingroom door open? " + house.isLivingRoomDoorOpen());
		house.closeLivingRoomDoor();
		System.out.println("Is the livingroom door open? " + house.isLivingRoomDoorOpen());

    }
}
