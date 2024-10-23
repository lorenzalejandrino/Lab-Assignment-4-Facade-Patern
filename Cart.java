public class Cart implements HotelService {
    private int noCarts = 0;

    public Cart(int noCarts){
        this.noCarts = noCarts;
    }

    @Override
    public String service(){
        return requestCart(noCarts);
    }

    public String requestCart(int noCarts){
        return ("Cart/s requested on room number: " + noCarts);
    }
}
