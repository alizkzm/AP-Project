import java.util.ArrayList;

public class Hand  {
    ArrayList<Card> cards = new ArrayList<>();

    public Hand(){

    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void clearCards(){
        for (int i = 0; i <cards.size() ; i++) {
            cards.remove(i);
        }
    }

    public Card findCard(String string){
        for (Card card : this.cards) {
            if(card.name.equals(string)){
                return card;
            }
        }
        return null;
    }

    public void clearCard(String string){
        Card card = findCard(string);
        cards.remove(card);
    }
}
