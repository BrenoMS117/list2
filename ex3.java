package list2;
import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		Scanner scam=new Scanner(System.in);
		//Crie um algoritmo que leia o nome do aluno, suas 4 notas, calcule a média e
		//classifique o resultado conforme a tabela abaixo. Ao final, deverão ser
		//exibidos o nome do aluno, suas 4 notas, sua média e sua classificação.
		//Média Classificação
		//Abaixo de 20 (inclusive) Péssimo
		//Maior que 20 e menor que 40 (inclusive) Ruim
		//Maior que 40 e menor que 60 (inclusive) Regular
		//Maior que 60 e menor que 80 (inclusive) Bom
		//Acima de 80 Ótimo
		String nome;
		double n1,n2,n3,n4,m;
		System.out.println("insira o nome do aluno");
		nome= scam.nextLine();
		System.out.println("insira as 4 notas do aluno");
		n1=scam.nextDouble();
		n2=scam.nextDouble();
		n3=scam.nextDouble();
		n4=scam.nextDouble();
		m=(n1+n2+n3+n4)/4;
		System.out.println("Aluno: "+nome);
		System.out.println("Nota:  "+n1);
		System.out.println("Nota:  "+n2);
		System.out.println("Nota:  "+n3);
		System.out.println("Nota:  "+n4);
		System.out.println("media: "+m);
		if(m<=20) {
			System.out.println("\u001B[31mClassifiação pessimo");
		}else if(m<=40) {
			System.out.println("\u001B[31mClassifiação ruim");
		}else if(m<=60) {
			System.out.println("\u001B[33mClassifiação regular");
		}else if(m<=80) {
			System.out.println("\u001B[32mClassifiação bom");
		}else {
			System.out.println("\u001B[32mClassifiação otimo");
			
		}
		
		
		
		
		}

	}


