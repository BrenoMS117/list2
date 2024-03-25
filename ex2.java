package list2;
import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		Scanner scam=new Scanner(System.in);
		//Crie um algoritmo que leia 3 números e informe qual o menor.
		int n1,n2,n3,aux;
		System.out.println("informe 3 numeros");
		n1=scam.nextInt();
		n2=scam.nextInt();
		n3=scam.nextInt();
		if(n3<n1) {
			aux=n1;
			n1=n3;
			n3=aux;
		}
		if(n3<n2) {
			aux=n2;
			n2=n3;
			n3=aux;
		}
		if(n2<n1) {
			aux=n1;
			n1=n2;
			n2=aux;
			
		}
		System.out.println("o menor numero é "+n1);
		}
		

	}


