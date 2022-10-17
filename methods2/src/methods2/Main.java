package methods2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugun hava çok güzel.";

		String yeniMesaj = mesaj.substring(0, 2);

		System.out.println(yeniMesaj);

		int number = topla(5, 7);
		System.out.println(number);

		int toplam = topla2(2, 3, 1, 24, 5, 5, 3, 2);//Variable arguments
		System.out.println(toplam);
	}

	public static void ekle() {

		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncelle");
	}

	public static int topla(int number1, int number2) {
		return number1 + number2;
	}

	public static int topla2(int... numbers) {

		int toplam = 0;
		for (int sayi : numbers) {
			toplam += sayi;

		}
		return toplam;

	}

	public static String sehirVer() {
		return "ankara";
	}

}
