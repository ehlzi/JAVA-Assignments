import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        // 5. You are a receptionist welcoming a new patient create a new patient taking in patient name and the social security number. Use the name John and the social security number of 12345.
        Scanner scanner = new Scanner(System.in);

        Patient patient = new Patient();
        patient.patientName("James");
        patient.social(20);
        patient.setIdNum("12343ms");




        // 6. You are a doctor diagnosing your patient above set the patient's illness. Set John's illness to "cold"


        // 7. You are the billing agent who will add the payment to the patient you created. Create a Payment object that will take in the amount the patient owes, and their Date of Birth. Use these values: 99.95, "June 15 2021".


        // 8. Add payments to your patient (John) for billing purposes.


        // 9. Now send the payment to john (just print it so he can see)


        // 10. Get all payments due to patient (John).

    }

}