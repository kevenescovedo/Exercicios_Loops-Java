package exercicios_loops.com;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class ExercicioNomeIdade {
 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 String nome;
		 int idade;
		 boolean continua = true;
	/*	while(continua) {
			System.out.println("Digite o Nome (Digite 0 para parar): ");
			nome = scan.next();
			if(nome.equals("0")) {
				continua = false;
				System.out.println("Programa Parou!!!!!!");
			}
			else {
				System.out.println("Digite a idade: ");
				idade = scan.nextInt();
				System.out.println(nome);
				System.out.println(idade);
			}
		} */
		 
			while(true) {
				System.out.println("Digite o Nome (Digite 0 para parar): ");
				nome = scan.next();
				if(nome.equals("0")) {
				
					System.out.println("Programa Parou!!!!!!");
					break;
				}
				
					System.out.println("Digite a idade: ");
					idade = scan.nextInt();
					System.out.println(nome);
					System.out.println(idade);
				
			}
	}

}
