# Hospital Management System

The Hospital Management System is a Java-based project that aims to streamline hospital operations and provide efficient management of patients, doctors, pharmacies, rooms, payments, and administrators. The system utilizes an Entity-Relationship Diagram (ERD) to define the relationships between different entities in the hospital.

## Entity-Relationship Diagram (ERD)

The ERD diagram represents the entities and their attributes in the Hospital Management System:

### Patient (Pation)

- Name: String
- Phone: Double
- P_ID: int
- Disease: String
- Address: String

### Pharmacy

- Name: String
- PH_ID: int
- SSN: String
- Phone: String
- Address: String

### Hospital

- Location: String
- Name: String
- HOS_ID: double

### Doctor

- Name: String
- ID: int
- SSN: String
- Phone: String

### Room

- RoomType: String
- RoomID: String

### Payment

- Cash: Float
- Credit: String

### Admin

- Admin_ID: String
- Admin_Name: String
- Admin_SSN: String
- Admin_Phone: String

## Project Files

The Hospital Management System project consists of the following Java files:

- `Admin.java`: Contains the Admin class with attributes and methods related to administrators.
- `Doctor.java`: Defines the Doctor class with attributes and methods for doctor-related functionalities.
- `HOSPITAL.java`: Represents the Hospital class, including attributes and methods for hospital information.
- `HospitaLl.java`: Contains the main class that serves as the entry point of the application.
- `Pation.java`: Defines the Pation class with attributes and methods related to patients.
- `Payment.java`: Represents the Payment class, including attributes and methods for payment details.
- `Pharmacy.java`: Contains the Pharmacy class with attributes and methods related to pharmacies.
- `Room.java`: Represents the Room class, including attributes and methods for room details.

## Functionality

The Hospital Management System provides the following functionalities:

- Managing patient information and their medical conditions.
- Storing pharmacy details, including prescriptions and medication.
- Handling hospital information, such as location and name.
- Managing doctor details, appointments, and patient consultations.
- Organizing room types and their availability.
- Recording payment details for medical services.

## Usage

The Hospital Management System is implemented in Java. To run the project, ensure you have a Java Development Kit (JDK) installed. You can compile and run the project using a Java IDE or the command line.

To compile and run the main class (HospitaLl.java):

```bash
javac HospitaLl.java
java HospitaLl
