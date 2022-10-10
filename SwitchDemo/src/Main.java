
public class Main {

	public static void main(String[] args) {

		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel:Geçtiniz");
			break;
		case 'B':
			System.out.println(" Çok İyi :Geçtiniz");
			break;
		case 'C':
			System.out.println("iyi: geçtiniz");
			break;
		case 'D':
			System.out.println("Sorumlu: geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldınız.");
			break;
		default:
			System.out.println("Geçersiz Değer Girdiniz.");

		}

	}

}
