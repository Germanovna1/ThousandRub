public class Main {
    public static void main(String[] args) {
        int wallet = 200;
        int amount = 1100;

        int bonus;
        if (amount > 1000) {
            bonus = 1;
        } else
            bonus = 0;

        int total = amount / 100 * bonus;
        System.out.println("Итого бонусов:" + total);

        int total2 = wallet + amount;

        System.out.println("Итого сумма в руб.:" + total2);
    }
}