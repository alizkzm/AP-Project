public class SepllField extends CardField{

    public SepllField() {
        this.setNumber(3);
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
