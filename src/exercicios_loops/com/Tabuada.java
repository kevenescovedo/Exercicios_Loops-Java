package exercicios_loops.com;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int i = 0;
		// TODO Auto-generated method stub
	 System.out.println("--------------------------------------------------");	
     System.out.println("TABUADA");
     System.out.println("--------------------------------------------------");
     System.out.println("Você quer a Tabuada de Qual Número: ");
     numero = scan.nextInt();
     System.out.println("Tabuada do " + numero);
     do {
     System.out.println(numero + " X " + i + " = " + (numero * i));	 
     i++;	 
     }while(i <= 10);
     
     
     
     
     
     
	}

}
