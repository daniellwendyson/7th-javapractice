package atividade7;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		// 01 - Escreva um programa que ir� solicitar do usu�rio 4 n�meros e mostre cada posi��o.

		
		int[] num = new int[4];
		
		for(int c = 0; c < num.length; c++) {
			System.out.print("digite um valor: ");
			num[c] = entrada.nextInt();
		}
		
		for(int c = 0; c < num.length; c++) {
			System.out.println("valor: " + num[c] + "\nposi��o: " + c);
		}
		
		
		// 02 - Escreva um programa que recebe uma lista de 5 elementos, em seguida altere a lista
		// multiplicando todos os n�meros pares por 3 e somando 1 aos n�meros �mpares. Mostre a lista
		// alterado e de ordem inversas.
		
		int[] nums = new int[5];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("digite um valor: ");
			nums[i] = entrada.nextInt();
			if (nums[i] % 2 == 0) {
				nums[i] *= 3;
			}else {
				nums[i] += 1;
			}
		}
		
		System.out.println("valores alterados e com ordem inversa: ");
		for (int i = 4; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
		
		
		// 03 � Crie dois arrays com a mesma quantidade de elementos. Posteriormente, realize a soma de
		// todos os resultados da multiplica��o entre os elementos dos dois arrays. 
		
		
		System.out.print("\ndigite a quantidade de n�meros [MAX 10]: ");
		int qtd = entrada.nextInt();
		
		int[] Array1 = new int [10];
		int[] Array2 = new int [10];
		int mut = 0;
		int soma = 0;
		
		
		for(int j=1; j <= qtd; j++) {
			System.out.print("digite o " + j + "� n�mero do vetor X: ");
			Array1[j] = entrada.nextInt();
		}
		
		for(int j=1; j <= qtd; j++) {
			System.out.print("digite o "+ j + "� n�mero do vetor Y: ");
			Array2[j] = entrada.nextInt();
		}
		
		System.out.println("a multiplica��o dos vetores �: ");
		for(int j=1; j <= qtd; j++) {
			System.out.println(Array1[j] + " * " + Array2[j] + " = " + Array1[j] * Array2[j]);
			mut = Array1[j] * Array2[j];
			soma += mut;
		}
		
		System.out.println("o valor da soma dos elementos �: " + soma);
		
		
		// 04 - Crie um vetor que ir� receber do usu�rio:
		// 	� 10 valores, que devem ser inteiros, positivos e maiores que zero.
		//	� Posteriormente solicite um outro valor que ser� utilizado como comparativo.
		//	O objetivo final � que ap�s preencher o array com 10 valores, o programa seja capaz de informar quantos
		//	n�meros no array s�o maiores que X, menores que X e iguais a X.
		
		int[] Array = new int[10];
		int somamaior = 0;
		int iguais = 0;
		int menores = 0;
		
		for (int i = 0; i < Array.length; i++) {
			System.out.print("digite o " + (i+1) + "� n�mero do vetor: ");
			Array[i] = entrada.nextInt();
		}
		
		System.out.print("digite o n�mero comparativo: ");
		int comp = entrada.nextInt();
		
		System.out.println("n�meros maiores que o n�mero comparativo: ");
		for (int i = 0; i < Array.length; i++) {
			if(Array[i] > comp) {
				System.out.println(Array[i]);
				somamaior += 1;
			}if (Array[i] == comp) {
				iguais += 1;
			}if (Array[i] < comp) {
				menores += 1;
			}
		}
		
		System.out.print("maiores: " + somamaior);
		System.out.print("\niguais: " + iguais);
		System.out.print("\nmenores: " + menores + "\n");
		
		// 05 - Desenvolva um programa que ir� ser utilizado na sele��o de candidatas para uma campanha
		// publicit�ria.
		// O programa dever� receber os nomes e as respectivas idades de cada candidata. Ao todo, ser�o 10
		// candidatas.
		// Para serem aprovados devem possuir entre 18 e 20 anos de idade.
		
		String[] nome = new String[10];
		int[] idade = new int[10];
		
		for (int i = 0; i < nome.length; i++) {
			System.out.print("digite o nome da " + (i+1) + "� candidata: ");
			nome[i] = entrada.next();
			System.out.print("digite a idade da " + (i+1) + "� candidata: ");
			idade[i] = entrada.nextInt();
		}
		
		System.out.println("candidatas aptas: ");
		for (int i = 0; i < idade.length; i++) {
			if ((idade[i] >= 18) && (idade[i] <= 20)) {
				System.out.println("nome: " + nome[i] + "   idade: " + idade[i]);
			}
		}
		
	}

}
