package sr.unasat.atm.services;

public class ATMService {

    public ATMService(double balance) {
        this.balance = balance;
    }

    private double balance;
    private static int[] amountoptions = {50, 100, 200, 400, 600, 800, 1000};

    public void snelkasGebruiken(int amount) {

        if (!isAmountWithdrawable(amount)) {
            System.out.println("Your balance is less then withdrawal amount, try again!");
            return;
        }

        String message = "You have chosen SRD";
        switch (amount) {
            case 50: message += amountoptions[0];
            break;
            case 100: message += amountoptions[1];
            break;
            case 200: message += amountoptions[2];
            break;
            case 400: message += amountoptions[3];
            break;
            case 600: message += amountoptions[4];
            break;
            case 800: message += amountoptions[5];
            break;
            case 1000: message += amountoptions[6];
            break;
            default: System.out.println("Incorrect amount, choose between SRD50, 100, 200, 400, 600, 800, 1000");
        }
        System.out.println(message);

        balance -= amount;

        System.out.println("Your new balance is SRD" + balance);

        }

    private boolean isAmountWithdrawable(int amount) {
        return (balance - amount >= 0);
    }
}
