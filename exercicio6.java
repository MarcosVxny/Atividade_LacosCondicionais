package LaçosCondicionais;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int cod;
	   float n1, n2, resul;
	   
	   Scanner leia = new Scanner(System.in);
	    
		
        System.out.println("\nDigite o primeiro numero: ");
        n1 = leia.nextFloat();
        System.out.println("\nDigite o segundo numero: ");
        n2 = leia.nextFloat();
        
        System.out.println("|    CODIGO    |      OPERAÇAO     |");                                                                  
		System.out.println("|      1       |        Soma       |");
		System.out.println("|      2       |      Subtraçao    |");
		System.out.println("|      3       |    Multiplicaçao  |");
		System.out.println("|      4       |       Divisao     |");
        cod = leia.nextInt();
		
		switch (cod) {
		case 1:
			resul = n1+n2;
			System.out.printf("\n%.1f+%.1f=%.1f",n1,n2,resul);
			
			break;
			
		case 2:
			resul = n1-n2;
			System.out.printf("\n%.1f-%.1f=%.1f",n1,n2,resul);
			
			break;
			
		case 3:
			resul = n1*n2;
			System.out.printf("\n%.1f*%.1f=%.1f",n1,n2,resul);
			
			break;
			
		case 4:
			resul = n1/n2;
			System.out.printf("\n%.1f/%.1f=%.1f",n1,n2,resul);
			
			break;
			 
		}
		
	
		
	   
	   

	}

}
