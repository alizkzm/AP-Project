import java.util.ArrayList;

public abstract class CardField {
    String name;
    ArrayList<Card> cards = new ArrayList<>();
    int number;
    int firstNumber;


    public String getName() {
        return name;
    }
    public ArrayList<Card> getCards() {
        return cards;
    }
    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void playCard(Card card){
        this.cards.remove(card);
    }
}
