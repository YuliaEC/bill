public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int amount = 1100;
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Счет клиента: " + (startBalance + amount + bonus) + " рублей");

    }

}