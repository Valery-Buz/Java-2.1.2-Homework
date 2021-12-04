public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        int bonusRub = 1;

        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100 * bonusRub;
        }
        System.out.println("Bonus = " + bonus + " rub");
        balance = bonus + refill + balance;
        System.out.println("Balance = " + balance + " rub");
    }
}
