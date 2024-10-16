public class Main {
    public static void main(String[] args) {
        Garage myGarage = new Garage();
        Car myCar = new Car();
        Bicycle myBike = new Bicycle();
        Boat myBoat = new Boat();

        myGarage.operateVehicle(myCar);
        myGarage.operateVehicle(myBike);
        myGarage.operateVehicle(myBoat);

    }
}