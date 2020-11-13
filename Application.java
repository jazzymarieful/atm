package sr.unasat.atm.app;

import sr.unasat.atm.services.ATMService;

public class Application {

    public static void main(String[] args) {

        ATMService atms = new ATMService(500);
        atms.snelkasGebruiken(1000);
    }
}
