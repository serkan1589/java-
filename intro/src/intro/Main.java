package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		String ortaMetin="İlginizi çekebilir.";
		
		String altMetin="Vade Süresi";
		
		System.out.println(ortaMetin);
		
		System.out.println(altMetin);
		
		Integer vade=12;
		
		int vade5=8;
		
		System.out.println(vade);
		
		System.out.println(vade5);
		
		double dolarBugun=18.25;
		double dolarDün=18.25;
		
		
		
		boolean dolarDustuMu=false;
		String okyonu="";
		
		if(dolarBugun<dolarDün) {
			okyonu="down.swg";
			System.out.println(okyonu);
			
		}else if(dolarBugun>dolarDün) {
			okyonu="up.swg";
			System.out.println(okyonu);
			
			
		}
	
		else {
			okyonu="equal.swg";
			System.out.println(okyonu);
			
		}
		
		
		
		
		//array
		String [] krediler= {"kredi","Mutlu","aplarta"};
		
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
