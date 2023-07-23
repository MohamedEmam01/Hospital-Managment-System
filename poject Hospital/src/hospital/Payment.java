package hospital;

public class Payment {
    
    double Cash;
    String Credid;

    public Payment() {
    }

    
    public Payment(double Cash, String Credid) {
        this.Cash = Cash;
        this.Credid = Credid;
    }

    @Override
    public String toString() {
        return "Payment{" + "Cash=" + Cash + ", Credid=" + Credid + '}';
    }
    
   
     

}
