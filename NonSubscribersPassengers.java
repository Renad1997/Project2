public class NonSubscribersPassengers extends Passenger {

    private boolean discountCoupon;

    public NonSubscribersPassengers(String name, String id, Car reservedCar, double tripCost, boolean discountCoupon) {
        super(name, id, reservedCar, tripCost);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }


    @Override
    public void reserveCarAndComputeCost(Car car) throws Exception {
        this.getReservedCar().getCode().equals(getReservedCar());
        Car reservedCar = this.getReservedCar();
        if (car.getMaxCapacity()==0 ) {
            throw new Exception("Cannot reserve car: maximum capacity reached.");
        }

        if (discountCoupon) {

            double tripCost =getReservedCar().getRoute().getTripPrice() - (getReservedCar().getRoute().getTripPrice() * 0.1);
            getTripCost();
        } else {

            double tripCost= getReservedCar().getRoute().getTripPrice();
            getTripCost();
        }

    }
}
