package bank;
import org.apache.commons.lang3.RandomStringUtils;



public class Card {
    private final String CARD_NUMBER;
    private String pinCode;

    public Card() {
        CARD_NUMBER = cardNumberGenerator(16);
        pinCode = pinGenerator(4);
    }

    public String pinGenerator(int length){
        boolean useLetters = false;
        boolean useNumbers = true;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public String cardNumberGenerator(int length){
        boolean useLetters = false;
        boolean useNumbers = true;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public String getCARD_NUMBER(){
        return CARD_NUMBER;
    }
    public void setPinCode(String pinCode){
        this.pinCode = pinCode;
    }
    public String getPinCode() {
        return this.pinCode;
    }

}
