public class SpellCards extends Card {
    String details;
    String spellType;

    public SpellCards(String name, String type, int MP, String details, String spellType) {
        super(name, type, MP);
        this.details = details;
        this.spellType = spellType;
    }

}
