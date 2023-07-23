package hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HOSPITAL {
public static void main(String[] args) {
    
 Scanner cin =new Scanner(System.in);
 Doctor D=new Doctor();
 Doctor D0=new Doctor("mohamed",0,"123456","1111111");
 Doctor D1=new Doctor("osama",1,"123456","1111111");
 Doctor D2=new Doctor("Essam",2,"123456","12121212");
 Doctor D3=new Doctor("DIAA",3,"123456","12233455");
 Doctor D4=new Doctor("Hady",4,"123456","1223445");
            List<Doctor> doctorList=new ArrayList<>();
           doctorList.add(D0);
           doctorList.add(D1);
           doctorList.add(D2);
           doctorList.add(D3);
           doctorList.add(D4); 
 Pation P =new Pation();
 Pation P0 =new Pation("heba",0,"123456","Pain","nasr city");
  Pation P1 =new Pation("eman",1,"136789","Pain","october ");
 Pation P2 =new Pation("Shahd",2,"543276","Pain","fayoum");
 Pation P3 =new Pation("habiba",3,"097435","Pain","badr ");
  Pation P4 =new Pation("mai",4,"097435","Pain"," madinty");
List<Pation>pationList=new ArrayList<>();
           pationList.add(P0);
           pationList.add(P1);
           pationList.add(P2);
           pationList.add(P3);
           pationList.add(P4); 

 Menu1();
  int choice =cin.nextInt();

    switch (choice){
        case 1 :  
Menu2();
int DocChoice  =cin.nextInt();

    switch (DocChoice){
        
        case 1 : 
            System.out.println("Enter your INFO Name&&ID&&PHONE&&SSN");
            D.DR_Name=cin.next();
            D.DR_ID=cin.nextInt();
            D.Phone=cin.next();
            D.SSN=cin.next();
            D.setDR_Name(D.DR_Name);
            D.setDR_ID(D.DR_ID);
            D.setPhone(D.Phone);
            D.setSSN(D.SSN);
            doctorList.add(D);
   //       System.out.println(doctorList.get(5));

break;
           
        case 2 :
        System.out.println(doctorList);
        System.out.println("Enter Targeted ID to Remove");
        int Remove=cin.nextInt(); 
        doctorList.remove(Remove);
        System.out.println("List After Remove");
        System.out.println(doctorList);
 break;
        case 3 :
         System.out.println(doctorList); 
         System.out.println("Enter your MOD NAME"); 
        D.DR_Name  =cin.next();
        System.out.println("Enter Your ID"); 
        D.DR_ID = cin.nextInt();
        System.out.println("Enter your MOD SSN"); 
        D.SSN= cin.next();
         System.out.println("Enter your MOD phone"); 
        D.Phone= cin.next();
         doctorList.set( D.DR_ID, D=new Doctor(D.DR_Name,D.DR_ID, D.Phone,D.SSN  ));
          System.out.println(doctorList); 
 break;
        case 4:
            System.out.println("Do want All List Or ONE ID");
           String Show = cin.next();
           if("ALL".equals(Show)){
            System.out.println(doctorList); 
           }
           else{
            System.out.println("Enter Targeted ID to Show");
            D.DR_ID = cin.nextInt();
      System.out.println(doctorList.get(D.DR_ID)); 
}
           break;
           
    }
    
        case 2 : 
           Menu2();
int AdmChoice  =cin.nextInt(); 

switch(AdmChoice){
    case 1:
         System.out.println("Enter your INFO Name&&ID&&SSN&&DIESEAS&&ADDRESS");
            P.P_Name=cin.next();
            P.P_ID=cin.nextInt();
            P.P_SSN=cin.next();
            P.Disease=cin.next();
            P.Address=cin.next();
            P.setP_Name( P.P_Name);
            P.setP_ID(P.P_ID);
            P.setP_SSN(P.P_SSN);
            P.setDisease(P.Disease);
            P.setAddress(P.Address);
           pationList.add(P);
           System.out.println(pationList);
 break;
    case 2 : 
         System.out.println(pationList);
        System.out.println("Enter Targeted ID to Remove");
        int Remove=cin.nextInt(); 
        pationList.remove(Remove);
        System.out.println("List After Remove");
        System.out.println(pationList);
break;

   case 3 :
         System.out.println(pationList); 
         System.out.println("Enter your MOD NAME"); 
        P.P_Name  =cin.next();
        System.out.println("Enter Your ID"); 
        P.P_ID = cin.nextInt();
        System.out.println("Enter your MOD SSN"); 
        P.P_SSN= cin.next();
         System.out.println("Enter your MOD Disease"); 
        P.Disease= cin.next();
        System.out.println("Enter your MOD Address"); 
        P.Address= cin.next();
         pationList.set( P.P_ID, P=new Pation(P.P_Name,P.P_ID,P.P_SSN,P.Disease,P.Address  ));
          System.out.println(pationList); 
 break;
        case 4:
            System.out.println("Do want All List Or ONE ID");
           String Show = cin.next();
           if("ALL".equals(Show)){
            System.out.println(pationList); 
           }
           else{
            System.out.println("Enter Targeted ID to Show");
            P.P_ID = cin.nextInt();
             System.out.println(pationList.get(P.P_ID)); 
}
       

}
}
  }

public static void Menu1(){
  System.out.println("Enter your state");
   System.out.println("1-Doctor");
   System.out.println("2-Admin");

   
}
public static void Menu2(){
System.out.println("1-ADD");
   System.out.println("2-REMOVE");
   System.out.println("3-UPDATE");
   System.out.println("4-SHOW");
    System.out.println("choice what you want");
            
}
}

    

