import java.util.ArrayList;
//ToDo
public class MonsterField {
    ArrayList<Card> cards = new ArrayList<>();
    static int limit = 5;
    int number = 0;
    public MonsterField(){

    }

    public void setCards(ArrayList<Card> cards) {
        cards.size();
    }

    public void addCard(Card card){
        if (cards.size()<=limit && card.type.equals("MonsterCards"))
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
