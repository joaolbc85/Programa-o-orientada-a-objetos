package lista_1;
import java.util.Scanner;

//Questão: Diferenciar dentre 3 números, qual é o maior e qual é o menor.

public class diferenciar {
	private double numero1;
	private double numero2;
	private double numero3;
	
	public diferenciar(double numero1, double numero2, double numero3) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
	}
	
	double maior() {
		double maior = 0;
		
		if(numero1 > numero2 && numero1 > numero3) {
			maior = numero1;
		} else if(numero2 > numero1 && numero2 > numero3) {
			maior = numero2;
		} else if(numero3 > numero1 && numero3 > numero1) {
			maior = numero3;
		}
		return maior;
		
	}
	
	double menor() {
		double menor = 0;
		if(numero1 < numero2 && numero1<numero3) {
			menor = numero1;
		} else if(numero2 < numero1 && numero2 < numero3) {
			menor = numero2;
		} else if(numero3 < numero1 && numero3 < numero2) {
			menor = numero3;
		}
		return menor;
	}
	
	
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Diga seu primeiro número: ");
		double numero1 = teclado.nextDouble();
		
		System.out.print("Diga seu segundo número: ");
		double numero2 = teclado.nextDouble();
		
		System.out.print("Diga seu terceiro número: ");
		double numero3 = teclado.nextDouble();
		
		diferenciar Numeros = new diferenciar(numero1, numero2, numero3);
		
		double maiorNumero = Numeros.maior();
		double menorNumero = Numeros.menor();
		
		System.out.print("Maior: " + maiorNumero);
		System.out.print("\nMenor: " + menorNumero);
		
		
		teclado.close();
	}
	
}
