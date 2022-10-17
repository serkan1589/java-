package classesWithAttributes;

public class Product {
 
	
	public Product() {
		System.out.println("Yapıcı blok çalıştı.");
	}
	
	
	// attributes or field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String cod;

	// Getter
	public int getId() {// Bu methodda sadece okunabilir olması için kullanılır.
		return id;

	}

	// Setter
	public void setId(int id) {// this bulunduğu claası belirtir.

		this.id = id;

	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

}
