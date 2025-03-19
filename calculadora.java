package Calculos;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//CADASTRO DOS VALORES
		System.out.println("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite a operação ( + , - , * , / ): ");
		char operacao = sc.next().charAt(0);
		
		System.out.println("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		
		double resultado = 0;
		
		//FUNÇÃO 'IF' CONFORME O SINAL
		if(operacao == '+') {
			resultado = num1 + num2;
		}else if (operacao == '*'){
			resultado = num1 * num2;
		}else if(operacao == '-'){
			resultado = num1 - num2;
		}else if(operacao == '/'){
			resultado = num1 / num2;
		}else {
			System.out.println("Erro! Opeção inválida.");
			return;
		}
		System.out.printf("O resultado é: %.2f%n", resultado);
	}
}
