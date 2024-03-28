package data;
import bank.Card;

public class Client {
    private String name, surname;
    private boolean isClient;
    private Card card;

    public Client(String name, String surname, boolean isClient) {
        this.name = name;
        this.surname = surname;
        this.isClient = isClient;
        this.card = new Card();
    }

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
