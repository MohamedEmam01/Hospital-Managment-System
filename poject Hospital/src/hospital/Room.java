package hospital;

import java.util.ArrayList;

public class Room {
    ArrayList<Pation> patient = new ArrayList<Pation>();
    
     String Room_Type;
    String Room_Name;

    public Room() {
    }

    public Room(String Room_Type, String Room_Name) {
        this.Room_Type = Room_Type;
        this.Room_Name = Room_Name;
    }


    
    
}
