package hospital;
import java.util.List;
public class Admin extends Doctor {
    private int AD_ID;
    private String AD_Name;
    private String AD_SSN;
    private String AD_Phone;
   private List<Doctor>Doctors;
   private List<Pation>Pation;

    public Admin(String DR_Name, int DR_ID, String SSN, String Phone) {
        super(DR_Name, DR_ID, SSN, Phone);
    }


    public Admin(List<Doctor> Doctors, List<Pation> Pation, String DR_Name, int DR_ID, String SSN, String Phone) {
        super(DR_Name, DR_ID, SSN, Phone);
        this.Doctors = Doctors;
        this.Pation = Pation;
    }

    
 
    


    public void setAD_ID(int AD_ID) {
        this.AD_ID = AD_ID;
    }

    public void setAD_Name(String AD_Name) {
        this.AD_Name = AD_Name;
    }

    public void setAD_SSN(String AD_SSN) {
        this.AD_SSN = AD_SSN;
    }

    public void setAD_Phone(String AD_Phone) {
        this.AD_Phone = AD_Phone;
    }

    public int getAD_ID() {
        return AD_ID;
    }

    public String getAD_Name() {
        return AD_Name;
    }

    public String getAD_SSN() {
        return AD_SSN;
    }

    public String getAD_Phone() {
        return AD_Phone;
    }
    public void AddDoctor(Doctor doctor){
        Doctors.add(doctor);
    
    }
        public void AddPation(Pation pation){
        Pation.add(pation);
        }

    @Override
    public String toString() {
        return "Admin{" + "AD_ID=" + AD_ID + ", AD_Name=" + AD_Name + ", AD_SSN=" + AD_SSN + ", AD_Phone=" + AD_Phone + '}';
    }


}
