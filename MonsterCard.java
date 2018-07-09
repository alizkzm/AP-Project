public class MonsterCard extends Card{
    int AP;
    int HP;
    static int firstHP;
    String monsterStrategy;
    String monsterDetails;
    String monsterMagic;

    public MonsterCard(String name, String type, int MP, int AP, int HP, String monsterStrategy, String monsterDetails, String monsterMagic) {
        super(name, type, MP);
        this.AP = AP;
        this.HP = HP;
        this.firstHP = HP;
        this.monsterStrategy = monsterStrategy;
        this.monsterDetails = monsterDetails;
        this.monsterMagic = monsterMagic;
    }
}
