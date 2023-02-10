package LaçosCondicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		
		int n1;
		
		Scanner leia = new Scanner (System.in);
		

        System.out.println("Digite um numero:");
        n1 = leia.nextInt();
        
        if (n1 %2==0) {
        	if(n1>0) {
        		System.out.println("\nSeu numero é par e positivo");
        	}else {
        		System.out.println("\nSeu numero é par e negativo");
        	
        	}
        }else	{
        	if(n1>0) {
        	System.out.println("\nSeu numero é impar e positivo");
            }else {
        	System.out.println("\nSeu numero é impar e negativo");
        	}
        }
        
	}

}
	
