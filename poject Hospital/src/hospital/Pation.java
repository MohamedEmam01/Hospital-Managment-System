package hospital;

import java.util.ArrayList;

public class Pation  {
    ArrayList<Doctor> DR = new ArrayList<Doctor>();
    Payment PY=new Payment();
String P_Name ;
int P_ID;
String P_SSN ;
String Disease;
String Address;

    public Pation() {
    }



    public Pation(String P_Name, int P_ID, String P_SSN, String Disease, String Address) {
        this.P_Name = P_Name;
        this.P_ID = P_ID;
        this.P_SSN = P_SSN;
        this.Disease = Disease;
        this.Address = Address;
    }
      public void setP_Name(String P_Name) {
        this.P_Name = P_Name;
    }
        public void setP_ID(int P_ID) {
        this.P_ID = P_ID;
    }


    public String getP_Name() {
        return P_Name;
    }
 public void setP_SSN(String P_SSN) {
        this.P_SSN = P_SSN;
    }
  public void setDisease(String Disease) {
        this.Disease = Disease;
    }
   public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getP_ID() {
        return P_ID;
    }

  
    public String getP_SSN() {
        return P_SSN;
    }

   

    public String getDisease() {
        return Disease;
    }

   

    public String getAddress() {
        return Address;
    }

    @Override
    public String toString() {
        return "Pation{" + "P_Name=" + P_Name + ", P_ID=" + P_ID + ", P_SSN=" + P_SSN + ", Disease=" + Disease + ", Address=" + Address + '}';
    }



    public ArrayList<Doctor> getDR() {
        return DR;
    }




}
