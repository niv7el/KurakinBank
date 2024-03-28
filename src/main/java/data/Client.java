package data;
import bank.Card;

public class Client {
    private String name, surname;
    private boolean isClient;
    private Card card;

    public void setClient(boolean client) {
        isClient = client;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isClient() {
        return isClient;
    }

    public Card getCard() {
        return card;
    }
}
