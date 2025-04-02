package bookmyshow;


public class FrontDeskOfficer extends Person{
    FrontDeskOfficer(String name, Address address, String email, String phone) {
        super(name, address, email, phone);
    }

    public boolean createBooking(Booking booking)
    {
        return true;
    }
}
