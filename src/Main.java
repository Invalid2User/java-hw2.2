public class Main {
    public static void main(String[] args) {
        int initialBalance = 550;
        int payment = 500;

        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int overall;
        if (payment <= 999 ) {
            overall = initialBalance + payment;
        } else {
            overall = initialBalance + payment + bonus;
        }

        System.out.println("На Вашем счету " + overall + " рублей.");

        if (bonus >= 1) {
            System.out.println("Вам начислено " + bonus + " бонусных рублей.");
        } else {
            System.out.println("Вы можете получить бонусные рубли при пополнении Вашего счета на сумму от 1000 рублей!");
        }

    }}