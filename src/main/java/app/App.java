package app;
import bank.Card;
import data.Client;

public class App {
    public static void main(String[] args) {
        Client Nikita = new Client("Nikita", "Kurakin", true);
        System.out.println("Full Name: " + Nikita.getName() + " " + Nikita.getSurname() +
                "\nCard Number: " + Nikita.getCard().getCARD_NUMBER() + "\nPin Code: " + Nikita.getCard().getPinCode());
    }
}
