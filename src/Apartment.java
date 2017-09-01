
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment compared) {
        if(squareMeters > compared.squareMeters) {
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared) {
        int firstPrice = squareMeters * pricePerSquareMeter;
        int secondPrice = compared.squareMeters * compared.pricePerSquareMeter;
        return Math.abs(firstPrice - secondPrice);
    }
    public boolean moreExpensiveThan(Apartment compared) {
        double firstPrice = squareMeters * pricePerSquareMeter;
        double secondPrice = compared.squareMeters * compared.pricePerSquareMeter;
        if(firstPrice > secondPrice) {
            return true;
        }
        return false;
    }
    
}
