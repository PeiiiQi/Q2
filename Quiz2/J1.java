package Q2;
import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {


			outsideloop:for(int j=1 ;j<=3;j++) { 

			insideloop:for(int i=1;i<=3;i++) {

				System.out.print("�K�X��J����\n�п�J�K�X:");
				Scanner wrt = new Scanner(System.in);
				int setpass1=wrt.nextInt();

				if ( setpass1 < 0 || setpass1 > 9999 ){
					System.out.println("�K�X����|����;��J�榡���~\n");
					break ;
				}

System.out.print("�ЦA�@����J�K�X:");
Scanner wrti = new Scanner(System.in);
int setpass2=wrti.nextInt();

if ( setpass2 < 0 || setpass2 > 9999 ){
System.out.println("�K�X����|����;��J�榡���~\n");
break;
}

 
else if (setpass1==setpass2){
System.out.print("�K�X���T");
break outsideloop;
} 

else if (setpass1 !=setpass2){
System.out.print("�P�Ĥ@����J�����P!\n");

if (j==3) {
System.out.println("EROR");
break outsideloop;
}
}

 



}

}


}
}