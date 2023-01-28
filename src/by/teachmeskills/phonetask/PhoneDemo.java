package by.teachmeskills.phonetask;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone firstPhone = new Phone(1234, 123, 20.3);
        Phone secondPhone = new Phone(5678,234,30.1);
        Phone thirdPhone = new Phone(9012,456,25.4);

        firstPhone.name = "Anna";
        secondPhone.name = "Olya";
        thirdPhone.name = "Tanya";

        System.out.println(firstPhone.getPhoneInfo());
        System.out.println(secondPhone.getPhoneInfo());
        System.out.println(thirdPhone.getPhoneInfo());

        System.out.println(firstPhone.receiveCall());
        System.out.println(secondPhone.receiveCall());
        System.out.println(thirdPhone.receiveCall());

        System.out.println(firstPhone.getNumber());
        System.out.println(secondPhone.getNumber());
        System.out.println(thirdPhone.getNumber());
    }

}
