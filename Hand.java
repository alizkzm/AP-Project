public class Hand extends CardField {
    public Hand(String name) {
        this.name = name;
    }

    public void addCard(Card card){
        this.cards.add(card);
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
