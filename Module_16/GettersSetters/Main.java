class Main {

    public static void main(String[] args) {

        CreditCard card = new CreditCard();

        card.setName("Annabeth Chase");

        card.setcreditCardNumber("3242542123112744");

        card.setexpirationDate("01/25");

        card.setcvv(633);

        System.out.println("Your card details:");

        card.getName();

        card.getcreditCardNumber();

        card.getexpirationDate();

        card.getcvv();

    }

}