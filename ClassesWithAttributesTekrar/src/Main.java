
public class Main {

	public static void main(String[] args) {

		Product product = new Product();

		product.setName("Laptop");
		product.setDesciription("Asus");
		product.setPrice(5300);
		product.setStokAmmount(5);
		product.setId(2);

		System.out.println(product.getName());

		
		ProductManager productManager =new ProductManager();
		productManager.Add(product);
	}

}
