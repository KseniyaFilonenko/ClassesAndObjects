package by.teachmeskills.phonetask;
/*Класс Phone.
Создайте класс Phone, который содержит переменные number, model и
weight.
Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
Добавить в класс Phone методы:
receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три
параметра для инициализации переменных класса - number, model и
weight.
Добавить конструктор, который принимает на вход два параметра для
инициализации переменных класса - number, model.
Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два
параметра - имя звонящего и номер телефона звонящего. Вызвать этот
метод.
Создать метод sendMessage с аргументами переменной длины (Шилдт, стр. 213).
Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
Метод выводит на консоль номера этих телефонов.
*/
public class Phone {
    long phoneNumber;
    int phoneModel;
    double phoneWeight;
    String name;
    public Phone(long phoneNumber, int phoneModel, double phoneWeight){
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneWeight = phoneWeight;
    }
    public Phone(String name){
        this.name = name;
    }
    public String getPhoneInfo(){
        return "Phone number: " + phoneNumber + "; Phone model: " + phoneModel + "; Phone weight: " + phoneWeight;
    }
    public String receiveCall(){
        return name + " calling";
    }
    public long getNumber(){
        return phoneNumber;
    }
    public Phone(long phoneNumber, int phoneModel){
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
    }
    public Phone() {
    }
    public void receiveCall(String name, long phoneNumber){
        System.out.println(name + " calling from the following number: " + phoneNumber);
    }
    /*Не получилось создать:
-Вызвать из конструктора с тремя параметрами конструктор с двумя.

-Создать метод sendMessage с аргументами переменной длины (Шилдт, стр. 213).
Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
Метод выводит на консоль номера этих телефонов.*/
}
