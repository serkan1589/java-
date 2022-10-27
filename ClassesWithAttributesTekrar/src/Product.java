
public class Product {
	
	public Product(int id,String name,String desciription) {
		System.out.println("Yapıcı Blok çalıştı.");
		
	}
	public Product() 
	{
		//Constructer parametresiz
	}
	
	//atribute or fields
	
	private int id;
	private String name;
	private String desciription;
	private double price;
	private int stokAmmount;	
	
	
	
	public int getId() {
		return id;
	}
	public void  setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getDesciription() {
		return desciription;
	}
	public void setDesciription(String desciription) {
		this.desciription = desciription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStokAmmount() {
		return stokAmmount;
	}
	public void setStokAmmount(int stokAmmount) {
		this.stokAmmount = stokAmmount;
	}
	
	
}
