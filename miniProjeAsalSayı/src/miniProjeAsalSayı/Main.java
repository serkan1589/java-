package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {

		int number = 25;
		
		boolean isPrime=true;
		int reminder;
		
		if(number<2) {
			System.out.println("Geçersiz sayı.");
			return;
		}
		
		for (int i = 2; i <=number; i++) {
			
			if(number% i==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println("Sayı asaldır.");
		}
		else {
			System.out.println("Sayı asal değildir.");
		}
		
		
		
		
			
	
		

	}

}
