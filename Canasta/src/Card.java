
public class Card
	{
		private String rank, suit, color;
		private int value;
		public Card (String col, String cl, int a, String buns)
			{
				rank = col;
				suit = cl;
				value = a;
				color = buns;
			}
		public String getRank()
			{
				return rank;
			}
		public void setRank(String rank)
			{
				this.rank = rank;
			}
		public String getSuit()
			{
				return suit;
			}
		public void setSuit(String suit)
			{
				this.suit = suit;
			}
		public String getColor()
			{
				return color;
			}
		public void setColor(String color)
			{
				this.color = color;
			}
		public int getValue()
			{
				return value;
			}
		public void setValue(int value)
			{
				this.value = value;
			}

	}
	
