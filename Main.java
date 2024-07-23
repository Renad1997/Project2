//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Route route1 = new Route("Address A", "Address B", 100);
        Route route2 = new Route("Address C", "Address D", 150);

        Car car1 = new Car("range-1234", route1, 4);
        Car car2 = new Car("toyota-4567", route2, 0);

        Passenger[] passengers = new Passenger[2];
        passengers[0] = new SubscribersPassengers("Renad", "123",car1,560.34);
        passengers[1] = new NonSubscribersPassengers("sara", "567", car2,150.60,true);

        System.out.println(route1.toString());
        System.out.println(route2.toString());
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(passengers[0].toString());
        System.out.println(passengers[1].toString());


        try {
            passengers[0].reserveCarAndComputeCost(car1);
            passengers[1].reserveCarAndComputeCost(car2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (Passenger passenger : passengers) {
            passenger.displayInfo();
        }


    }
}