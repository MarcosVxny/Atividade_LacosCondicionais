package LaçosCondicionais;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cod, quant;
		float valor;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("|    CODIGO    |      OPERAÇAO    |   Preço Unitário   |");                                                                  
		System.out.println("|      1       |  Cachorro Quente   |     R$ 10.00       |");
		System.out.println("|      2       |  X-Salada          |     R$ 15.00       |");
		System.out.println("|      3       |  X-Bacon           |     R$ 18.00       |");
		System.out.println("|      4       |  Bauru             |     R$ 12.00       |");
		System.out.println("|      5       |  Refrigerante      |     R$ 8.00        |");
		System.out.println("|      6       |  Suco de laranja   |     R$ 13.00       |");
		cod = leia.nextInt();
		System.out.println("\nDigite a quantidade de produtos: ");
		quant = leia.nextInt();
		
		switch(cod) {
		case 1:
			valor = quant *10;
			System.out.println("\nProduto: Cachorro Quente - Valor a pagar: "+valor);
		break;
		case 2:
			valor = quant *15;
			System.out.println("\nProduto: X-Salada - Valor a pagar: "+valor);
			break;
		case 3:
			valor = quant *18;
			System.out.println("\nProduto: X-Bacon - Valor a pagar: "+valor);
			break;
		case 4:
			valor = quant *12;
			System.out.println("\nProduto: Bauru - Valor a pagar: "+valor);
			break;
		case 5:
			valor = quant *8;
			System.out.println("\nProduto: Refrigerante - Valor a pagar: "+valor);
			break;
		case 6:
			valor = quant *13;
			System.out.println("\nProduto: Suco de laranja - Valor a pagar: "+valor);
			break;
			default:
				System.out.println("\nOpção Inválida");
		}

	}
}