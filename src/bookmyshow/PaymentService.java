package bookmyshow;

public class PaymentService {
    private static PaymentService paymentService;
    private Payment payment;
    private PaymentService(){

    }

    public static PaymentService getInstance(){
        if(paymentService == null){
            synchronized (PaymentService.class){
                if(paymentService == null){
                    paymentService = new PaymentService();
                }
            }
        }
        return paymentService;
    }

    public boolean pay(Booking booking) {
       return payment.pay(booking);
    }
}
