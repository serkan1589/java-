package sayıBulma;

public class Main {

	public static void main(String[] args) {
		 
		
	int [] numbers=new int [] {1,2,3,4,5,7,9,0};
	
	int aranacak=10;
	
	boolean varMı=false;
	
	for(int i=0;i<numbers.length;i++) {
		
		if(numbers[i]==aranacak) {
			
			varMı=true;
			break;
						
		}
		
	      
	}
	
	if(varMı) {
		System.out.println("Girilen Değer dizide var.");
	}else {System.out.println("Girilen değer dizide yok.");}
	
	}

}
