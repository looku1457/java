public class Barista {
    private int coffeePrice;
    private int beanCount;
    private int cashBox;

    public Barista() {
        coffeePrice = 3000;
        beanCount = 2;
        cashBox = 0;
    }

    public Barista(int coffeePrice, int beanCount) {
        this.coffeePrice = coffeePrice;
        this.beanCount = beanCount;
        cashBox = 0;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public boolean checkCoffee() {
        if (beanCount > 0)
            return true;
        else return false;
    }

    public String makeCoffee(String menuName) {
        beanCount = beanCount - 1;
        System.out.println("[바리스타] 재조가 완료 되었습니다. 현재 완두: "+beanCount+"개");
        return menuName;
    }

    public String takeOrder(Customer customer, String menuName, int payment) {
        System.out.println("[바리스타] 주문을 확인 했습니다.");

        if (checkCoffee() == false) { //원두가 없으면
            System.out.println("[바리스타] 원두가 없어서 주문이 불가능합니다.");
            customer.getPayBack(coffeePrice);
            System.out.println("[바리스타] 환불 되었습니다.");
            return "0";
        }

        cashBox = cashBox + 3000; //원두가 있으면
        System.out.println("[바리스타] 잔고는 "+cashBox+"원 입니다.");

        String madeCoffee = makeCoffee(menuName);
        return madeCoffee;
    }
}
