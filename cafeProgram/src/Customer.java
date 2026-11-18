public class Customer {
    private int money;
    private boolean hasCoffee;
    private String name;

    public Customer() {
        name = "";
        money = 0;
        hasCoffee = false;
    }

    public Customer(String name, int money) {
        this.name = name;
        this.money = 0;
        hasCoffee = false;
    }

    public Customer(String name, int money, boolean hasCoffee) {
        this.name = name;
        this.money = money;
        this.hasCoffee = hasCoffee;
    }

    public void checkMoney() {
        System.out.println("[손님] "+this.money+"원 남았습니다.");
    }

    public void getPayBack(int payBack) {
        money += payBack;
    }

    // 잔액이 부족할 경우 -9, 정상일 경우 0
    public int pay(int coffeePrice) {
        if (money < coffeePrice) {
            System.out.println(name+"[손님] 잔액이 부족합니다.");
            return -9;
        }
        money = money - coffeePrice;
        return 0;
    }

    public void order(Barista barista, String menuName) {
        if (!hasCoffee) {
            System.out.println(name+"[손님] "+menuName+"를 한 잔 주세요");
        } else {
            System.out.println(name+"[손님] "+menuName+"를 한 잔 더주세요!");
        }

        int price = barista.getCoffeePrice(); // 바리스타가 손님에게 정보 제공
        System.out.println("[바리스타] 커피 가격은 "+price+"원 입니다.");

        int paymentCheck = pay(price); //지불하기 돈이 없으면
        if (paymentCheck == -9) {
            return;
        }
        else if (paymentCheck == 0) { //돈이 있으면
            System.out.println(name+"[손님] " + price + "원을 지불 했습니다.");
            String coffee = barista.takeOrder(this, "아메리카노", 3000);
            takeCoffee(coffee);
        }
    }

    public void takeCoffee(String coffee) {
        hasCoffee = true;
        if (coffee == "0") {
            System.out.println("[손님] 이 환불 받았습니다.");
        } else {
            System.out.println(name+"[손님] "+coffee+"를 받았습니다.");
        }
    }

    public void print() {
        System.out.println(money);
        System.out.println(hasCoffee);
    }
}
