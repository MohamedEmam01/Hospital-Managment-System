package hospital;

import java.util.ArrayList;

public class Pharmacy {
   Pation p=new Pation();
   
    String PH_Name;
    String Phone;
    String Address;

    public Pharmacy(String PH_Name, String Phone, String Address) {
        this.PH_Name = PH_Name;
        this.Phone = Phone;
        this.Address = Address;
    }
    
   
    public String getPH_Name() {
        return PH_Name;
    }

    public void setPH_Name(String PH_Name) {
        this.PH_Name = PH_Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }


    @Override
    public String toString() {
        return "Pharmacy{"  + ", PH_Name=" + PH_Name + ", Phone=" + Phone + ", Address=" + Address + '}';
    }
      
}
