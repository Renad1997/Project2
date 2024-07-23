public class SubscribersPassengers extends Passenger {


    public SubscribersPassengers(String name, String id, Car reservedCar, double tripCost) {
        super(name, id, reservedCar, tripCost);
    }



    @Override
    public void reserveCarAndComputeCost(Car car ) throws Exception {
        this.getReservedCar().getCode().equals(getReservedCar());
        Car reservedCar = this.getReservedCar();
        if (car.getMaxCapacity()==0) {
            throw new Exception("Cannot reserve car: maximum capacity reached.");
        }
        setReservedCar(car);
        if(getReservedCar()!= null){
            double tripCost= getReservedCar().getRoute().getTripPrice()* 0.5;
            getTripCost();
        }








    }







}
