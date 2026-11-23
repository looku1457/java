import java.util.Scanner;

public class Main {
    public static void main() {
        Barista barista1 = new Barista(3000, 1);

        Customer customer1 = new Customer("홍길동", 10000, false);
        customer1.order(barista1,"아메리카노");
        System.out.println("---");
        customer1.order(barista1,"아메리카노");

        System.out.println("---");
        customer1.checkMoney();
    }
}
