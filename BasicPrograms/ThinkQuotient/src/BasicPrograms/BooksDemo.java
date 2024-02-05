package BasicPrograms;

public class BooksDemo {
	private int id;
	private String bookName;
	private float price;
	float discount = 0;

	public BooksDemo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
 
	@Override
	public String toString() {
		return "BooksDemo [id=" + id + ", bookName=" + bookName + ", price=" + price + "]";
	}

	public static void main(String args[]) {
		BooksDemo b = new BooksDemo();
		b.setId(101);
		b.setBookName("Horror");
		b.setPrice(100);

		if (b.getBookName().equals("Horror")) {

			float discount = (float) (b.getPrice() - (b.getPrice() * 0.10));
			b.setPrice(discount);
			System.out.println(discount);

		}

		System.out.println(b.getId() + "" + b.getBookName() + "" + b.getPrice());
	}
}
