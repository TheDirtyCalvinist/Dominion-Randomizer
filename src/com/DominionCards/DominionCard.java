package com.DominionCards;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: thedirtycalvinist
 * Date: 8/20/11
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */
public enum DominionCard {

    BANK("Bank", DominionSet.PROSPERITY),
    BISHOP("Bishop", DominionSet.PROSPERITY),
    CITY("City", DominionSet.PROSPERITY),
    CONTRABAND("Contraband", DominionSet.PROSPERITY),
    COUNTING_HOUSE("Counting House", DominionSet.PROSPERITY),
    EXPAND("Expand", DominionSet.PROSPERITY),
    FORGE("Forge", DominionSet.PROSPERITY),
    GOONS("Goons", DominionSet.PROSPERITY),
    GRAND_MARKET("Grand Market", DominionSet.PROSPERITY),
    HOARD("Hoard", DominionSet.PROSPERITY),
    KINGS_COURT("King’s Court", DominionSet.PROSPERITY),
    LOAN("Loan", DominionSet.PROSPERITY),
    MINT("Mint", DominionSet.PROSPERITY),
    MONUMENT("Monument", DominionSet.PROSPERITY),
    MOUNTEBANK("Mountebank", DominionSet.PROSPERITY),
    PEDDLER("Peddler", DominionSet.PROSPERITY),
    QUARRY("Quarry", DominionSet.PROSPERITY),
    RABBLE("Rabble", DominionSet.PROSPERITY),
    ROYAL_SEAL("Royal Seal", DominionSet.PROSPERITY),
    TALISMAN("Talisman", DominionSet.PROSPERITY),
    TRADE_ROUTE("Trade Route", DominionSet.PROSPERITY),
    VAULT("Vault", DominionSet.PROSPERITY),
    VENTURE("Venture", DominionSet.PROSPERITY),
    WATCHTOWER("Watchtower", DominionSet.PROSPERITY),
    WORKERS_VILLAGE("Worker’s Village", DominionSet.PROSPERITY),

    BAG_OF_GOLD("Bag of Gold", DominionSet.CORNUCOPIA),
    DIADEM("Diadem", DominionSet.CORNUCOPIA),
    FAIRGROUNDS("Fairgrounds", DominionSet.CORNUCOPIA),
    FARMING_VILLAGE("Farming Village", DominionSet.CORNUCOPIA),
    FOLLOWERS("Followers", DominionSet.CORNUCOPIA),
    FORTUNE_TELLER("Fortune Teller", DominionSet.CORNUCOPIA),
    HAMLET("Hamlet", DominionSet.CORNUCOPIA),
    HARVEST("Harvest", DominionSet.CORNUCOPIA),
    HORN_OF_PLENTY("Horn of Plenty", DominionSet.CORNUCOPIA),
    HORSE_TRADERS("Horse Traders", DominionSet.CORNUCOPIA),
    HUNTING_PARTY("Hunting Party", DominionSet.CORNUCOPIA),
    JESTER("Jester", DominionSet.CORNUCOPIA),
    MENAGERIE("Menagerie", DominionSet.CORNUCOPIA),
    PRINCESS("Princess", DominionSet.CORNUCOPIA),
    REMAKE("Remake", DominionSet.CORNUCOPIA),
    TOURNAMENT("Tournament", DominionSet.CORNUCOPIA),
    TRUSTY_STEED("Trusty Steed", DominionSet.CORNUCOPIA),
    YOUNG_WITCH("Young Witch", DominionSet.CORNUCOPIA),

    BLACK_MARKET("Black Market", DominionSet.PROMO),
    ENVOY("Envoy", DominionSet.PROMO),
    STASH("Stash", DominionSet.PROMO),

    AMBASSADOR("Ambassador", DominionSet.SEASIDE),
    BAZAAR("Bazaar", DominionSet.SEASIDE),
    CARAVAN("Caravan", DominionSet.SEASIDE),
    CUTPURSE("Cutpurse", DominionSet.SEASIDE),
    EMBARGO("Embargo", DominionSet.SEASIDE),
    EXPLORER("Explorer", DominionSet.SEASIDE),
    FISHING_VILLAGE("Fishing Village", DominionSet.SEASIDE),
    GHOST_SHIP("Ghost Ship", DominionSet.SEASIDE),
    HAVEN("Haven", DominionSet.SEASIDE),
    ISLAND("Island", DominionSet.SEASIDE),
    LIGHTHOUSE("Lighthouse", DominionSet.SEASIDE),
    LOOKOUT("Lookout", DominionSet.SEASIDE),
    MERCHANT_SHIP("Merchant Ship", DominionSet.SEASIDE),
    NATIVE_VILLAGE("Native Village", DominionSet.SEASIDE),
    NAVIGATOR("Navigator", DominionSet.SEASIDE),
    OUTPOST("Outpost", DominionSet.SEASIDE),
    PEARL_DIVER("Pearl Diver", DominionSet.SEASIDE),
    PIRATE_SHIP("Pirate Ship", DominionSet.SEASIDE),
    SALVAGER("Salvager", DominionSet.SEASIDE),
    SEA_HAG("Sea Hag", DominionSet.SEASIDE),
    SMUGGLERS("Smugglers", DominionSet.SEASIDE),
    TACTICIAN("Tactician", DominionSet.SEASIDE),
    TREASURE_MAP("Treasure Map", DominionSet.SEASIDE),
    TREASURY("Treasury", DominionSet.SEASIDE),
    WAREHOUSE("Warehouse", DominionSet.SEASIDE),
    WHARF("Wharf", DominionSet.SEASIDE),

