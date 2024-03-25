package list2;
import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		Scanner scam=new Scanner(System.in);
		//Crie um algoritmo que leia dois números e informe qual deles é o maior.
		//Informe também caso os números sejam iguais.
		int n1,n2;
		System.out.println("informe dois numeros");
		n1= scam.nextInt();
		n2= scam.nextInt();
		if(n1>n2) {
			System.out.println(n1+" é maior que "+n2);
		}else {
			System.out.println(n2+" é maior que "+n1);
			
		}
	}

}
