
package hospital;

import java.util.ArrayList;

public class HospitaLl{
   ArrayList<Admin>admin=new ArrayList<Admin>();
   ArrayList<Pharmacy> Pharmacy = new ArrayList<Pharmacy>();
   ArrayList<Doctor> Doctor= new ArrayList<Doctor>();
   ArrayList<Room> Room = new ArrayList<Room>();

String Location;
int Hos_ID;

    public HospitaLl(String Location, int Hos_ID) {
        this.Location = Location;
        this.Hos_ID = Hos_ID;
    }

    public void setAdmin(ArrayList<Admin> admin) {
        this.admin = admin;
    }

    public void setPharmacy(ArrayList<Pharmacy> Pharmacy) {
        this.Pharmacy = Pharmacy;
    }

    public void setDoctor(ArrayList<Doctor> Doctor) {
        this.Doctor = Doctor;
    }

    public void setRoom(ArrayList<Room> Room) {
        this.Room = Room;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setHos_ID(int Hos_ID) {
        this.Hos_ID = Hos_ID;
    }

    public ArrayList<Admin> getAdmin() {
        return admin;
    }

    public ArrayList<Pharmacy> getPharmacy() {
        return Pharmacy;
    }

    public ArrayList<Doctor> getDoctor() {
        return Doctor;
    }

    public ArrayList<Room> getRoom() {
        return Room;
    }

    public String getLocation() {
        return Location;
    }

    public int getHos_ID() {
        return Hos_ID;
    }

    @Override
    public String toString() {
        return "HospitaLl{" + "admin=" + admin + ", Pharmacy=" + Pharmacy + ", Doctor=" + Doctor + ", Room=" + Room + ", Location=" + Location + ", Hos_ID=" + Hos_ID + '}';
    }

   


   
        
}
