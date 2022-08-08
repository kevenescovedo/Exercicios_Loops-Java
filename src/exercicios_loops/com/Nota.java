package exercicios_loops.com;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     int nota;
    while(true) {
    System.out.println("Digite a sua nota: ");
    nota = scan.nextInt();
    if(nota >= 0 && nota <= 10) {
    	 System.out.println(" A sua nota é " + nota);
    	 break;
    }
    else {
    	 System.out.println("Nota inválida");
    	
    }
    }
	}
	

}
