package hospital;
import java.util.ArrayList;
import  java.util.List;

public class Doctor {
       ArrayList<Pation> patient = new ArrayList<Pation>();
      
   protected String DR_Name ;
   protected int DR_ID;
   protected String SSN ;
   protected String Phone;

    public Doctor() {
    }
 

    public Doctor(String DR_Name, int DR_ID, String SSN, String Phone) {
        this.DR_Name = DR_Name;
        this.DR_ID = DR_ID;
        this.SSN = SSN;
        this.Phone = Phone;
    }

    

    public void setDR_Name(String DR_Name) {
        this.DR_Name = DR_Name;
    }

    public void setDR_ID(int DR_ID) {
        this.DR_ID = DR_ID;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getDR_Name() {
        return DR_Name;
    }

    public int getDR_ID() {
        return DR_ID;
    }

    public String getSSN() {
        return SSN;
    }

    public String getPhone() {
        return Phone;
    }

    @Override
    public String toString() {
        return "Doctor{DR_Name=" + DR_Name + ", DR_ID=" + DR_ID + ", SSN=" + SSN + ", Phone=" + Phone + '}';
    }

   
   
    
}
