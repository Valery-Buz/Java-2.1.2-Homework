public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill  = 1100;
        int bonus_rub = 1;

        int bonus;
        if (refill > 1000);{
            bonus = refill / 100 * bonus_rub;
        }
        System.out.println("Bonus = " + bonus + " rub");
        balance = bonus + refill + balance;
        System.out.println("Balance = " + balance + " rub");
    }
    }
