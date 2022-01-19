import java.util.Scanner;
public class DongulerIleIslemler {

	public static void main(String[] args) {
		
		int toplam=0, sayý= -1;
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayý giriniz.");
		int k=input.nextInt();
		
		for(int i=0; i<k; i++) {
			if ((i%12==0)) {
				toplam+=i;
				sayý++;
				System.out.println(i);
			}
		}
		double ort = toplam/sayý;
		System.out.println("Ortalam: " +ort);
	}

}
