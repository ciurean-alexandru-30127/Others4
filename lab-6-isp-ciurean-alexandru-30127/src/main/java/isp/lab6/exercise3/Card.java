package isp.lab6.exercise3;

public class Card {
    public String cardId;
    public String pin;

    public Card(String cardid, String pin) {
        this.cardId = cardid;
        this.pin = pin;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }


    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardid='" + cardId + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
