package DesenvolvimentoJava;

import java.util.Scanner;

public class Exercicio1For {
	public static void main(String[] args) {
		
		Scanner leia=new Scanner (System.in);
		int num,x=1,contPar=0,contImpar=0;
		
		for(x=0;x<10;x++) {
			System.out.println("\nEntre com um número qualquer: ");
			num=leia.nextInt();
			
			if(num%2==0)
			{
				contPar++;
			}else {
				contImpar++;
			}
		}
			System.out.println("\nQuantidade de numeros pares foi de: "+contPar);
			System.out.println("\nQuantidade de numeros impares foi de: "+contImpar);
	}
}