package exercicios_loops.com;

import java.util.Scanner;

public class MaiorMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    int incriment = 1;
    int maiorNumero = 0;
   
    int soma = 0;
    int valorDigitado;
    
    while(incriment <= 5) {
    System.out.println("Digite um valor númerico: ");	
    valorDigitado = scan.nextInt();
    if(valorDigitado >= maiorNumero ) {
    	maiorNumero = valorDigitado;
    }
    soma += valorDigitado;
    incriment ++;
    }
    
    System.out.println("Media: " +( (double) soma / 5));
    System.out.println("Maior Número: " + maiorNumero);
    
    
	}

}
