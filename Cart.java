public class Cart implements HotelService {
    private int noCarts = 0;

    public Cart(int noOfCarts){
        this.noCarts = noOfCarts;
    }

    @Override
    public String service(){
        return requestCart(noCarts);
    }

    public String requestCart(int noOfCarts){
        return ("Cart/s requested on room number: " + noOfCarts);
    }
}