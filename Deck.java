import java.util.Random;

public class Deck extends CardField{
    public Deck(String name) {
        this.name = name;
    }

    public void Random(){
        Random int random = new Random(5);
        this.setNumber(random+25);
    }

    public void addCard(Card card){
        if(this.number >= 0){
            this.cards.add(card);
        }
        number--;
    }

    public Card findCard(String string){
        for (Card card : this.cards) {
            if(card.name.equals(string)){
                return card;
            }
        }
        return null;
    }
}
