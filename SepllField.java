import java.util.ArrayList;

public class SepllField {

    ArrayList<Card> cards = new ArrayList<>();
    static int limit = 3;

    public SepllField(){

    }

    public void addCard(SpellCards card){
        if (cards.size()<=limit && !card.spellType.equals("Instant"))
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
