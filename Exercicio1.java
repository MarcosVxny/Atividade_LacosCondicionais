package LaçosCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro numero");
		n1 = leia.nextInt();
		
		System.out.println("\nDigite o Segundo numero");
		n2 = leia.nextInt();
		
		System.out.println("\nDigite o terceiro numero");
		n3 = leia.nextInt();
		

		
		System.out.println("\nSeu resultado foi de: ");
		
	      if(n1+n2>n3) {
			System.out.println ("\nA Soma de A + B é Maior do que C");
			
		}else if(n1+n2<n3) {
			System.out.println("\nA Soma de A + B é Menor do que C");
			
		}else if(n1+n2==n3) {
			System.out.println("\nA Soma de A + B é igual a C");
		}
		
	     
		
		
			}
}