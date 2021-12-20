package Q2;
import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {


			outsideloop:for(int j=1 ;j<=3;j++) { 

			insideloop:for(int i=1;i<=3;i++) {

				System.out.print("密碼輸入測試\n請輸入密碼:");
				Scanner wrt = new Scanner(System.in);
				int setpass1=wrt.nextInt();

				if ( setpass1 < 0 || setpass1 > 9999 ){
					System.out.println("密碼限制為四位整數;輸入格式錯誤\n");
					break ;
				}

				System.out.print("請再一次輸入密碼:");
				Scanner wrti = new Scanner(System.in);
				int setpass2=wrti.nextInt();

				if ( setpass2 < 0 || setpass2 > 9999 ){
					System.out.println("密碼限制為四位整數;輸入格式錯誤\n");
					break;
				}

 
				else if (setpass1==setpass2){
					System.out.print("密碼正確");
					break outsideloop;
				} 

				else if (setpass1 !=setpass2){
					System.out.print("與第一次輸入的不同!\n");

					if (j==3) {
						System.out.println("EROR");
						break outsideloop;
					}
				}

 

			}

			}


	}
}