    ALCHEMIST("Alchemist", DominionSet.ALCHEMY),
    APOTHECARY("Apothecary", DominionSet.ALCHEMY),
    APPRENTICE("Apprentice", DominionSet.ALCHEMY),
    FAMILIAR("Familiar", DominionSet.ALCHEMY),
    GOLEM("Golem", DominionSet.ALCHEMY),
    HERBALIST("Herbalist", DominionSet.ALCHEMY),
    PHILOSOPHERS_STONE("Philosopher’s Stone", DominionSet.ALCHEMY),
    POSSESSION("Possession", DominionSet.ALCHEMY),
    SCRYING_POOL("Scrying Pool", DominionSet.ALCHEMY),
    TRANSMUTE("Transmute", DominionSet.ALCHEMY),
    UNIVERSITY("University", DominionSet.ALCHEMY),
    VINEYARD("Vineyard", DominionSet.ALCHEMY),

    ADVENTURER("Adventurer", DominionSet.BASIC),
    BUREAUCRAT("Bureaucrat", DominionSet.BASIC),
    CELLAR("Cellar", DominionSet.BASIC),
    CHANCELLOR("Chancellor", DominionSet.BASIC),
    CHAPEL("Chapel", DominionSet.BASIC),
    COUNCIL_ROOM("Council Room", DominionSet.BASIC),
    FEAST("Feast", DominionSet.BASIC),
    FESTIVAL("Festival", DominionSet.BASIC),
    GARDENS("Gardens", DominionSet.BASIC),
    LABORATORY("Laboratory", DominionSet.BASIC),
    LIBRARY("Library", DominionSet.BASIC),
    MARKET("Market", DominionSet.BASIC),
    MILITIA("Militia", DominionSet.BASIC),
    MINE("Mine", DominionSet.BASIC),
    MOAT("Moat", DominionSet.BASIC),
    MONEYLENDER("Moneylender", DominionSet.BASIC),
    REMODEL("Remodel", DominionSet.BASIC),
    SMITHY("Smithy", DominionSet.BASIC),
    SPY("Spy", DominionSet.BASIC),
    THIEF("Thief", DominionSet.BASIC),
    THRONE_ROOM("Throne Room", DominionSet.BASIC),
    VILLAGE("Village", DominionSet.BASIC),
    WITCH("Witch", DominionSet.BASIC),
    WOODCUTTER("Woodcutter", DominionSet.BASIC),
    WORKSHOP("Workshop", DominionSet.BASIC),

    BARON("Baron", DominionSet.INTRIGUE),
    BRIDGE("Bridge", DominionSet.INTRIGUE),
    CONSPIRATOR("Conspirator", DominionSet.INTRIGUE),
    COPPERSMITH("Coppersmith", DominionSet.INTRIGUE),
    COURTYARD("Courtyard", DominionSet.INTRIGUE),
    DUKE("Duke", DominionSet.INTRIGUE),
    GREAT_HALL("Great Hall", DominionSet.INTRIGUE),
    HAREM("Harem", DominionSet.INTRIGUE),
    IRONWORKS("Ironworks", DominionSet.INTRIGUE),
    MASQUERADE("Masquerade", DominionSet.INTRIGUE),
    MINING_VILLAGE("Mining Village", DominionSet.INTRIGUE),
    MINION("Minion", DominionSet.INTRIGUE),
    NOBLES("Nobles", DominionSet.INTRIGUE),
    PAWN("Pawn", DominionSet.INTRIGUE),
    SABOTEUR("Saboteur", DominionSet.INTRIGUE),
    SCOUT("Scout", DominionSet.INTRIGUE),
    SECRET_CHAMBER("Secret Chamber", DominionSet.INTRIGUE),
    SHANTY_TOWN("Shanty Town", DominionSet.INTRIGUE),
    STEWARD("Steward", DominionSet.INTRIGUE),
    SWINDLER("Swindler", DominionSet.INTRIGUE),
    TORTURER("Torturer", DominionSet.INTRIGUE),
    TRADING_POST("Trading Post", DominionSet.INTRIGUE),
    TRIBUTE("Tribute", DominionSet.INTRIGUE),
    UPGRADE("Upgrade", DominionSet.INTRIGUE),
    WISHING_WELL("Wishing Well", DominionSet.INTRIGUE);

    private DominionSet set;
    private String title;
//    private String cost;
//    private String cardText;

    private DominionCard(String title, DominionSet set){
        this.title = title;
        this.set = set;
    }

    public static List<DominionCard> getCardsFromSets(List<DominionSet> sets){
        List<DominionCard> cards = new ArrayList<DominionCard>();
        for (DominionCard card : values()){
            if(sets.contains(card.getSet())){
                cards.add(card);
            }
        }
        return cards;
    }

    public DominionSet getSet(){
        return set;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        return title + " (" + set.getName() + ")";
    }


}
