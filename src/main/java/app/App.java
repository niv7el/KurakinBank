package app;
import bank.Card;

public class App {
    public static void main(String[] args) {
        Card card1 = new Card();
        System.out.println("Card number: " + card1.getCARD_NUMBER()
                + "\nPin Code: " + card1.getPinCode());
    }
}
