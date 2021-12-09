package ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int amount = cs.nextInt();

        ATM atm = new ATM();
        atm.process(amount);
    }
}
