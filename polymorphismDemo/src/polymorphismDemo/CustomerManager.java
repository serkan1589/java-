package polymorphismDemo;

public class CustomerManager {

	private BaseLogger  logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
		
	}
	public void Add() {
		
		System.out.println("Müşteri eklendi");
		DatabeseLogger logger=new DatabeseLogger();
		this.logger.log("Log mesajı");
	}
}
