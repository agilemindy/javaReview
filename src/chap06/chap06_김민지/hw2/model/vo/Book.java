package chap06.chap06_김민지.hw2.model.vo;

public class Book {
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, int price, double discountRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String information() {
		
		String info = this.title + "  " + this.price + "  " + this.discountRate + "  " + this.author;
		return info;
	}
	
	public String information2 () {
		
		String info2 = "도서명 = " + this.title + "\n할인된 가격 = " + (int)(this.price-(this.price*this.discountRate));
		return info2;
	}

}
