import java.util.Scanner;
public class DongulerIleIslemler {

	public static void main(String[] args) {
		
		int toplam=0, say�= -1;
		Scanner input = new Scanner(System.in);
		System.out.println("Bir say� giriniz.");
		int k=input.nextInt();
		
		for(int i=0; i<k; i++) {
			if ((i%12==0)) {
				toplam+=i;
				say�++;
				System.out.println(i);
			}
		}
		double ort = toplam/say�;
		System.out.println("Ortalam: " +ort);
	}

}
