package DesenvolvimentoJava;

import java.util.Scanner;

public class Exercicio3DoWhile {
	
	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		
		int x,soma=0,pos=0;
		
			do
			{
			System.out.println("\nDigite um número (Para sair aperte o 0): ");
			x=leia.nextInt();
			
			if(x>0)
			{
				soma=x+soma;
				pos++;
			}
						
		}while(x!=0);
			System.out.println("\nA soma dos numeros positivos é: "+soma);
	}
	
}
