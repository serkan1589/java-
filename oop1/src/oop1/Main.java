package oop1;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Vade oranı";

		Product product1 = new Product(); // Class tanımlanması
		product1.setName("Delonghi Kahve Makinası");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInstock(3);
		product1.setImageUrl("resim.jpg");

		Product product2 = new Product();
		product2.setName("Kitchen Kahve Makinası");
		product2.setUnitPrice(8400);
		product2.setDiscount(2);
		product2.setUnitsInstock(6);
		product2.setImageUrl("re.jpg");

		Product product3 = new Product();
		product3.setName("smeg Kahve Makinası");
		product3.setUnitPrice(4500);
		product3.setDiscount(2);
		product3.setUnitsInstock(4);
		product3.setImageUrl("rem.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {

			System.out.println("<li>" + product.getName() + "</li>");

		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(0);
		individualCustomer.setPhone("0553411398");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Serkan");
		individualCustomer.setLastName("Özçelik");

		CorporateCustomer corporateCustomer = new CorporateCustomer();

		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("11111111111");
		corporateCustomer.setTaxNumber("54312");

	     
		Customer[] customers= {individualCustomer,corporateCustomer};
		
	}

}
