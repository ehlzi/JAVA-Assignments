public class CreditCard{

    private String name;

    private String creditCardNumber;

    private String expirationDate;

    private int cvv;

    //name
    public void setName(String name){

        this.name = name;

    }

    public String getName(){

        System.out.println("Cardholder Name: " + name);
        return name;

    }

    //creditCardNumber
    public void setcreditCardNumber(String creditCardNumber) {

        this.creditCardNumber = creditCardNumber;

    }

    public String getcreditCardNumber() {

        System.out.println("Card Number: " + creditCardNumber);
        return creditCardNumber;

    }

    //expirationDate
    public void setexpirationDate(String expirationDate) {

        this.expirationDate = expirationDate;

    }

    public String getexpirationDate() {

        System.out.println("Expiration Date: " + expirationDate);
        return expirationDate;

    }

    //cvv
    public void setcvv(int cvv) {

        this.cvv = cvv;

    }

    public int getcvv() {

        System.out.println("CVV: " + cvv);
        return cvv;

    }

}