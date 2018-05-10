public enum PlaneType {

    BOEING_747(1000000, 400),
    BOEING_787(1234000, 300);


    public final int BASE_PRICE;
    public final int SEATS_LIMIT;

    PlaneType(int basePrice, int seatsLimit) {
        this.BASE_PRICE = basePrice;
        this.SEATS_LIMIT = seatsLimit;
    }

}
