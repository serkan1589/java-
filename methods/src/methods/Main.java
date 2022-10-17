package methods;

public class Main {

	public static void main(String[] args) {

		sayıBulma();

	}

	public static void sayıBulma() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 7, 9, 0 };

		int aranacak = 5;

		boolean varMı = false;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == aranacak) {

				varMı = true;
				break;

			}

		}

		if (varMı) {
			mesajVer(aranacak);
		} else {
			System.out.println("Girilen değer dizide yok."+aranacak);

		}

	}
	
	public static void mesajVer(int aranacak) {
		
		System.out.println("Girilen değer dizide yok."+aranacak);
		
	}
	
	
	

}
