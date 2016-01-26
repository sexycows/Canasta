import java.util.ArrayList;



public class Deck

{

static ArrayList <Card> deck = new ArrayList <Card>();

public static void fillDeck ()

{


//	deck.add (new Card("Red 1", "heart",1));

//	deck.add (new Card("Black 1", "club",1));

//	deck.add (new Card("Black 1", "spade",1));

//	deck.add (new Card("Red 1", "diamond",1));


deck.add (new Card("2", "heart",2,"Red"));

deck.add (new Card("2", "club",2,"Black"));

deck.add (new Card("2", "spade",2,"Black"));

deck.add (new Card("2", "diamond",2,"Red"));


deck.add (new Card("3", "heart",3,"Red"));

deck.add (new Card("3", "club",3,"Black"));

deck.add (new Card("3", "spade",3,"Black"));

deck.add (new Card("3", "diamond",3,"Red"));


deck.add (new Card("4", "heart",4,"Red"));

deck.add (new Card("4", "club",4,"Black"));

deck.add (new Card("4", "spade",4,"Black"));

deck.add (new Card("4", "diamond",4,"Red"));


deck.add (new Card("5", "heart",5,"Red"));

deck.add (new Card("5", "club",5,"Black"));

deck.add (new Card("5", "spade",5,"Black"));

deck.add (new Card("5", "diamond",5,"Red"));


deck.add (new Card("6", "heart",6,"Red"));

deck.add (new Card("6", "club",6,"Black"));

deck.add (new Card("6", "spade",6,"Black"));

deck.add (new Card("6", "diamond",6,"Red"));


deck.add (new Card("7", "heart",7,"Red"));

deck.add (new Card("7", "club",7,"Black"));

deck.add (new Card("7", "spade",7,"Black"));

deck.add (new Card("7", "diamond",7,"Red"));


deck.add (new Card("8", "heart",8,"Red"));

deck.add (new Card("8", "club",8,"Black"));

deck.add (new Card("8", "spade",8,"Black"));

deck.add (new Card("8", "diamond",8,"Red"));


deck.add (new Card("9", "heart",9,"Red"));

deck.add (new Card("9", "club",9,"Black"));

deck.add (new Card("9", "spade",9,"Black"));

deck.add (new Card("9", "diamond",9,"Red"));


deck.add (new Card("10", "heart",10,"Red"));

deck.add (new Card("10", "club",10,"Black"));

deck.add (new Card("10", "spade",10,"Black"));

deck.add (new Card("10", "diamond",10,"Red"));


deck.add (new Card("Jack", "heart",11,"Red"));

deck.add (new Card("Jack", "club",11,"Black"));

deck.add (new Card("Jack", "spade",11,"Black"));

deck.add (new Card("Jack", "diamond",11,"Red"));


deck.add (new Card("King", "heart",12,"Red"));

deck.add (new Card("King", "club",12,"Black"));

deck.add (new Card("King", "spade",12,"Black"));

deck.add (new Card("Red King", "diamond",12,"Red"));


deck.add (new Card("Queen", "heart",13,"Red"));

deck.add (new Card("Queen", "club",13,"Black"));

deck.add (new Card("Queen", "spade",13,"Black"));

deck.add (new Card("Queen", "diamond",13,"Red"));


deck.add (new Card("Ace", "heart",14,"Red"));

deck.add (new Card("Ace", "club",14,"Black"));

deck.add (new Card("Ace", "spade",14,"Black"));

deck.add (new Card("Ace", "diamond",14,"Red"));

}

}