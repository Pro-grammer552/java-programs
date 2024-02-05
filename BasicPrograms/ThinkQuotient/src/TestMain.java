
class card {

	private String type;
	private String colour;
	private int quantity;

	public card(String type, String colour, int quantity) {
		super();
		this.type = type;
		this.colour = colour;
		this.quantity = quantity;
	}

	public void giftingCard() {

		System.out.println(type + " : Type");
		System.out.println(colour + ": Colour");
		System.out.println(quantity + " : Quantity");

	}

}

class WeeddingCard extends card {

	public WeeddingCard(String type, String colour, int quantity) {

		super(type, colour, quantity);

	}

}

class BirthDayCard extends card {

	public BirthDayCard(String type, String colour, int quantity) {
		super(type, colour, quantity);

	}

}

public class TestMain {

	public static void main(String[] args) {
		card c = new card("cardA", "Yellow", 10);
		c.giftingCard();
		System.out.println("------------------------------------");

		WeeddingCard w = new WeeddingCard("WeedingCard", "green", 8);
		w.giftingCard();
		System.out.println("------------------------------------");

		BirthDayCard b = new BirthDayCard("Birthdaycard", "red", 5);
		b.giftingCard();
		System.out.println("------------------------------------");

	}

}
