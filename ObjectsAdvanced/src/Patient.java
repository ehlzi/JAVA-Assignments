import java.util.*;
public class Patient {

    // 1. Create the encapsulated variables patientName, social, dateOfBirth, illness
    String patientName;
    String social;
    String dateOfBirth;

    String address;
    String illness;

    private ArrayList<Payment> payments;

    // We are going to Construct our Patients (We are giving you these)

    // Constructor that just takes in our patientName and social.

    public Patient(String patientName, String social){
        this.patientName = patientName;
        this.social = social;
        payments = new ArrayList<>();
    }

    // Constructor that takes in all your variables

    public Patient(String patientName, String social, String dateOfBirth, String illness){
        this.patientName = patientName;
        this.social = social;
        this.dateOfBirth = dateOfBirth;
        this.illness = illness;
        payments = new ArrayList<>();
    }

    // Getters and Setters
    public void setPatientName(String patientName){
        this.patientName = patientName;
    }

    public String getPatientName(){
        return patientName;
    }

    public void setSocial(String social){
        this.social = social;
    }

    public String getSocial(){
        return social;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    // 2. Build your Getters and Setters for illness.

    public void setillness(String illness){
        this.illness = illness;
    }

    public String getillness(){
        return illness;
    }


    // 3. Create a payment method that will add a payment to the patient using a Payment object as a parameter.
    public Payment payment(Payment Patient) {
        //payments.add(Patient);
        Payment Payment = null;
        return Payment;
    }

    // 4. Create a payment method that gets all the payments for the patient.
    // First, print out the "Patient " and their name.
    // Second, print out "The following are the payments due".
    // Third, traverse the ArrayList to collect all payments.
    // If the payment is paid then don't add any amount if the pateint has not paid then print out the payments and add the bills together.
    // Fourth, print out the total "The total amount due is "

    public void payment() {
        System.out.println("Patient " + patientName);
        System.out.println("The following are the payments due" + payments);
        System.out.println("The total amount due is ");
    }

    @Override
    public String toString() {
        return "patientName=" + patientName + ", social=" + social + ", dateOfBirth=" + dateOfBirth + ", illness=" + illness + "]";
    }
}