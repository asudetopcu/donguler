import java.util.Scanner;
public class DongulerIleIslemler2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sum=0;
		int n;
		do {
			System.out.println("Sayý Giriniz:");
			n =input.nextInt();
			if(n%2==0 && n%4==0) {
				sum+=n;
			}
				
		}while(n%2==0);
		System.out.println("Toplam: "+ sum);

	}

}
