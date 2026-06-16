package d3.p47;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new Phone();

        Phone phone2 = new SmartPhone("홍길동");
        phone2.turnOn();
//        phone2.internetSearch();
        phone2.turnOff();

        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
