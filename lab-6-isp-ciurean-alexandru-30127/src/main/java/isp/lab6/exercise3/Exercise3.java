package isp.lab6.exercise3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        boolean optionContinue = false;
        ATM atm = new ATM();

        System.out.println("Insert your card");

        Card card1 = new Card("123456", "5050");
        Card card2 = new Card("765123", "5671");

        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(card1);
        cards.add(card2);

        Account account1 = new Account("ana", 34999, card1);
        Account account2 = new Account("cristina", 400000, card2);

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);

        Scanner in = new Scanner(System.in);
        System.out.println("Insert index:");
        int i = in.nextInt();
        System.out.println("Insert pin");
        Scanner p = new Scanner((System.in));
        String pin = p.nextLine();
        if ((atm.insertCard(cards.get(i), pin))) {
            System.out.println("PIN ok");
            optionContinue = true;
        } else {
            System.out.println("PIN incorect");
        }
        while (optionContinue) {
            System.out.println(ATM.userMenu() + "\n Your option is:\n");
            Scanner o = new Scanner(System.in);
            int option = o.nextInt();
            switch (option) {
                case 1: {
                    System.out.println();
                    break;

                }
                case 2: {
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println();
                    break;
                }
            }
        }
        //instantiati obiect
    }
}
