package exercicios_loops.com;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    int qtd;
    int qtdPares = 0;
    int qtdImpares = 0;
    System.out.println("-------------------------------------------------------");
    System.out.println("Quantidade de números Pares e Impares");
    System.out.println("-------------------------------------------------------");
    System.out.println("Digite a quantidade de números que você vai digitar: ");
    qtd = scan.nextInt();
    for(int i = 1; i <= qtd; i++)  {
    	 System.out.println("Digite o " + i + "º Número");	
    	 int n = scan.nextInt();
    if(n % 2 == 0) 	 
       ++qtdPares;
    else
    	++qtdImpares;
     
  
    }
    System.out.println("Tem " + qtdPares + "e " + qtdImpares + "Impares");
    
    
	}

}
