import java.util.ArrayList;

public class ObjectCards {
    ArrayList<Card> spellobjectCards = new ArrayList<>();
    ArrayList<Card> monsterElvenCards = new ArrayList<>();
    ArrayList<Card> monsterDragonBreedCards = new ArrayList<>();
    ArrayList<Card> monsterAtlantianCards = new ArrayList<>();
    ArrayList<Card> monsterDemonicCarsd = new ArrayList<>();
    ArrayList<Card> monsterGoblinCards = new ArrayList<>();
    ArrayList<Card> monsterOgreCards = new ArrayList<>();
    ArrayList<Card> monsterVampiricCards = new ArrayList<>();

    //none
    public void ObjectCards(){
        //0
        spellobjectCards.add(new SpellCards("Throwing Knives","SpellCards",3,"Deal 500 damage to a selected enemy monster card on the field or to enemy player","Instant"));
        //1
        spellobjectCards.add(new SpellCards("Poisonous Cauldron","SpellCards",4,"Deal 100 damage to all enemy monster cards and enemy player","Continuous"));
        //2
        spellobjectCards.add(new SpellCards("First Aid Kit","SpellCards",3,"Increase HP of a selected friendly monster card or player by 500 ","Instant"));
        //3
        spellobjectCards.add(new SpellCards("Reaper’s Scythe","SpellCards",4,"Send an enemy monster or spell card from field to graveyard","Instant"));
        //4
        spellobjectCards.add(new SpellCards("Meteor Shower","SpellCards",8,"Deal 800 damage to a random enemy monster card on field or player","Continuous"));
        //5
        spellobjectCards.add(new SpellCards("Lunar Blessing","SpellCards",6,"Increase AP and HP of friendly Elven monster cards by 300 ","Aura"));
        //6
        spellobjectCards.add(new SpellCards("Strategic Retreat","SpellCards",6,"Select and move a monster card from field to hand and draw one card from deck ","Instant"));
        //7
        spellobjectCards.add(new SpellCards("War Drum","SpellCards",6,"Increase all friendly monster cards’ AP by 300","Aura"));
        //8
        spellobjectCards.add(new SpellCards("Healing Ward","SpellCards",5,"Increase all friendly monster cards’ HP by 200","Continuous "));
        //9
        spellobjectCards.add(new SpellCards("Blood Feast","SpellCards",4,"Deal 500 damage to enemy player and heal your player for 500 HP","Instant"));
        //10
        spellobjectCards.add(new SpellCards("Tsunami","SpellCards",6,"Deal 500 damage to all non-Atlantian monster cards on both sides of field","Instant"));
        //11
        spellobjectCards.add(new SpellCards("Take All You Can","SpellCards",7,"Increase all friendly normal monster cards’ HP and AP by 400","Aura"));
        //12
        spellobjectCards.add(new SpellCards("Arcane Bolt","SpellCards",5,"Deal 500 damage to enemy player and select and move an enemy spell card from field to graveyard","Instant"));
        //13
        spellobjectCards.add(new SpellCards("Greater Purge","SpellCards",7,"Remove all spell cards on field from both sides and move them to hand ","Instant"));
        //14
        spellobjectCards.add(new SpellCards("Magic Seal","SpellCards",9,"Remove all enemy spell cards from field and move them to graveyard","Continuous"));

        //0
        monsterElvenCards.add(new MonsterCard("Elven Ranger","MonsterCards",1,400,300,"none","","Normal"));
        //1
        monsterElvenCards.add(new MonsterCard("Elven Hunter","MonsterCards",3,600,800,"none","","Normal"));
        //2
        monsterElvenCards.add(new MonsterCard("Elven Guardsman","MonsterCards",5,500,1500,"Defender","","Normal"));
        //3
        monsterElvenCards.add(new MonsterCard("Elven Assassin","MonsterCards",5,1200,800,"Nimble","","Normal"));
        //4
        monsterElvenCards.add(new MonsterCard("Elven Druid","MonsterCards",5,600,1200,"none","Rejuvenation: Increase a selected friendly monster card’s HP by 500 and AP by 300","Spell Caster"));
        //5
        monsterElvenCards.add(new MonsterCard("Elven Sorceress","MonsterCards",7,1000,1000,"Nimble","Arcane Explosion: Deal 400 damage to all enemy monster cards and remove a random spell\n" +
                "card from enemy field and move it to graveyard.","Spell Caster"));
        //6
        monsterElvenCards.add(new MonsterCard("Noble Elf","MonsterCards",9,2400,2000,"none","Purge: Remove all enemy spell cards on the field and move them to hand & Increase a random friendly Elven monster card on the field’s HP by 800 and AP by 600","General"));
        //7
        monsterElvenCards.add(new MonsterCard("Luthien, The High Priestess","MonsterCards",9,2500,2500,"none","Revive Allies: move two random cards from your graveyard to hand & Divine Blessing: Increase HP of a friendly monster card or player by 2500 & Burst of Light: Increase HP of all friendly monster cards and player by 500 and increase AP of\n" +
                "all friendly monster cards by 200 ","Hero"));

        //0
        monsterDragonBreedCards.add(new MonsterCard("Lesser Whelp","MonsterCards",1,300,500,"none","","Normal"));
        //1
        monsterDragonBreedCards.add(new MonsterCard("Dragonling","MonsterCards",3,700,700,"none","","Normal"));
        //2
        monsterDragonBreedCards.add(new MonsterCard("Armored Dragon","MonsterCards",5,400,2000,"Defender","","Normal"));
        //3
        monsterDragonBreedCards.add(new MonsterCard("Yellow Drake","MonsterCards",5,1000,800,"Nimble","","Normal"));
        //4
        monsterDragonBreedCards.add(new MonsterCard("Blue Dragon","MonsterCards",5,1200,800,"none","Magical Fire: Move an enemy monster card from field to graveyard","Spell Caster"));
        //5
        monsterDragonBreedCards.add(new MonsterCard("Volcanic Dragon","MonsterCards",8,700,2500,"Nimble","Lava Spit: Deal 500 damage to an enemy monster card and reduce its AP by 500","Spell Caster"));
        //6
        monsterDragonBreedCards.add(new MonsterCard("Greater Dragon","MonsterCards",8,1800,2000,"none","Devour: Send a random enemy monster card from field to graveyard & Dragon’s Call: draw two cards from deck to hand","General"));
        //7
        monsterDragonBreedCards.add(new MonsterCard("Igneel, The Dragon King","MonsterCards",10,800,4000,"none","King’s Grace: Send all non-Hero monster cards on both sides of field to their graveyards & King’s Wing Slash: Deal 600 damage to all enemy monster cards and player & King’s Wail: Decrease all enemy monster cards’ AP by 400","Hero"));


        //0
        monsterAtlantianCards.add(new MonsterCard("Murloc Crawler","MonsterCards",1,500,200,"none","","Normal"));
        //1
        monsterAtlantianCards.add(new MonsterCard("Murloc Warrior","MonsterCards",2,600,600,"none","","Normal"));
        //2
        monsterAtlantianCards.add(new MonsterCard("Giant Crab","MonsterCards",4,300,1500,"Defender","","Normal"));
        //3
        monsterAtlantianCards.add(new MonsterCard("Shark Man","MonsterCards",5,1200,900,"Nimble","","Normal"));
        //4
        monsterAtlantianCards.add(new MonsterCard("Naga Siren","MonsterCards",6,600,1200,"none","Song of the Siren: Increase HP of all friendly monster cards by 300 and their AP by 200","Spell Caster"));
        //5
        monsterAtlantianCards.add(new MonsterCard("Sea Serpent","MonsterCards",7,1200,1500,"Nimble","Serpent’s Bite: Deal 1000 damage to an enemy monster card or player","Spell Caster"));
        //6
        monsterAtlantianCards.add(new MonsterCard("Kraken","MonsterCards",8,2200,1800,"none","Titan’s Presence: Return one random enemy monster card from field to hand and reduce all\n" +
                "enemy monsters’ AP by 200 & Titan’s Fall: Deal 400 damage to all enemy monster cards and player","General"));
        //7
        monsterAtlantianCards.add(new MonsterCard("Neptune, King of Atlantis","MonsterCards",10,2500,2200,"none","Call to Arms: Select and move a card from hand to play field & Trident Beam: Deal 800 damage to three random enemy monster cards or player & Ocean’s Cry: Deal 400 damage to all enemy monster cards and player and increase all friendly\n" +
                "Atlantian monster cards’ AP by 500","Hero"));

        //0
        monsterDemonicCarsd.add(new MonsterCard("Imp","MonsterCards",2,500,300,"none","","Normal"));
        //1
        monsterDemonicCarsd.add(new MonsterCard("Shade","MonsterCards",3,800,500,"none","","Normal"));
        //2
        monsterDemonicCarsd.add(new MonsterCard("Living Armor","MonsterCards",5,400,1500,"Defender","","Normal"));
        //3
        monsterDemonicCarsd.add(new MonsterCard("Hellhound","MonsterCards",5,1000,800,"Nimble","","Normal"));
        //4
        monsterDemonicCarsd.add(new MonsterCard("Evil Eye","MonsterCards",6,400,400,"none","Evil Gaze: Deal 800 damage to all enemy monster cards and player","Spell Caster"));
        //5
        monsterDemonicCarsd.add(new MonsterCard("Necromancer","MonsterCards",7,1500,1200,"Nimble","Raise Dead: Move a random card from your graveyard to hand","Spell Caster"));
        //6
        monsterDemonicCarsd.add(new MonsterCard("Dark Knight","MonsterCards",8,2500,2500,"none","Sacrifice: Select and move a card from hand to graveyard & Loyalty: Heal your player for 1000 HP","General"));
        //7
        monsterDemonicCarsd.add(new MonsterCard("Cerberus, Gatekeeper of Hell","MonsterCards",10,2000,3000,"none","Open the Gate: Draw three cards from deck to hand & Hellfire: Deal 300 damage to all enemy monster cards and Increase HP and AP of all friendly\n" +
                "monster cards by 300 & Revenge of the Two Heads: Send two random enemy monster cards from field to garveyard","Hero"));

        //0
        monsterGoblinCards.add(new MonsterCard("Goblin Smuggler","MonsterCards",2,400,600,"none","","Normal"));
        //1
        monsterGoblinCards.add(new MonsterCard("Goblin Shaman","MonsterCards",4,700,1000,"none","Mend: Increase a friendly monster card or player’s HP by 400","Spell Caster"));

        //0
        monsterOgreCards.add(new MonsterCard("Ogre Warrior","MonsterCards",3,500,800,"none","","Normal"));
        //1
        monsterOgreCards.add(new MonsterCard("Ogre Frontliner","MonsterCards",5,600,1800,"Defender","","Normal"));
        //2
        monsterOgreCards.add(new MonsterCard("Ogre Magi","MonsterCards",5,800,1500,"none","Enrage: Increase a friendly monster card’s AP by 400","Spell Caster"));
        //3
        monsterOgreCards.add(new MonsterCard("Ogre Warchief","MonsterCards",7,1500,2500,"none","War Stomp: Deal 400 damage to all enemy monster cards and player & Last Order: Increase all friendly monster cards’ AP by 300","General"));

        //0
        monsterVampiricCards.add(new MonsterCard("Undead","MonsterCards",1,400,200,"none","","Normal"));
        //1
        monsterVampiricCards.add(new MonsterCard("Giant Bat","MonsterCards",3,900,500,"Nimble","","Normal"));
        //2
        monsterVampiricCards.add(new MonsterCard("Stout Undead","MonsterCards",4,600,1200,"Defender","","Normal"));
        //3
        monsterVampiricCards.add(new MonsterCard("Undead Mage","MonsterCards",6,1000,800,"none","Curse: Reduce an enemy monster card’s AP by 500","Spell Caster"));
        //4
        monsterVampiricCards.add(new MonsterCard("Vampire Acolyte","MonsterCards",7,1500,1500,"Nimble","Black Wave: Deal 300 damage to all enemy monster cards and heal all friendly monster cards\n" +
                "for 300 HP","Spell Caster"));
        //5
        monsterVampiricCards.add(new MonsterCard("Vampire Prince","MonsterCards",9,2200,2000,"none","Fear: Return two random enemy monster cards from field to hand & Darkness: Reduce all enemy monster cards’ AP by 200 and increase friendly monster cards’\n" +
                "AP by 200","General"));

    }
}
