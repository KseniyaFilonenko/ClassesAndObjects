package by.teachmeskills.creditcardtask;

public class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard firstCreditCard = new CreditCard("12345PB11");
        CreditCard secondCreditCard = new CreditCard("12345PB22");
        CreditCard thirdCreditCard = new CreditCard("12345PB33");

        firstCreditCard.addSum(5);
        secondCreditCard.addSum(50);

        thirdCreditCard.withdrawSum(1);

        System.out.println(firstCreditCard.getInfo());
        System.out.println(secondCreditCard.getInfo());
        System.out.println(thirdCreditCard.getInfo());

        System.out.println(firstCreditCard.getSum());
        System.out.println(secondCreditCard.getSum());
        System.out.println(thirdCreditCard.getSum());
    }
}
