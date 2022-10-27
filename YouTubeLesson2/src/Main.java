
public class Main {

	public static void main(String[] args) {

		Processes processes = new Processes();
		processes.Calculate();
		processes.Save();
		
		Customer customer=new Customer();
		 
		customer.id=321;
		customer.lastName="Özçelik";
		customer.name="Serkan";
		customer.nationeIdentitiy="47740102588";
		
		
       CustomerManager customerManager= new CustomerManager();
       
       customerManager.Save(customer);
       
       Company company=new Company();
       
       company.id=123;
       
		
	    
	}

}
