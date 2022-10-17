package kullanıcıdanSayıAlmaVeSayılarıToplamaÇıkarmaÇarpmaBölme;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Main {

	public static void main(String[] args) {
		
		
		 DortIslem dortIslem=new DortIslem();
		 
		 Scanner numbers=new Scanner(System.in);
		 
		 System.out.println("Birinci sayıyı giriniz:");
		 int number1 = numbers.nextInt();
		 
		 System.out.println("İkinci sayıyı giriniz:");
		 int number2 = numbers.nextInt();

		 
		 System.out.println("Yapmak istediğiniz işlemi seçiniz:"+"<br>"+"A=Toplama"+"<br>"+"B=Çıkarma"+"<br>"+"C=Çarpma"+"<br>"+"D=Bölme");
		 String value=numbers.next();
				 
		 
		 
		 
		if(value=="A") {
			int toplam=dortIslem.Topla(number1, number2);
			System.out.println(toplam);
		}else if(value=="C"){
			int cıkarma=dortIslem.Cikar(number1, number2);
			System.out.println(cıkarma);
			}
		
	      else if(value=="D") {
			int carpma =dortIslem.Carp(number1, number2);
			System.out.println(carpma);
          		
		}else if(value=="B") {
			int bölme=dortIslem.Bölme(number1, number2);
			System.out.println(bölme);
		}
		
		 
}

}
