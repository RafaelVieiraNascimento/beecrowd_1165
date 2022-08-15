package program;

/*
beecrowd | 1165 - Número Primo

Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 (um)
e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro
N (1 ≤ N ≤ 100), indicando o número de casos de teste da entrada. Cada uma das N linhas
seguintes contém um valor inteiro X (1 < X ≤ 107), que pode ser ou não, um número primo.

Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao eh primo”,
de acordo com a especificação fornecida.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n != 0) {
		
			int x = sc.nextInt();
			int soma =0;
			
			for(int i = 1; i <= x; i++) if(x % i == 0) soma++;
				
			if(soma == 2) System.out.println(x + " eh primo");
			
			else System.out.println(x + " nao eh primo");
			
			n--;
		}
		sc.close();
	}
}