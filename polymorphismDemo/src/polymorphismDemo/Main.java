package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		//BaseLogger [] loggers=new BaseLogger[] { new FileLogger(),new EmailLogger(),new DatabeseLogger(),new ConsoleLogger()};
		
		//for(BaseLogger logger:loggers) {
			//logger.log("Log mesajı");
		//}
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.Add();
	}

}
