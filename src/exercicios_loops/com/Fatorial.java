package exercicios_loops.com;
import java.util.Scanner;

public class Fatorial {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 int n = 0;
	 int fatorial = 0;
System.out.println("--------------------------------------------------------");
	 System.out.println("                  FATORIAL                         ");
 System.out.println("-----------------------------------------------------");
 System.out.println("Qual número você deseja fatorar: ");
 n = scan.nextInt();
 fatorial = n;
 for (int x = n;  x > 1; --x) {
	 
	 fatorial *= (x - 1);
	
 
 }
 System.out.println("O Fatorial de " + n + " é " + fatorial);
 
 
 }
} 