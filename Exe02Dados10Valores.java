package br.com.generation.vetores.matrizes;

import java.util.Random;

public class Exe02Dados10Valores {
	
	public static void main(String[] args) {
		/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor 
		 * com os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos,
		 *  contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.*/

		Random sorteio = new Random();

		int[] Valordados = new int[10];
		int maiorNum = 0, media = 0, QuantidadesJogadas = 0;

		System.out.println("\n Os n�meros selecionados foram: ");

		for (int i = 0; i < 10; i++) {
			Valordados[i] = sorteio.nextInt(5) + 1;
			media = media + Valordados[i];
			if (Valordados[i] > maiorNum) {
				maiorNum = Valordados[i];
			}
			System.out.println();
			System.out.println(i + 1 + "O n�mero sorteado foi: " + Valordados[i]);
		}
		for (int i = 0; i < 10; i++) {
			if (Valordados[i] == maiorNum) {
				QuantidadesJogadas++;
			}
		}
			
			System.out.println("A m�dia aritm�tica �: " + media / 10);
			System.out.println("O maior n�mero foi: " + maiorNum + " e ele foi jogado " + QuantidadesJogadas + " vezes!");
		
	}

}
		



