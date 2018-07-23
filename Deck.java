import java.util.ArrayList;
import java.util.Random;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    int capacity;
    public void Deck(){
        //ToDo
        int random = 0;
        capacity = random;
    }

    public void setCards(ArrayList<Card> cards) {
        if(cards.size()==capacity){
            this.cards = randomize(cards);
        }
        else{
            System.out.println("Agian Add Cards");
            return;
        }
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

    public void addCard(Card card){
        cards.add(card);
    }

    public ArrayList<Card> randomize(ArrayList<Card> cards){
        //ToDo
        ArrayList<Card> cardsOut = null;
        return cardsOut;
    }
}
