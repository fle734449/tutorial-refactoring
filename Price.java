public abstract class Price {
    public abstract int getPriceCode();

    abstract double getCharge(int daysRented);


    int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 0;
        // add frequent renter points
        frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
