import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CanastaRunner
	{
		static boolean game = false;
		static boolean match = false ;
		static ArrayList <Card> playerHand  = new ArrayList <Card>();
		static ArrayList <Card> aiHand  = new ArrayList <Card>();
		static ArrayList <Card> discardPile  = new ArrayList <Card>();

		public static void main(String[] args)
			{
				
				Deck.fillDeck();
				setCardValue();
				Collections.shuffle(Deck.deck);		
				intialDeal();
				showPlayerHand();
				//organizePlayerHand();
				showTopCard();				
				takeFromPile();
				
				
				aiTurn();
				
				while (game == false)
					{
						takeFromPile();
						aiTurn();
					}
			}

private static void makeCanasta()
			{
			
				
			}

private static void showAIHand()
			{
				System.out.println("Their Cards");
				System.out.println("_____________________");
				for (int i=0 ;i < aiHand.size() ; i++)
					{
						System.out.print("Card (" +(i+1)+ ")" + " " + aiHand.get(i).getRank());
						System.out.print(" of "+aiHand.get(i).getSuit()+"s");
						System.out.println("  "+aiHand.get(i).getValue());
					}
				System.out.println("_____________________");
			}							
private static void aiTurn()
			{
				aiHand.add (Deck.deck.get(0));
				Deck.deck.remove(0);
				aiHand.add (Deck.deck.get(0));
				Deck.deck.remove(0);
				
				discardPile.add (aiHand.get(0));
				aiHand.remove (0);
				
			}
private static void takeFromPile()
			{
				
				for (int i=0; i < playerHand.size();i++)
					{ 				
							if (playerHand.get(i).getRank()==discardPile.get(0).getRank())
								{
									match = true ;
								}
					}
					
					if (match == true)
						{
							System.out.println("Would you like to take from the pile (1) or take the discard pile (2)");	
							int decision;
							Scanner userInput = new Scanner (System.in);
							decision = userInput.nextInt();
							if (decision==1)
								{
									playerHand.add (Deck.deck.get(0));
									Deck.deck.remove(0);
									playerHand.add (Deck.deck.get(0));
									Deck.deck.remove(0);
									showPlayerHand();
									System.out.println("Pick what card you want to discard by using its cooresponding number");
									int decisionofcard;
									Scanner userInput3 = new Scanner (System.in);
									decisionofcard = userInput3.nextInt();
									discardPile.add(playerHand.get(decisionofcard-1));
									playerHand.remove(decisionofcard-1);
									showPlayerHand();

								}
							else if (decision==2)
								{
									for (int i=0; i < discardPile.size();i++)
										{ 				
											playerHand.add (discardPile.get(i));
											discardPile.remove(0);
										}
									System.out.println("Pick what card you want to discard by using its coorisponding number");
									int decisionofcard;
									Scanner userInput3 = new Scanner (System.in);
									decisionofcard = userInput3.nextInt();
									discardPile.add(playerHand.get(decisionofcard-1));
									playerHand.remove(decisionofcard-1);
									showPlayerHand();
								}
						}
							else if(match == false)
								{
									System.out.println("You have to take two cards from the pile, press (1) to continue");
									int decision1;
									Scanner userInput1 = new Scanner (System.in);
									decision1 = userInput1.nextInt();
									if (decision1==1)
										{
											playerHand.add (Deck.deck.get(0));
											Deck.deck.remove(0);
											playerHand.add (Deck.deck.get(0));
											Deck.deck.remove(0);
											showPlayerHand();
										}
									System.out.println("Pick what card you want to discard by using its coorisponding number");
									int decisionofcard;
									Scanner userInput3 = new Scanner (System.in);
									decisionofcard = userInput3.nextInt();
									discardPile.add(playerHand.get(decisionofcard-1));
									playerHand.remove(decisionofcard-1);
									showPlayerHand();
								}
							for (int f=0;f<playerHand.size(); f++)
								{
									if (playerHand.getRank(f)=="2")
										{
											
										}
								}
							
						}															
private static void showTopCard()
			{
				discardPile.add (Deck.deck.get(0));
				System.out.println("This is the top card of the discard pile");
				System.out.println(" ");
				System.out.print(discardPile.get(0).getRank());
				System.out.print(" of "+discardPile.get(0).getSuit()+"s");
				System.out.print(" "+discardPile.get(0).getColor());
				System.out.println("  "+discardPile.get(0).getValue()+ " Points");				
			}
private static void setCardValue()
			{
				for (int i=0; i<52;i++)
					{
						 if (Deck.deck.get(i).getValue()==14)
							{
								Deck.deck.get(i).setValue(20);
							}
						else if (Deck.deck.get(i).getValue()==2)
							{
								Deck.deck.get(i).setValue(20);
							}
						else if (Deck.deck.get(i).getValue()<7)
							{
								Deck.deck.get(i).setValue(5);
							}
						else if (Deck.deck.get(i).getValue()>=8)
							{
								Deck.deck.get(i).setValue(10);
							}								
					}				
			}
private static void showPlayerHand()
			{
				System.out.println("Your Cards");
				System.out.println("_____________________");
				for (int i=0 ;i < playerHand.size() ; i++)
					{
						System.out.print("Card " + "(" +(i+1)+ ")" + " " + playerHand.get(i).getRank());
						System.out.print(" of "+playerHand.get(i).getSuit()+"s");
						System.out.print(" "+playerHand.get(i).getColor());
						System.out.println("  "+playerHand.get(i).getValue() + " Points");
						
					}
				System.out.println("_____________________");
			}
private static void intialDeal()
			{
				for (int i=0 ;i < 11; i++)
					{
						playerHand.add (Deck.deck.get(0));
						Deck.deck.remove(0);
						aiHand.add (Deck.deck.get(0));					
						Deck.deck.remove(0);
					}
				
			}
	}
//github tester