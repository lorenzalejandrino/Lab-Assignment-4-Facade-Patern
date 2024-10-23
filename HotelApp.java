public class HotelApp{
    public static void main(String[] args){
        String plateNumber = "GGX691";
        int roomNumber = 25;
        int noCarts = 9;

        HotelService valet = new Valet(plateNumber);
        HotelService houseKeeping = new HouseKeeping(roomNumber);
        HotelService cart = new Cart(noCarts);

        FrontDesk valetService = new FrontDesk(valet);
        FrontDesk houseKeepingService = new FrontDesk(houseKeeping);
        FrontDesk cartService = new FrontDesk(cart);

        System.out.println(valetService.service());
        System.out.println(houseKeepingService.service());
        System.out.println(cartService.service());
    }
}